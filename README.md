# deepstream-client-clj

A [deepstream.io](https://www.deepstream.io) client, written in Clojure. 


## Version

[![Clojars Project](https://img.shields.io/clojars/v/tuddman/deepstream-client-clj.svg)](https://clojars.org/tuddman/deepstream-client-clj)

## Usage



```
(ns my.project
    :require [deepstream-client-clj.core :as ds])
```


#### Login and Authentication

Make sure a deepstream.io [server](https://github.com/deepstreamIO/deepstream.io) is running!

Establishing a client creates a TCP connection to a deepstream server and returns a duplex stream

`(def c (ds/client "localhost" 6021))`

`(ds/authenticate c)` or `(ds/authenticate c "Username" "password")` for named authentication

#### Events


`(ds/listen-to-event c "SomeEvent")`

`(ds/unlisten-from-event c "SomeEvent")`

`(ds/subscribe-to-event c "SomeEvent")`

`(ds/unsubscribe-from-event c "SomeEvent")`

`(ds/publish-event c "SomeEvent" {:a 1})`

note: the data `{:a 1}` to be published can be an arbitrarily deeply nested clojure map.  It must be comprised of native JS objects as it gets converted to stringified-JSON before sending to the server.

#### Records

`(ds/listen-to-record c "RecordPrefix")`

`(ds/unlisten-from-record c "RecordPrefix")`

`(ds/read-create-record c "RecordName")`

`(ds/update-entire-record c "RecordName" VersionNumber {:a 1})`

`(ds/patch-record c "RecordName" VersionNumber path value)`

`(ds/delete-record c "RecordName")`


#### Handling returned data | events from the server

`(ds/handle-incoming-msgs c handler-fn)`

note: the user-defined `handler-fn` has one paramater, `message`, which when passed as the argument processes each message as it arrives from the server. e.g:

```
;; example implementation of a handler-fn:
(defn my-handler [message]
    (println message))
```

---


RPCs are not yet implemented.

WebRTC may not get implemented (unless there is pitchfork-fervor level demand to build a ClojureScript client.. :)

Huge thanks to [@ztellman](https://github.com/ztellman) and others, for writing the great libraries that largely power this client.
And of course to the good folks at [deepstream](https://deepstream.io), for making a great product.

Pull Requests welcome

## License

Copyright © 2016 tuddman

Distributed under the MIT License (same as [deepstream.io](https://github.com/deepstreamIO/deepstream.io/blob/master/LICENSE))
