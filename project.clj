(defproject tomtau/datomic-cljs "0.0.1-alpha-1"
  :description "Datomic REST client for ClojureScript"
  :url "https://github.com/zachallaun/datomic-cljs"
  :license {:name "MIT" :url "http://opensource.org/licenses/MIT"}

  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/clojurescript "0.0-3308"]
                 [org.clojure/core.async "0.1.346.0-17112a-alpha"]]

  :profiles {:dev {:plugins [[lein-cljsbuild "1.1.3"]]}}

  :cljsbuild {:builds {:test
                       {:source-paths ["src" "test"]
                        :compiler {:target :nodejs
                                   :output-to "target/test.js"
                                   :optimizations :simple
                                   :pretty-print true}}

                       :browser-test
                       {:source-paths ["src" "test"]
                        :compiler {:output-to "target/browser-test.js"
                                   :optimizations :simple
                                   :pretty-print true}}

                       :example
                       {:source-paths ["src" "examples"]
                        :compiler {:target :nodejs
                                   :output-to "target/example.js"
                                   :optimizations :simple
                                   :pretty-print true}}}})
