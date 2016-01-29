def factorize = { long target -> 
  if (target == 1)
    return [1L]
  if (target < 4)
    return [1L, target]
  def targetSqrt = Math.sqrt(target)
  def lowfactors = (2L..targetSqrt).grep { (target % it) == 0 }
  if (lowfactors == [])
    return [1L, target]
  def nhalf = lowfactors.size() - ((lowfactors[-1] == targetSqrt) ? 1 : 0)
   lowfactors + (0..<nhalf).collect { target.intdiv(lowfactors[it]) }.reverse()
}

sum = 0
(1..10000).each {
  def factors = factorize(it)
  bottom = 0
  top = factors.size() - 1
  while (bottom < top) {
    String pandigital = String.valueOf(factors[bottom]) + String.valueOf(factors[top]) + String.valueOf(it);
    if ((pandigital.length() == 9) && (Long.parseLong(pandigital) % 9 == 0)  && (pandigital.indexOf('0') <= 0) && (pandigital.matches("^(?!.*(.).*\\1)\\d{9}"))) {
      sum += it
      println pandigital + ' YES  ' + it + "   -   " + factors[bottom] + " : " + factors[top]
      break
    }
    top--
    bottom++
  }
}
println sum
