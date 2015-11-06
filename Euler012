/**
 * @author ctessein
 * 
 */
public class Euler012 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final long startTime = System.currentTimeMillis();
		long triangleNumber = 0;
		for (int i = 1; i <= Integer.MAX_VALUE; i++) {
			triangleNumber += i;
			double triangleRoot = Math.sqrt(triangleNumber);
			int numFactors = 0;
			for (long j = 2; j < triangleRoot; j++)
				if (triangleNumber % j == 0)
					numFactors += 2;
			numFactors += triangleNumber == 1 ? 1 : 2;
			if (numFactors > 500) {
				System.out.println("Euler014 = " + triangleNumber + " - finished in "
				    + (System.currentTimeMillis() - startTime) + " millis");
				break;
			}
		}
	}
}
