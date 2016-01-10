/**
 * @author ctessein
 * 
 */
public class Euler030 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		int total = 0;
		for (long i = 2; i <= (Math.pow(9, 5) * 6); i++) {
			int[] comps = getDigits(i);
			int comps_tally = 0;
			for (int item : comps)
				comps_tally += Math.pow(item, 5);
			if (comps_tally == i)
				total += comps_tally;
		}
		System.out.println("Euler030 = " + total + " - finished in "
		    + (System.currentTimeMillis() - startTime) + " millis.");
	}
	protected static int [] getDigits(long target) {
		int [] numbers = new int[String.valueOf(target).length()];
		String aNumber = String.valueOf(target);
		final char [] theChars = new char[aNumber.length()];
		aNumber.getChars(0, aNumber.length(), theChars, 0);
		for(int i = 0; i < theChars.length; i++)
			numbers[i] = Integer.parseInt(String.valueOf(theChars[i]));
		return numbers;
	}
}
