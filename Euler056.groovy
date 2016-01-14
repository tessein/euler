def max = 0
(1..99).each {
  base ->
    BigInteger Base = new BigInteger(base.toString())
    (1..99).each {
      exp ->
       BigInteger Exp = new BigInteger(exp.toString())
       // make an Integer List
       elements = Base.pow(exp).toString().toList().collect {
         Integer.parseInt(it)
       }
       thisSum =  elements.sum()
       if (thisSum > max) max = thisSum
    }
}
println "Euler56 = " + max

