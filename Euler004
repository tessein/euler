import java.util.TreeSet;

/**
 * @author chuck
 * 
 */
public class Euler004 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final long startTime = System.currentTimeMillis();
		final TreeSet<Integer> palindromes = new TreeSet<Integer>();
		for (int i = 100; i <= 999; i++)
			for (int j = 100; j <= 999; j++) {
				int cand = i * j;
				if (Utility.isNumericPalindrome(cand))
					palindromes.add(cand);
			}
		System.out.println("Euler004 = " + palindromes.last() + " - finished in "
		    + (System.currentTimeMillis() - startTime) + " millis");
	}
}
