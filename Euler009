/**
 * @author chuck
 * 
 */
public class Euler009 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final long startTime = System.currentTimeMillis();
		final int MAX = 1000;
		for (int n = 1; n <= MAX; n++)
			for (int m = 1; m <= MAX; m++) {
				int firstTriple = (n * n - m * m);
				int secondTriple = 2 * n * m;
				int thirdTriple = (n * n + m * m);
				if (firstTriple >= 0 && secondTriple >= 0 && thirdTriple >= 0
				    && (MAX == (firstTriple + secondTriple + thirdTriple))) {
					System.out.println("Euler009 = "
					    + (firstTriple * secondTriple * thirdTriple) + " - runtime is "
					    + (System.currentTimeMillis() - startTime) + " millis");
					return;
				}
			}
	}
}
