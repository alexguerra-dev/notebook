(ns notebook.quest.utils)

(defn truncate
  "Truncates a number to the nearest integer. This should work with negative numbers."
  [n] 
  (cond (pos? n) (Math/floor n)
        (neg? n) (Math/ceil n)
        :else 0))
