
(defn fold-?
"This function takes a *prime-numbers list* and creates an anonymous function.
 Unnamed function checks if a number is fold to any numbers in prime-numbers list.
 (map (fold-? 20) [2 3 5 7]) ;=> (true false true false) "
[pn-?]
#(integer? (/ pn-? %)))

;;;

(defn pnl-maker
"This function take a number and create a prime numbers list 
 that smaller than this number or equal to this
 (pnl-maker 20) ;=> [2 3 5 7 11 13 17 19]
 (pnl-maker 7) ;=> [2 3 5 7] "
[max-val]
(if (and (>= max-val 2) (integer? max-val))
    (loop [pn-list [2]
           pn-? 3]
          (if (< max-val pn-?)
              pn-list
              (recur 
                    (if (some true? (map (fold-? pn-?) pn-list))
                        pn-list
                        (conj pn-list pn-?))
                    (inc pn-?))))
    (str "pnl-maker :" "Please insert an integer bigger than 2 or equal")))

;;;

(defn prime-?
"This function is check if a number is a prime-number.
 (prime-? 7919) ;=> true "
[a-num]
(if (and (integer? a-num)(>= a-num 2))
    (= (apply max (pnl-maker a-num)) a-num)
    (prn "prime-? :""Please insert an integer bigger than 2 or equal")))
(prime-? 7)

;;;

(defn nth-prime
"This function given that what a number's ranking in prime numbers list.
(nth-prime 17) ;=>;;
17 is 7. prime-number
[2 3 5 7 11 13 17] "
[a-num]
(if (and (integer? a-num)(>= a-num 2)(prime-? a-num))
(do (prn (str a-num " is " (count (pnl-maker a-num)) ". prime-number."))
(prn (pnl-maker a-num)))
(prn "This is not a prime number.")))

;;;

(defn pnl-calc
 [val]
 (if (and (integer? val)
      (> val 1)
      (prime-? val))
  (prn (str val " is " (count (pnl-maker val)) ". prime-number. 
            Prime-numbers list that is smaller than " val " : ")
       
  (prn (str val " is not a prime-number. " val " can be divided this prime-numbers : ")
       )
(prn (pnl-maker val)))
          
 
 
