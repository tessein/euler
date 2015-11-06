/**
 * @author chuck
 * 
 */

public class Euler006 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final long startTime = System.currentTimeMillis();
		int sumsquares = 0;
		int squaresum = 0;
		for (int i = 1; i <= 100; i++) {
			sumsquares += i * i;
			squaresum += i;
		}
		int answer = (squaresum * squaresum) - sumsquares;
		System.out.println("Euler006 = " + answer + " - finished in "
		    + (System.currentTimeMillis() - startTime) + " millis");
	}
}
