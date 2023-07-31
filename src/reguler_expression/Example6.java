package reguler_expression;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example6 {
	public static void main(String[] args) throws IOException {

		// Using Scanner for Getting Input from User
		// Pattren for valid mobile number

		Pattern ptr = Pattern.compile("(0|91)?[7-9][0-9]{9}");
		System.out.println("Enter Mobile Number :");

		Scanner in = new Scanner(System.in);

		String str = in.next();
		System.out.println("str   ====>" + str);

		Matcher mt = ptr.matcher(str);
		if (mt.find() && mt.group().equals(str)) {
			System.out.println("Valid Mobile Number");
		} else {
			System.out.println("Invalid Mobile Number");
		}

		// Pattren for valid mail id Ex : abc@gmail.com, 1asd@asd.co aser@co.in
		Pattern ptr0 = Pattern.compile("[a-zA-z0-9][a-zA-Z0-9_.]*@[a-zA-z0-9]+([.][a-zA-z]+)+");
		System.out.println("Enter Mail Id :");

		Scanner in1 = new Scanner(System.in);

		String str1 = in1.next();
		System.out.println("str   ====>" + str1);

		Matcher mt0 = ptr0.matcher(str1);
		if (mt0.find() && mt0.group().equals(str1)) {
			System.out.println("Valid mail id");
		} else {
			System.out.println("Invalid mailid");
		}
		// Pgm to read all mobile no in the given input fies, Mob N are fixed with
		// normal text data.

		Pattern mobNoPtr = Pattern.compile("(0|91)?[7-9][0-9]{9}");
		PrintWriter pw = new PrintWriter("output.txt");
		BufferedReader br = new BufferedReader(new FileReader("input.txt"));

		String line = br.readLine();
		while (line != null) {
			System.out.println(line);
			Matcher mt3 = mobNoPtr.matcher(line);
			while (mt3.find()) {
				// System.out.println(mt3.group());
				pw.println(mt3.group());
			}
			line = br.readLine();
		}
		pw.flush();
		pw.close();
		br.close();

		// Pgm to display all .txt files present in desktop.

		Pattern file_ptrn = Pattern.compile("[a-zA-Z0-9_.$]+[.]txt");
		// First Find the Desktop Location
		File f = new File("C:\\Users\\SanjayST\\Desktop");
		String[] file_lst = f.list();
		int cnt = 0;
		for (String f_name : file_lst) {
			Matcher mt4 = file_ptrn.matcher(f_name);
			if (mt4.find() && mt4.group().equals(f_name)) {
				System.out.println("Matched  ====>" + mt4.group());
			} else {
				System.out.println("Not matched");
			}
			cnt++;
		}
		System.out.println(cnt);
	}

}
