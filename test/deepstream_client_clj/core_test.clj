;; seek to roughly follow https://deepstream.io/info/messagestructure/events.html

(ns deepstream-client-clj.core-test
  (:require [clojure.test :refer :all]
            [deepstream-client-clj.core :refer :all]
            [manifold.deferred :as md] 
            [manifold.stream :as ms]  
            ))


(let [testc (client "0.0.0.0" 6021)]
 
  (deftest test-can-client-connect
    (testing "whether a client can connect to a TCP server."
      (is (= false? (nil? testc )))))


  (deftest can-client-authenticate
    (testing "whether a client can authenticate and receive auth ack from server."
       (md/let-flow [auth-request (authenticate testc "XXX" "YYY") 
                  auth-response (segment-msg @(ms/take! testc))]
         (is (= auth-response  ["A" "A"])))))


  (deftest can-client-subscribe-to-an-event
    (testing "whether a client can subscribe to an event and receive ack from server."
       (md/let-flow [subscribe-request (subscribe-to-event testc "SomeEvent")
             subscribe-response (segment-msg @(ms/take! testc)) ]
        (is (=  subscribe-response ["E" "A" "S" "SomeEvent"] ))) ))


  (deftest can-client-publish-event
    (testing "whether a client can publish an event and receive ack from server."
       (md/let-flow [event-request (publish-event testc "SomeEvent" {:a 1})
             event-response (segment-msg @(ms/take! testc)) ]
        (is (= event-response ["E" "A" "EVT" "SomeEvent"] )))  ))
   

  )

