package reguler_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//reg_exp for Character Classes.

public class example2{
	public static void main(String[] args) {
		int cnt = 0;
		// To Find either a or b or c
		String reg_ex = "[abc]";
		Pattern p = Pattern.compile(reg_ex);
		String str = "ababbabb";
		Matcher m = p.matcher(str);
		while (m.find()) {
			System.out.println(m.start() + "=====" + m.end() + " =====>" + m.group());
			cnt++;
		}
		System.out.println("Count for [abc] ====>" + cnt);

		// To Find except a and b and c
		cnt = 0;
		Pattern p1 = Pattern.compile("[^abc]");
		Matcher m1 = p1.matcher("ababbabb");
		while (m1.find()) {
			System.out.println(m1.start() + "=====" + m1.end() + " =====>" + m1.group());
			cnt++;
		}
		System.out.println("Count for [^abc] ====>" + cnt);

		// [a-z] ===>To Find any lower case alphabet starts from a to z
		cnt = 0;
		Pattern p2 = Pattern.compile("[a-z]");
		Matcher m2 = p2.matcher("ababbabb!@#$%a");
		while (m2.find()) {
			System.out.println(m2.start() + "=====" + m2.end() + " =====>" + m2.group());
			cnt++;
		}
		System.out.println("Count for [a-z] ====>" + cnt);

		// [a-zA-Z] ===>To Find any lower and Upper case alphabet starts from a to z and
		// A to Z
		cnt = 0;
		Pattern p3 = Pattern.compile("[a-zA-Z]");
		Matcher m3 = p3.matcher("ababbabb!@#$%aANSEKN");
		while (m3.find()) {
			System.out.println(m3.start() + "=====" + m3.end() + " =====>" + m3.group());
			cnt++;
		}
		System.out.println("Count for [a-zA-Z] ====>" + cnt);
		// [0-9] ===>To Find any digit starts from 0 to 9
		cnt = 0;
		Pattern p4 = Pattern.compile("[0-9]");
		Matcher m4 = p4.matcher("1234ababbabb!@#$%aANSEKN");
		while (m4.find()) {
			System.out.println(m4.start() + "=====" + m4.end() + " =====>" + m4.group());
			cnt++;
		}
		System.out.println("Count for [0-9] ====>" + cnt);

		// [0-9a-zA-Z] ===>To Find any alphanumeric
		cnt = 0;
		Pattern p5 = Pattern.compile("[0-9a-zA-Z]");
		Matcher m5 = p5.matcher("1234ababbabb!@#$%aANSEKN");
		while (m5.find()) {
			System.out.println(m5.start() + "=====" + m5.end() + " =====>" + m5.group());
			cnt++;
		}
		System.out.println("Count for [0-9a-zA-Z] ====>" + cnt);
		
		// [^0-9a-zA-Z] ===>To Find except alphanumeric value
				cnt = 0;
				Pattern p6 = Pattern.compile("[^0-9a-zA-Z]");
				Matcher m6 = p6.matcher("1234ababbabb!@#$%aANSEKN");
				while (m6.find()) {
					System.out.println(m6.start() + "=====" + m6.end() + " =====>" + m6.group());
					cnt++;
				}
				System.out.println("Count for [^0-9a-zA-Z] ====>" + cnt);
	}
}
