(comment
  (defn fib
    ([] (fib 1 1))
    ([a b] (lazy-seq (cons a (fib b (+ a b))))))
  (take 10 (fib))

  (reduce + (filter even? (take-while #(< % 4000000) (fib))))
  :rcf)
