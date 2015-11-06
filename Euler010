import java.util.ArrayList;

/**
 * @author chuck
 * 
 */
public class Euler010 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final long startTime = System.currentTimeMillis();
		final ArrayList<Integer> primes = new ArrayList<Integer>();
		primes.add(2);
		for (int i = 3; i < 2000000; i += 2) {
			boolean isPrime = true;
			for (int j = 3; j <= Math.sqrt(i); j += 2)
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			if (isPrime)
				primes.add(i);
		}
		long total = 0;
		for (int i = 0; i <= primes.size() - 1; i++)
			total += primes.get(i);
		System.out.println("Euler010 = " + total + " - runtime was "
		    + (System.currentTimeMillis() - startTime) + " millis");
	}
}
