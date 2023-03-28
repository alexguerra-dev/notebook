(ns notebook.quest.core)

(defn global-timer-tick
  "Returns a new global timer after one tick. The Global timer is incremented by the speed value. 
   A global timer unit is earned for every mark of 8192"
  [speed])

(defn speed-value
  "Returns the speed value for a given battle speed."
  [battle-speed]
  (/ 32768 
     (+ 120
        (/ (* battle-speed 15)
           8))))

(def elements #{:non-element :fire :ice :lightning :earth :poison :gravity :water :wind :holy :resorative})

(def attack-types #{:physical :magic :piercing :attack :absorb :long-range})
