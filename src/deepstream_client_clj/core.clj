(ns deepstream-client-clj.core
  "Main deepstream.io client library"
  (:gen-class)
  (:require 
    [aleph.tcp :as tcp] 
    [cheshire.core :as json] 
    [clojure.edn :as edn] 
    [clojure.string :as string] 
    [deepstream-client-clj.constants :as c]
    [gloss.core :as gloss] 
    [gloss.io :as gio] 
    [manifold.deferred :as md] 
    [manifold.stream :as ms]))



(def protocol 
  (gloss/string :ascii))


(defn- wrap-duplex-stream
  [protocol s]
  (let [out (ms/stream)]
    (ms/connect
      (ms/map #(gio/encode protocol %) out)
      s)
    (ms/splice
      out
      (gio/decode-stream s protocol))))


(defn client
  [host port]
  (md/chain (tcp/client {:host host :port port})
    #(wrap-duplex-stream protocol %)))


(defn encode-msg
  "takes a grouped string representing a message: e.g.'A|B|C' and 
   formats into deepstream.io's proprietary string-based protocol"
  [message]
  (-> (clojure.string/replace message \| c/message-part-seperator)
      (str c/message-seperator)) ) 


(defn send-msg
  [client msg]
  (ms/put! @client msg))
 

(defn segment-msg
  "takes a server-sent message and parses it into segments for further client processing"
  [message]
  (println "received -> " message)
  (let [segments (string/split (string/replace message c/message-part-seperator \|) #"\|")]
    (if (string/ends-with? (peek segments) (str c/message-seperator)  )
      (assoc segments (- (count segments) 1) (string/trimr (peek segments))  )
      segments)))


(defn authenticate
  ([client] (send-msg client (encode-msg  (str "A|REQ|" (json/generate-string {})))))
  ([client username password] (send-msg client (encode-msg (str "A|REQ|" (json/generate-string {:username username :password password}))))))


;; EVENTS

(defn listen-to-event
  [client event regex]
  (send-msg client (encode-msg (str "E|L|" event "/" regex))))


(defn unlisten-from-event
  [client event regex]
  (send-msg client (encode-msg (str "E|UL|" event "/" regex))))


(defn subscribe-to-event
  [client event]
  (send-msg client (encode-msg (str "E|S|" event))))


(defn unsubscribe-from-event
  [client event]
  (send-msg (encode-msg (str "E|US|" event))))


(defn publish-event
  [client event data]
  (send-msg client (encode-msg (str "E|EVT|" event "|S" (json/generate-string data)))))


;; Server Sent Event Messages
(defn event-listen-match [] ())
(defn event-listen-unmatched [] ())


;; RECORDS

(defn listen-to-record
  [client record-prefix]
  (send-msg client (encode-msg (str "R|L|" record-prefix "/.*"))))


(defn unlisten-from-record
  [client record-prefix]
  (send-msg client (encode-msg (str "R|UL|" record-prefix "/.*"))))


(defn read-create-record
  [client record-name] 
  (send-msg client (encode-msg (str "R|CR|" record-name))))


(defn update-entire-record
  [client record-name version data] 
  (send-msg (encode-msg (str "R|U|" record-name "|" version "|" data ))))


(defn patch-record
  [client record-name version path value] 
  (send-msg (encode-msg (str "R|P|" record-name "|" version "|" path "|" value ))))


(defn delete-record
  [client record-name] 
  (send-msg (encode-msg (str "R|D|" record-name ))))


;; Server sent Record Messages
(defn record-listen-match [] ())
(defn record-listen-unmatched [] ())
(defn receive-record-read [] ())
(defn cache-read-timeout [] ())
(defn database-read-timeout [] ())


(defn handle-incoming-msgs [client f]
  (md/loop []
    (md/chain (ms/take! @client ::drained)
      ;; if we got a message, run it through `f`
      (fn [msg]
        (if (identical? ::drained msg)
          ::drained
          (f msg)))
      ;; wait for the result from `f` to be realized, and
      ;; recur, unless the stream is already drained
      (fn [result]
        (when-not (identical? ::drained result)
          (md/recur))))))

