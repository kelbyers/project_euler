(comment
  (defn mult_3_5? [n]
    (some #(zero? (rem n %)) [3 5]))
  (apply + (filter mult_3_5? (range 1 1000)))
  :rcf)
