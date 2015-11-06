/**
 * @author chuck
 * 
 */
public class Euler017 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final long startTime = System.currentTimeMillis();
		final String[] zeros = { "", "one", "two", "three", "four", "five", "six",
		    "seven", "eight", "nine" };
		final String[] teens = { "ten", "eleven", "twelve", "thirteen", "fourteen",
		    "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
		final String[] tens = { "twenty", "thirty", "forty", "fifty", "sixty", "seventy",
		    "eighty", "ninety" };

		String allLetters = "";
		for (String aNumber : zeros)
			allLetters += aNumber;
		for (String aNumber : teens)
			allLetters += aNumber;

		for (String aTen : tens)
			for (String aZero : zeros)
				allLetters += aTen + aZero;
		for (int i = 1; i <= 9; i++) {
			allLetters += zeros[i] + "hundred";
			for (int j = 1; j <= 9; j++)
				allLetters += zeros[i] + "hundredand" + zeros[j];
			for (String aTeen : teens)
				allLetters += zeros[i] + "hundredand" + aTeen;
			for (String aTen : tens)
				for (String aZero : zeros)
					allLetters += zeros[i] + "hundredand" + aTen + aZero;
		}
		allLetters += "onethousand";
		System.out.println("Euler 17 = " + allLetters.length() + " - finished in "
		    + (System.currentTimeMillis() - startTime) + " millis");
	}
}
