package FileOperations;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Example1 {
// This example is to merge 2 files data one after the other to thied file uisng file operations.
	public static void main(String[] args) throws IOException {
		PrintWriter pw = new PrintWriter("file3.txt");
		
		BufferedReader br = new BufferedReader(new FileReader("file1.txt"));
		String line = br.readLine();
		while(line != null) {
			pw.println(line);
			line = br.readLine();
		}
		br = new BufferedReader(new FileReader("file2.txt"));
		line = br.readLine();
		while(line != null) {
			pw.println(line);
			line = br.readLine();
		}
		pw.flush();
		pw.close();
		br.close();
	}

}
