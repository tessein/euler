/**
 * @author ctessein
 * 
 */
public class Euler034 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		long total = 0;
		for (long i = 1; i <= 9999999; i++) {
			int[] digits = Utility.getDigits(i);
			long sum = 0;
			for (int aDigit : digits)
				sum += Utility.factorial(aDigit);
			if (sum == i)
				total += sum;
		}
		System.out.println("Euler034 = " + total + " - finished in "
		    + (System.currentTimeMillis() - startTime) + " millis");
	}
}
