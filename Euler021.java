import java.util.TreeSet;

/**
 * @author chuck
 *
 */
public class Euler021 {

	/**
	 * @param args
	 */
	public static void main(String [] args) {
		final long startTime = System.currentTimeMillis();
		long theSum = 0;
		for (long i = 1; i <= 10000; i++) {
			TreeSet<Long> firstDivisors = Utility.getDivisors(i);
			if (firstDivisors.size() > 0) firstDivisors.remove(firstDivisors.last());
			long firstSum = Utility.getSum(firstDivisors);
			TreeSet<Long> secondDivisors = Utility.getDivisors(firstSum);
			if (firstDivisors.size() > 0) secondDivisors.remove(secondDivisors.last());
			long secondSum = Utility.getSum(secondDivisors);
			if (secondSum == i && firstSum != secondSum) 
				theSum += secondSum;
		}
		System.out.println("Euler021 = " + theSum + " - finished in " + (System.currentTimeMillis() - startTime) + " millis" );
	}
}
