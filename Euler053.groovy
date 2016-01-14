import java.math.BigInteger;

public static BigInteger factorial(BigInteger n) {
  if (n.equals(BigInteger.ZERO))
   return BigInteger.ONE;

  BigInteger i = n.subtract(BigInteger.ONE);
  while (i.compareTo(BigInteger.ZERO) > 0) {
   n = n.multiply(i);
   i = i.subtract(BigInteger.ONE);
  }
  return n;
}

def total = 0
(1..100).each {
  n->
    def nFact = factorial(new BigInteger(n.toString()))
    (1..n).each {
      r ->
        def rFact = factorial(new BigInteger(r.toString()))
        def answer = nFact.divide(rFact.multiply(factorial(new BigInteger((n - r).toString()))))
        if (answer > 1000000) total++
    }
}
println "euler53 = " + total
