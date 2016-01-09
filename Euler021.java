import java.util.Set;
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
			TreeSet<Long> firstDivisors = getDivisors(i);
			if (firstDivisors.size() > 0) firstDivisors.remove(firstDivisors.last());
			long firstSum = getSum(firstDivisors);
			TreeSet<Long> secondDivisors = getDivisors(firstSum);
			if (firstDivisors.size() > 0) secondDivisors.remove(secondDivisors.last());
			long secondSum = getSum(secondDivisors);
			if (secondSum == i && firstSum != secondSum) 
				theSum += secondSum;
		}
		System.out.println("Euler021 = " + theSum + " - finished in " + (System.currentTimeMillis() - startTime) + " millis" );
	}
	protected static long getSum(Set<Long> set) {
		long theSum = 0;
		for (long setMember: set)
			theSum += setMember;
		return theSum;
	}
	protected static TreeSet<Long> getDivisors(long value) {
		TreeSet<Long> divisors = new TreeSet<Long>();
		for (long i = 1; i <= Math.sqrt(value); i++) 
			if (value % i == 0) {
				divisors.add(i);
				divisors.add(value/i);
			}
		return divisors;
	}
}
