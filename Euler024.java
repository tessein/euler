import java.util.ArrayList;

/**
 * @author chuck
 * 
 */
public class Euler024 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final Long startTime = System.currentTimeMillis();
		int idxFactRoot = 999999;
		final ArrayList<Integer> adics = new ArrayList<Integer>();
		for (int i = 9; i >= 0; i--) {
			long idxFact = Utility.factorial(i);
			final int adic = ((int) (idxFactRoot / idxFact));
			adics.add(adic);
			idxFactRoot -= (adic * idxFact);
		}
		final ArrayList<Integer> target = new ArrayList<Integer>(10);
		for (int i = 0; i <= 9; i++)
			target.add(i);

		final ArrayList<Integer> result = new ArrayList<Integer>(10);
		for (int i = 0; i <= 9; i++) {
			result.add(target.get(adics.get(i)));
			target.remove(target.get(adics.get(i)));
		}

		String answer = "";
		for (int j : result)
			answer += String.valueOf(j);
		System.out.println("Euler024 = " + answer + " - finished in "
		    + (System.currentTimeMillis() - startTime) + " millis.");
	}
}
