(defproject clojure-socket-echo "1.0.0-SNAPSHOT"
  :description "Example of using clojure.contrib.socket-server to make an echo server (as seen on StackOverflow: http://stackoverflow.com/questions/1223352/writing-a-multiplexing-server-in-clojure)"
  :dependencies [[org.clojure/clojure "1.3.0"]
                [server-socket "1.0.0"]]
  :dev-dependencies [[speclj "2.1.1"]]
  :main clojure-socket-echo.core)
