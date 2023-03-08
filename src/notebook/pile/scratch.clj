(ns notebook.pile.scratch)

;; You can do this... Just keep moving forward.

(comment
  (def primary-stats {:str "strength"
                      :dex "dexterity"
                      :vit "vitality"
                      :mag "magic"
                      :spr "spirit"
                      :lck "luck"
                      :lvl "level"})

  (def derived-stats {:att "attack"
                      :atp "attack percent"
                      :dfn "defense"
                      :dfp "defense percent"
                      :mat "magic attack"
                      :mdf "magic defense"
                      :mdp "magic defense percent"})

  (def ada {:name "Ada"
            :state {:hp 100}
            :bag ["sword" "potion" "rope" "torch" "key" "map"]
            :stats {:lvl 4
                    :str 10
                    :dex 10
                    :vit 10
                    :mag 10
                    :spr 10
                    :lck 10
                    :att 10
                    :atp 10
                    :dfn 10
                    :dfp 10
                    :mat 10
                    :mdf 10
                    :mdp 10}})

  (defn get-stats [character]
    (get character :stats))


  ;; ┼ ─ ─ ─ Roll for attack! ─ ─ ─ ─┼

  (defn roll-d6
    "Roll a six-sided die."
    []
    (inc (rand-int 6)))




  (roll-d6))
