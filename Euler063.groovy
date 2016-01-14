tally = 0
(1..100).each {
  BigInteger i ->
    (1..100).each {
      BigInteger j ->
        h = (i.pow(j))
        if (h.toString().length() == j) {
          println i+"^"+j+" = "+h
          tally++
        }
  }
}
println tally
