isPrime = {
  candidate ->
    if (candidate < 2)
      return false
    if (candidate == 2)
      return true
    if (candidate % 2 == 0)
      return false
    limit = Math.ceil(Math.sqrt(candidate)) as int
    for (int i = 2; i <= limit; i++)
      if (candidate % i == 0)
        return false
    return true
}

noOfPrimes = 3;
sl = 2;
index = 9;
 
while(((double)noOfPrimes) / (2 * sl + 1) > 0.10) {
  sl += 2;
  (0..2).each {
    index += sl;
    if (isPrime(index)) noOfPrimes++;
  }
  index += sl;
}
println (++sl
