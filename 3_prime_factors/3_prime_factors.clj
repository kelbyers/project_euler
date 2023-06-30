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

(comment
  ;; more efficient prime factoriztion using Sieve of Eratosthenes

  (def problem 600851475143)
  (defn sieve [s]
    (cons (first s)
          (lazy-seq (sieve (filter #(not= 0 (mod % (first s)))
                                   (rest s))))))
  (defn se [] (sieve (iterate inc 2)))
  (defn pe
    ([n] (pe n (se)))
    ([n s] (let [f (first s)]
             (if (zero? (rem n f))
               (cons f (pe (/ n f) s))
               (when (< f n) (pe n (rest s)))))))
  (apply max (pe problem))
  ;; scratch
  (pe 8)
  (def n 2)
  (def f (first (se)))
  (zero? (rem n f))
  (/ n f)
  (take 3 (se))
  :rcf)
