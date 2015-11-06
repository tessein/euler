/**
 * @author chuck
 * 
 */
public class Euler007 {
	public static void main(String[] args) {
		final long startTime = System.currentTimeMillis();
		final int upperBound = 200000;
		// assume everything is prime
		final boolean[] primeCandidates = new boolean[upperBound + 1];
		for (int i = 2; i <= upperBound; i++)
			primeCandidates[i] = true;
		// identify non-primes using Sieve of Eratosthenes
		for (int i = 2; i * i <= upperBound; i++)
			if (primeCandidates[i])
				for (int j = i; i * j <= upperBound; j++)
					primeCandidates[i * j] = false;
		// count up to find the 10001th prime
		int nthPrime = 0;
		for (int i = 0; i <= upperBound; i++)
			if (primeCandidates[i]) {
				nthPrime++;
				if (nthPrime == 10001) {
					long endTime = System.currentTimeMillis();
					System.out.println("Euler007 = " + i + " - runtime of "
					    + (endTime - startTime) + " millis");
					break;
				}
			}
	}
}
