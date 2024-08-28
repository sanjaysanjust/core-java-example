package FileOperations;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Example3 {
// This example is to write data to a third file where first file data shoild be written which doesn't in the second file
	public static void main(String[] args) throws IOException {
		PrintWriter pw = new PrintWriter("file4.txt");

		BufferedReader br1 = new BufferedReader(new FileReader("file1.txt"));

		String line1 = br1.readLine();

		while (line1 != null) {
			boolean ispresent = false;
			if (line1 != null) {
				BufferedReader br2 = new BufferedReader(new FileReader("file2.txt"));
				String line2 = br2.readLine();
				while (line2 != null) {
					if (line1.equals(line2)) {
						ispresent = true;
						break;
					}
					line2 = br2.readLine();
				}
				if (ispresent == false) {
					pw.println(line1);

				}
				line1 = br1.readLine();
				br2.close();
			}

		}
		pw.flush();
		pw.close();
		br1.close();

	}
}
