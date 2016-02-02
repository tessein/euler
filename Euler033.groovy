def (numerator, denominator) = [1, 1]

(11..99)
   .findAll {it % 10 != 0}
   .each {numer ->
      ((numer + 1)..99)
        .findAll { (it % 10 != 0) && (numer % 10 == it.intdiv(10))}
        .each { denom ->
           def ( numer1, denom1 ) = [ numer.intdiv(10), denom % 10]
           if (numer/denom == numer1 / denom1)
             (numerator, denominator) = [numerator * numer1, denominator * denom1]
        }
   }

def (gcd, n ) = [ numerator, denominator]

while (n != 0)
 (gcd, n) = [n, gcd % n]

println denominator.intdiv(gcd)
