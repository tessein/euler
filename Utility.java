import java.awt.List;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author chuck
 *
 */
public class Utility {

	
	protected static int [] convertStringArrayToIntArray(String [] numbers) {
	  int [] converted = new int [numbers.length];
	  for (int i = 0; i < numbers.length; i++) {
	  	converted[i] = Integer.parseInt(numbers[i]);
	  }
	  return converted;
	}
	
	protected static long factorial(final long aLong) {
		if (aLong < 2)
			return 1L;
		else
			return aLong * factorial(aLong -1);
	}

	protected static BigInteger factorial(final BigInteger bi) {
		if (bi.compareTo(new BigInteger("2")) < 0)
			return BigInteger.ONE;
		else
			return bi.multiply(factorial(bi.subtract(BigInteger.ONE)));
	}
	
	protected static boolean isNumericPalindrome(final int candidate) {
		final StringBuilder val = new StringBuilder(String.valueOf(candidate));
		if (val.toString().equals(val.reverse().toString()))
			return true;
		return false;
	}
	
	protected static ArrayList<Integer> generatePrimefactors(int n) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		for (int cand = 2; n > 1; cand++)
			for (; n % cand == 0; n /= cand)
				primes.add(cand);
		return primes;
	}
	
	protected static int [] getDigits(int target) {
		int [] numbers = new int[String.valueOf(target).length()];
		String aNumber = String.valueOf(target);
		final char [] theChars = new char[aNumber.length()];
		aNumber.getChars(0, aNumber.length(), theChars, 0);
		for(int i = 0; i < theChars.length; i++)
			numbers[i] = Integer.parseInt(String.valueOf(theChars[i]));
		return numbers;
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
	
	protected static TreeSet<Long> getDivisors(long value) {
		TreeSet<Long> divisors = new TreeSet<Long>();
		for (long i = 1; i <= Math.sqrt(value); i++) 
			if (value % i == 0) {
				divisors.add(i);
				divisors.add(value/i);
			}
		return divisors;
	}
	
	protected static long getSum(Set<Long> set) {
		long theSum = 0;
		for (long setMember: set)
			theSum += setMember;
		return theSum;
	}
	
	protected static boolean isPalindrome(String candidate) {
		final StringBuilder pal = new StringBuilder(candidate);
		return pal.toString().equals(pal.reverse().toString());
	}
	
	protected static void print(Set<Long> set) {
		System.out.print("[");
		boolean first = true;
		for (long setMember: set) {
			if (!first) 
				System.out.print(",");
			else
				first = false;
			System.out.print(setMember);
		}
		System.out.println("]");
	}
}
