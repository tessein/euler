import java.math.BigInteger;

/**
 * @author chuck
 *
 */
public class Euler074 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final int MAX = 169;
		BigInteger factSum = BigInteger.ZERO;
		for (int i = 1; i <= MAX; i++) {
			while (factSum.compareTo(BigInteger.valueOf(i)) != 0) {
				int [] digits = Utility.getDigits(i);
				factSum = BigInteger.ZERO;
				for(int digit: digits)
					factSum = factSum.add(Utility.factorial(BigInteger.valueOf(digit)));
				System.out.println(i+":"+factSum);
			}
		}
	}
	/*
	 * (1..999999).each {
  n->
println n
    chain = [] as Set
    chain << n
    chainItem = 0
    n.toString().each {
      chainItem += factorial(new BigInteger(it))
    }
    if (chain.contains(chainItem)) {
      println chain
    }
    else {
      chain << chainItem
      println chain
    }
}

	 */
}
