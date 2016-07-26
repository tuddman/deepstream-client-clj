(use 'clojure.test)

(Given #"^the test server is ready$" []
  (comment  Write code here that turns the phrase above into concrete actions  )
  (assert (= 2 (+ 1 1)))
  (throw (cucumber.api.PendingException.)))

(Then #"^the server has (\d+) active connections$" [arg1]
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(Given #"^the client is initialised$" []
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(Then #"^the clients connection state is \"([^\"]*)\"$" [arg1]
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(Given #"^the client logs in with username \"([^\"]*)\" and password \"([^\"]*)\"$" [arg1 arg2]
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(Given #"^the server sends the message A|A\+$" []
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(Given #"^the server resets its message count$" []
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(When #"^the client subscribes to an event named \"([^\"]*)\"$" [arg1]
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(When #"^the server sends the message E|A|S|test(\d+)\+$" [arg1]
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(Then #"^the server received the message E|S|test(\d+)\+$" [arg1]
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(Then #"^the server has received (\d+) messages$" [arg1]
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(Given #"^the client subscribes to an event named \"([^\"]*)\"$" [arg1]
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(Then #"^the last message the server recieved is E|S|test(\d+)\+$" [arg1]
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(Given #"^the server sends the message E|A|S|test(\d+)\+$" [arg1]
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(When #"^the client listens to events matching \"([^\"]*)\"$" [arg1]
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(Then #"^the last message the server recieved is E|L|eventPrefix/\.\*\+$" []
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(Given #"^the server sends the message E|A|L|eventPrefix/\.\*\+$" []
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(When #"^the connection to the server is lost$" []
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(Given #"^two seconds later$" []
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(Then #"^the client throws a \"([^\"]*)\" error with message \"([^\"]*)\"$" [arg1 arg2]
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(When #"^the client publishes an event named \"([^\"]*)\" with data \"([^\"]*)\"$" [arg1 arg2]
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(Then #"^the server did not recieve any messages$" []
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(When #"^the connection to the server is reestablished$" []
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(Then #"^the server received the message E|L|eventPrefix/\.\*\+$" []
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(Then #"^the server received the message E|EVT|test(\d+)|SyetAnotherValue\+$" [arg1]
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(When #"^some time passes$" []
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(When #"^the client unlistens to events matching \"([^\"]*)\"$" [arg1]
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(Then #"^the last message the server recieved is E|UL|eventPrefix/\.\*\+$" []
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(Given #"^the server sends the message E|SP|eventPrefix/\.\*|eventPrefix/foundAMatch\+$" []
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(Then #"^the client will be notified of new event match \"([^\"]*)\"$" [arg1]
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(Given #"^the server sends the message E|SR|eventPrefix/\.\*|eventPrefix/foundAMatch\+$" []
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(Then #"^the client will be notified of event match removal \"([^\"]*)\"$" [arg1]
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(Given #"^the server sends the message E|A|UL|eventPrefix/\.\*\+$" []
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(Given #"^the client throws a \"([^\"]*)\" error with message \"([^\"]*)\"$" [arg1 arg2]
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(Given #"^some time passes$" []
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(When #"^the client unsubscribes from an event named \"([^\"]*)\"$" [arg1]
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(Then #"^the server received the message E|US|test(\d+)\+$" [arg1]
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(When #"^the server sends the message E|EVT|test(\d+)|SsomeValue\+$" [arg1]
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(Then #"^the client received the event \"([^\"]*)\" with data \"([^\"]*)\"$" [arg1 arg2]
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(When #"^the server sends the message E|EVT|test(\d+)|SanotherValue\+$" [arg1]
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(Given #"^the server sends the message E|A|US|test(\d+)\+$" [arg1]
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(When #"^the client logs in with username \"([^\"]*)\" and password \"([^\"]*)\"$" [arg1 arg2]
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(Then #"^the last message the server recieved is A|REQ|{\"([^\"]*)\":\"([^\"]*)\",\"([^\"]*)\":\"([^\"]*)\"}\+$" [arg1 arg2 arg3 arg4]
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(When #"^the server sends the message A|A\+$" []
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(Then #"^the last login was successful$" []
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(When #"^the server sends the message A|E|INVALID_AUTH_MSG|Sinvalid authentication message\+$" []
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(Then #"^the last login failed with error \"([^\"]*)\" and message \"([^\"]*)\"$" [arg1 arg2]
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(When #"^the server sends the message A|E|INVALID_AUTH_DATA|Sinvalid authentication data\+$" []
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(When #"^the server sends the message A|E|TOO_MANY_AUTH_ATTEMPTS|Stoo many authentication attempts\+$" []
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(When #"^the server sends the message I only have one part\+$" []
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(When #"^the server sends the message B|R\+$" []
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(When #"^the server sends the message R|XXX\+$" []
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(Given #"^the client creates a record named \"([^\"]*)\"$" [arg1]
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(When #"^the server sends the message R|A|S|mergeRecord\+$" []
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(When #"^the server sends the message R|R|mergeRecord|(\d+)|{\"([^\"]*)\":\"([^\"]*)\"}\+$" [arg1 arg2 arg3]
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(When #"^the server sends the message R|U|mergeRecord|(\d+)|{\"([^\"]*)\":\"([^\"]*)\"}\+$" [arg1 arg2 arg3]
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(When #"^the client sets the record \"([^\"]*)\" \"([^\"]*)\" to \"([^\"]*)\"$" [arg1 arg2 arg3]
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(When #"^the server sends the message R|E|VERSION_EXISTS|mergeRecord|(\d+)\+$" [arg1]
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(Then #"^the last message the server recieved is R|CR|connectionRecord\+$" []
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(Given #"^the server sends the message R|A|S|connectionRecord\+$" []
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(Given #"^the server sends the message R|R|connectionRecord|(\d+)|{\"([^\"]*)\":\"([^\"]*)\", \"([^\"]*)\": \[{\"([^\"]*)\":\"([^\"]*)\", \"([^\"]*)\":\"([^\"]*)\",\"([^\"]*)\":(\d+)}\]}\+$" [arg1 arg2 arg3 arg4 arg5 arg6 arg7 arg8 arg9 arg10]
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(When #"^the client listens to a record matching \"([^\"]*)\"$" [arg1]
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(Then #"^the last message the server recieved is R|L|recordPrefix/\.\*\+$" []
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(Given #"^the server sends the message R|A|L|recordPrefix/\.\*\+$" []
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(Then #"^the server received the message R|CR|connectionRecord\+$" []
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(Then #"^the server received the message R|L|recordPrefix/\.\*\+$" []
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(Then #"^the server received the message R|P|connectionRecord|(\d+)|pets\.(\d+)\.name|SMax\+$" [arg1 arg2]
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(When #"^the client unlistens to a record matching \"([^\"]*)\"$" [arg1]
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(Then #"^the last message the server recieved is R|UL|recordPrefix/\.\*\+$" []
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(Given #"^the server sends the message R|SP|recordPrefix/\.\*|recordPrefix/foundAMatch\+$" []
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(Then #"^the client will be notified of new record match \"([^\"]*)\"$" [arg1]
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(Given #"^the server sends the message R|SR|recordPrefix/\.\*|recordPrefix/foundAMatch\+$" []
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(Then #"^the client will be notified of record match removal \"([^\"]*)\"$" [arg1]
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(When #"^the client creates a record named \"([^\"]*)\"$" [arg1]
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(When #"^the server sends the message R|A|S|doubleRecord\+$" []
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(When #"^the server sends the message R|R|doubleRecord|(\d+)|{\"([^\"]*)\":\"([^\"]*)\", \"([^\"]*)\": \[{\"([^\"]*)\":\"([^\"]*)\", \"([^\"]*)\":\"([^\"]*)\",\"([^\"]*)\":(\d+)}\]}\+$" [arg1 arg2 arg3 arg4 arg5 arg6 arg7 arg8 arg9 arg10]
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(Then #"^the last message the server recieved is R|CR|doubleRecord\+$" []
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(Then #"^the last message the server recieved is R|CR|subscribeRecord\+$" []
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(When #"^the server sends the message R|A|S|subscribeRecord\+$" []
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(When #"^the server sends the message R|R|subscribeRecord|(\d+)|{\"([^\"]*)\":\"([^\"]*)\",\"([^\"]*)\":\[{\"([^\"]*)\":\"([^\"]*)\",\"([^\"]*)\":\"([^\"]*)\",\"([^\"]*)\":(\d+)}\]}\+$" [arg1 arg2 arg3 arg4 arg5 arg6 arg7 arg8 arg9 arg10]
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(When #"^the client subscribes to the entire record \"([^\"]*)\" changes$" [arg1]
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(Then #"^the client will not be notified of the record change$" []
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(When #"^the server sends the message R|U|subscribeRecord|(\d+)|{\"([^\"]*)\":\"([^\"]*)\",\"([^\"]*)\":\[{\"([^\"]*)\":\"([^\"]*)\",\"([^\"]*)\":\"([^\"]*)\",\"([^\"]*)\":(\d+)}\]}\+$" [arg1 arg2 arg3 arg4 arg5 arg6 arg7 arg8 arg9 arg10]
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(Then #"^the client will be notified of the record change$" []
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(When #"^the server sends the message R|P|subscribeRecord|(\d+)|pets\.(\d+)\.name|SRuffusTheSecond\+$" [arg1 arg2]
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(Then #"^the client will be notified of the partial record change$" []
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(Given #"^the client unsubscribes to the entire record \"([^\"]*)\" changes$" [arg1]
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(When #"^the client subscribes to \"([^\"]*)\" for the record \"([^\"]*)\"$" [arg1 arg2]
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(When #"^the server sends the message R|P|subscribeRecord|(\d+)|name|SJohn Smith\+$" [arg1]
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(When #"^the server sends the message R|U|subscribeRecord|(\d+)|{\"([^\"]*)\":\"([^\"]*)\", \"([^\"]*)\": (\d+), \"([^\"]*)\": \[{\"([^\"]*)\":\"([^\"]*)\", \"([^\"]*)\":\"([^\"]*)\",\"([^\"]*)\":(\d+)}\]}\+$" [arg1 arg2 arg3 arg4 arg5 arg6 arg7 arg8 arg9 arg10 arg11 arg12]
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(When #"^the server sends the message R|P|subscribeRecord|(\d+)|pets\.(\d+)\.age|N(\d+)\+$" [arg1 arg2 arg3]
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(Then #"^the client will be notified of the second record change$" []
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(Given #"^the client unsubscribes to \"([^\"]*)\" for the record \"([^\"]*)\"$" [arg1 arg2]
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(When #"^the server sends the message R|A|S|unhappyRecord\+$" []
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(When #"^the server sends the message R|R|unhappyRecord|(\d+)|{\"([^\"]*)\":\[\"([^\"]*)\"\]}\+$" [arg1 arg2 arg3]
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(When #"^the client sets the record \"([^\"]*)\" to {\"([^\"]*)\":\[\"([^\"]*)\"\]}$" [arg1 arg2 arg3]
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(Then #"^the last message the server recieved is R|U|unhappyRecord|(\d+)|{\"([^\"]*)\":\[\"([^\"]*)\"\]}\+$" [arg1 arg2 arg3]
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(When #"^the server sends the message R|E|CACHE_RETRIEVAL_TIMEOUT|unhappyRecord\+$" []
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(When #"^the server sends the message R|E|STORAGE_RETRIEVAL_TIMEOUT|unhappyRecord\+$" []
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(When #"^the client discards the record named \"([^\"]*)\"$" [arg1]
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(Then #"^the last message the server recieved is R|US|unhappyRecord\+$" []
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(Given #"^the server sends the message R|A|S|unhappyRecord\+$" []
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(Given #"^the server sends the message R|R|unhappyRecord|(\d+)|{\"([^\"]*)\":\[\"([^\"]*)\"\]}\+$" [arg1 arg2 arg3]
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(When #"^the client deletes the record named \"([^\"]*)\"$" [arg1]
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(Then #"^the last message the server recieved is R|D|unhappyRecord\+$" []
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(Then #"^the last message the server recieved is R|CR|happyRecord\+$" []
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(Given #"^the server sends the message R|A|S|happyRecord\+$" []
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(When #"^the server sends the message R|R|happyRecord|(\d+)|{\"([^\"]*)\":\"([^\"]*)\", \"([^\"]*)\": \[{\"([^\"]*)\":\"([^\"]*)\", \"([^\"]*)\":\"([^\"]*)\",\"([^\"]*)\":(\d+)}\]}\+$" [arg1 arg2 arg3 arg4 arg5 arg6 arg7 arg8 arg9 arg10]
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(Then #"^the client record \"([^\"]*)\" data is {\"([^\"]*)\":\"([^\"]*)\", \"([^\"]*)\": \[{\"([^\"]*)\":\"([^\"]*)\", \"([^\"]*)\":\"([^\"]*)\",\"([^\"]*)\":(\d+)}\]}$" [arg1 arg2 arg3 arg4 arg5 arg6 arg7 arg8 arg9 arg10]
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(When #"^the server sends the message R|P|happyRecord|(\d+)|pets\.(\d+)\.age|N(\d+)\+$" [arg1 arg2 arg3]
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(When #"^the server sends the message R|U|happyRecord|(\d+)|{\"([^\"]*)\":\"([^\"]*)\", \"([^\"]*)\": \[{\"([^\"]*)\":\"([^\"]*)\", \"([^\"]*)\":\"([^\"]*)\",\"([^\"]*)\":(\d+)}\]}\+$" [arg1 arg2 arg3 arg4 arg5 arg6 arg7 arg8 arg9 arg10]
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(Then #"^the last message the server recieved is R|P|happyRecord|(\d+)|pets\.(\d+)\.name|SMax\+$" [arg1 arg2]
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(When #"^the client sets the record \"([^\"]*)\" to {\"([^\"]*)\":\"([^\"]*)\",\"([^\"]*)\":\[{\"([^\"]*)\":\"([^\"]*)\",\"([^\"]*)\":\"([^\"]*)\",\"([^\"]*)\":(\d+)}\]}$" [arg1 arg2 arg3 arg4 arg5 arg6 arg7 arg8 arg9 arg10]
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(Then #"^the last message the server recieved is R|U|happyRecord|(\d+)|{\"([^\"]*)\":\"([^\"]*)\",\"([^\"]*)\":\[{\"([^\"]*)\":\"([^\"]*)\",\"([^\"]*)\":\"([^\"]*)\",\"([^\"]*)\":(\d+)}\]}\+$" [arg1 arg2 arg3 arg4 arg5 arg6 arg7 arg8 arg9 arg10]
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(Then #"^the last message the server recieved is R|US|happyRecord\+$" []
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(When #"^the server sends the message R|A|US|happyRecord\+$" []
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(Given #"^the server sends the message R|R|happyRecord|(\d+)|{\"([^\"]*)\":\"([^\"]*)\", \"([^\"]*)\": \[{\"([^\"]*)\":\"([^\"]*)\", \"([^\"]*)\":\"([^\"]*)\",\"([^\"]*)\":(\d+)}\]}\+$" [arg1 arg2 arg3 arg4 arg5 arg6 arg7 arg8 arg9 arg10]
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(Given #"^the client deletes the record named \"([^\"]*)\"$" [arg1]
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(Then #"^the last message the server recieved is R|D|happyRecord\+$" []
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(When #"^the server sends the message R|A|D|happyRecord\+$" []
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(When #"^the client provides a RPC called \"([^\"]*)\"$" [arg1]
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(Then #"^the last message the server recieved is P|S|toUppercase\+$" []
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(When #"^the server sends the message P|A|S|toUppercase\+$" []
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(Then #"^the server received the message P|S|toUppercase\+$" []
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(When #"^the server sends the message P|REQ|toUppercase|<UID>|Sabc\+$" []
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(Then #"^the last message the server recieved is P|A|toUppercase|<UID>\+$" []
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(Then #"^the client recieves a request for a RPC called \"([^\"]*)\" with data \"([^\"]*)\"$" [arg1 arg2]
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(When #"^the client responds to the RPC \"([^\"]*)\" with data \"([^\"]*)\"$" [arg1 arg2]
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(Then #"^the last message the server recieved is P|RES|toUppercase|<UID>|SABC\+$" []
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(When #"^the client responds to the RPC \"([^\"]*)\" with the error \"([^\"]*)\"$" [arg1 arg2]
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(Then #"^the last message the server recieved is P|E|An Error Occured|toUppercase|<UID>\+$" []
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(When #"^the client rejects the RPC \"([^\"]*)\"$" [arg1]
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(Then #"^the last message the server recieved is P|REJ|toUppercase|<UID>\+$" []
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(When #"^the server sends the message P|REQ|unSupported|<UID>|Sabc\+$" []
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(Then #"^the last message the server recieved is P|REJ|unSupported|<UID>\+$" []
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(When #"^the client stops providing a RPC called \"([^\"]*)\"$" [arg1]
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(Then #"^the last message the server recieved is P|US|toUppercase\+$" []
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(When #"^the server sends the message P|A|US|toUppercase\+$" []
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(When #"^the client requests RPC \"([^\"]*)\" with data \"([^\"]*)\"$" [arg1 arg2]
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(Then #"^the last message the server recieved is P|REQ|toUppercase|<UID>|Sabc\+$" []
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(When #"^the server sends the message P|A|REQ|<UID>\+$" []
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(When #"^the server sends the message P|RES|toUppercase|<UID>|SABC\+$" []
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(Then #"^the client recieves a successful RPC callback for \"([^\"]*)\" with data \"([^\"]*)\"$" [arg1 arg2]
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(When #"^the server sends the message P|E|RPC Error Message|toUppercase|<UID>\+$" []
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

(Then #"^the client recieves an error RPC callback for \"([^\"]*)\" with the message \"([^\"]*)\"$" [arg1 arg2]
  (comment  Write code here that turns the phrase above into concrete actions  )
  (throw (cucumber.api.PendingException.)))

