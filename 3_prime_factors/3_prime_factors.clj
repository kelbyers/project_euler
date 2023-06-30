(comment

  ;; What is the largest prime factor of the number 600851475143?

  ;; solution
  (defn pf
    ([n] (pf n 2))
    ([n f] (if (zero? (rem n f)) (cons f (pf (/ n f) f))
               (cond
                 (= 2 f) (pf n 3)
                 (< f (Math/sqrt n)) (pf n (+ 2 f))
                 (> n 2) (list n)))))
  (def problem 600851475143)
  (apply max (pf problem))
  ;; ^^^ solution

  ;; scratch

  (defn d? [n f] (zero? (rem n f)))

  (pf 10)
  (apply max (pf 10))


  (def n 5)
  (def f 3)
  (d? n f)
  (= 2 f)
  (< f (Math/sqrt n))
  (> n 2)

  (Math/sqrt n)
  (rem 6 3)
  :rcf)
