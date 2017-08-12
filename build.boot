(set-env!
 :source-paths #{"src/cljs"}
 :resource-paths #{"html"}
  
 :dependencies '[[adzerk/boot-cljs "1.7.228-2"]])

;; make the cljs visible to the boot command
(require '[adzerk.boot-cljs :refer [cljs]])
