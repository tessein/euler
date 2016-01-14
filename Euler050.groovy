isPrime = {
  candidate ->
    if (candidate < 2)
      return false
    if (candidate == 2)
      return true
    if (candidate % 2 == 0)
      return false
    limit = Math.ceil(Math.sqrt(candidate)) as int
    for (int i = 2; i <= limit; i++) {
      if (candidate % i == 0) {
        return false
      }
    }
    return true
}

primes = []

maxPrime = 0
maxRun = 0
maxRuns = []

for (int i = 2; i <5000; i++) {
  if (isPrime(i))
    primes << i
}

(0..(primes.size()-1)).each {
  i ->
    (i..primes.size()-1).each {
      j ->
        //println primes[i..j]
        candidate = primes[i..j].sum()
        run = primes[i..j].size()
        if (candidate < 1000000 && isPrime(candidate) && run > maxRun) {
          maxPrime = candidate
          maxRun = run
          maxRuns = primes[i..j]
        }
    }
}
println maxPrime
println maxRun
