(ns notebook.quest.monsters)

(def guard-hound {:name "Guard Hound"
                  :stats {:level 3 :exp 20  :hp 42 :ap 2 :mp 0 :gil 12}
                  :attacks [{:name "Bite"}
                            {:name "Tentacle"}]
                  :ai {:type :aggressive}
                  :battle-cry "Woof!"
                  :desctipion "A large dog-like creature with a long, sharp tail."})
