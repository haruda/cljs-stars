(defproject cljs-stars "0.1.0-SNAPSHOT"
  :plugins [[lein-cljsbuild "1.1.6"]]
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.9.562"]]
  :source-paths ["src/clj"]
  :main client-server.server
  :cljsbuild {
              :builds [{
                        :source-path "src/cljs"
                        :compiler {
                                   :output-to "resources/public/client.js"
                                   :optimizations :whitespace
                                   :pretty-print true}}]})