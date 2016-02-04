BigInteger numerator = 3
BigInteger denominator = 2
tally = 0
(1..1000).each {
  numerator += denominator * 2
  denominator = numerator - denominator
  if (numerator.toString().length() > denominator.toString().length())
    tally++
}
println tally
