(defproject notebook "0.1.0-SNAPSHOT"
  :description "A place for my thoughts. It's in Clojure!"
  :url "https://github.com/alexguerra-dev/notebook"
  :license {:name "MIT"
            :url "https://mit-license.org"}
  :dependencies [[org.clojure/clojure "1.11.1"]]
  :main ^:skip-aot notebook.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})
