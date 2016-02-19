(ns deepstream-client-clj.constants)


(def actions {
  :A "ACK" 
  :R "READ" 
  :C "CREATE" 
  :U "UPDATE" 
  :P "PATCH" 
  :D "DELETE" 
  :S "SUBSCRIBE" 
  :US "UNSUBSCRIBE" 
  :I "INVOKE" 
  :SP "SUBSCRIPTION_FOR_PATTERN_FOUND" 
  :SR "SUBSCRIPTION_FOR_PATTERN_REMOVED" 
  :L "LISTEN" 
  :UL "UNLISTEN" 
  :PU "PROVIDER_UPDATE" 
  :Q "QUERY" 
  :CR "CREATEORREAD" 
  :EVT "EVENT" 
  :E "ERROR" 
  :REQ "REQUEST" 
  :RES "RESPONSE" 
  :REJ "REJECTION" 
})


(def ^:const message-seperator (char 30))
(def ^:const message-part-seperator (char 31)) 

(def connection-state #{ "CLOSED" "AWAITING_AUTHENTICATION" "AUTHENTICATING" "OPEN" "ERROR" "RECONNECTING" })

(def topics {:A "AUTH" :X "ERROR" :E "EVENT" :R "RECORD" :P "RPC" :W "WEBRTC" :PRIVATE "PRIVATE"})

(def types {:S "STRING" :O "OBJECT"  :N "NUMBER"  :L "NULL"  :T "TRUE"  :F "FALSE" :U "UNDEFINED" } )


