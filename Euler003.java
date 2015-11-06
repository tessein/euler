/**
 * @author chuck
 * 
 */
public class Euler003 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final long startTime = System.currentTimeMillis();
		long n = 600851475143L;
		for (long i = 3; i <= Math.sqrt(n); i+=2)
			while (n % i == 0) 
				n = n / i;
		System.out.println("Euler003 = " + n + " - completed in "
		    + (System.currentTimeMillis() - startTime) + " millis");
	}
}
