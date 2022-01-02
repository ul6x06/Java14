
package Java14;

import java.io.*;

public class Class07 {
	public static void main(String args[]) throws IOException {
		int count = 0;
		String str;
		FileReader fr = new FileReader("C:\\Users\\USER\\Documents\\donkey.txt");
		BufferedReader bfr = new BufferedReader(fr);

		while ((str = bfr.readLine()) != null) {
			if (count == 1)
				bfr.skip(14);
			System.out.println(str);
			count++;
		}
		fr.close();
	}
}
