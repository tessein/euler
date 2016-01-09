// BUG -- does not work

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author chuck
 * 
 */
public class Euler022 {

	private static String[] getNames(String namesFile) {
		final Set<String> names = new HashSet<String>();
		Scanner in = null;
		try {
			in = (new Scanner(new File(namesFile)).useDelimiter(","));
		} 
		catch (Exception doNothing) {
		}
		while (in.hasNext())
			names.add(in.next().replaceAll("\"", ""));
		final String[] theNames = new String[names.size()];
		return names.toArray(theNames);
	}

	private static int getWordScore(String aName) {
		final String letterValues = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int wordScore = 0;
		final char[] theChars = new char[aName.length()];
		aName.getChars(0, aName.length(), theChars, 0);
		for (char aChar : theChars)
			wordScore += letterValues.indexOf(aChar) + 1;
		return wordScore;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final long startTime = System.currentTimeMillis();
		int item = 0;
		int itemScores = 0;

		final String[] theNames = getNames("names.txt");
		Arrays.sort(theNames);
		for (String aName : theNames)
			itemScores += getWordScore(aName) * ++item;
		System.out.println("Euler022 = " + itemScores + " - finished in "
		    + (System.currentTimeMillis() - startTime) + " millis");
	}
}
