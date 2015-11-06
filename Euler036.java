/**
 * @author ctessein
 *
 */
public class Euler036 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final long startTime = System.currentTimeMillis();
		long total = 0;
		for (int i = 1; i <= 999999; i++)
			if (Utility.isPalindrome(String.valueOf(i)) &&
					Utility.isPalindrome(Integer.toBinaryString(i)))
				total += i;
		System.out.println("Euler036 = " + total + " - finished in " + (System.currentTimeMillis() - startTime) + " millis.");
	}
}
