/**
 * @author ctessein
 * 
 */
public class Euler014 {

	static long winner = 0;
	static int winner_steps = 0;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final long startTime = System.currentTimeMillis();
		for (int i = 1; i < 1000000; i++)
			collatz(i);
		System.out.println("Euler014 = " + winner + " - finished in "
		    + (System.currentTimeMillis() - startTime) + " millis");
	}

	private static void collatz(final int candidate) {
		long n = candidate;
		int steps = 0;
		while (n > 1) {
			steps++;
			n = n % 2 != 0 ? 3 * n + 1 : n / 2;
		}
		if (steps > winner_steps) {
			winner_steps = steps;
			winner = candidate;
		}
	}
}
