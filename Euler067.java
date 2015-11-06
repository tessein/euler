import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * @author chuck
 * 
 */
public class Euler067 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final long startTime = System.currentTimeMillis();
		ArrayList<int[]> rows = new ArrayList<int[]>();
		try {
			DataInputStream dis = new DataInputStream(new FileInputStream(
			    "triangle.txt"));
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(
			    dis));
			String aLine;
			while ((aLine = bufferedReader.readLine()) != null)
				rows.add(Utility.convertStringArrayToIntArray(aLine.split("\\s+")));
			dis.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		for (int y = rows.size() - 2; y >= 0; y--)
			for (int x = rows.get(y).length - 1; x >= 0; x--)
				rows.get(y)[x] += Math.max(rows.get(y + 1)[x], rows.get(y + 1)[x + 1]);
		System.out.println("Euler067 = " + rows.get(0)[0] + " - finished in "
		    + (System.currentTimeMillis() - startTime) + " millis");
	}
}
