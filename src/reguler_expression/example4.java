package reguler_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class example4 {
	// Quantifiers.
	
		public static void main(String[] args) {
			int cnt = 0;
			// ["\s"] to find space character in the given string.
			String reg_ex = "[\\s]";
			Pattern p = Pattern.compile(reg_ex);
			String str = "ab ab bab b";
			Matcher m = p.matcher(str);
			while (m.find()) {
				System.out.println(m.start() + "=====" + m.end() + " =====>" + m.group());
				cnt++;
			}
			System.out.println("Count for [\"\\s\"] ====>" + cnt);

			// ["\S"] ===> To find How many string objects except space character.
			cnt = 0;
			Pattern p1 = Pattern.compile("[\"\\S\"]");
			Matcher m1 = p1.matcher("aba bbabb");
			while (m1.find()) {
				System.out.println(m1.start() + "=====" + m1.end() + " =====>" + m1.group());
				cnt++;
			}
			System.out.println("Count for [\\\"\\\\S\\\"] ====>" + cnt);

			// ["\\d"] ===>To Find any digit from 0-9 [0-9]
			cnt = 0;
			Pattern p2 = Pattern.compile("\\d");
			Matcher m2 = p2.matcher("ababbabb!@#$%a1");
			while (m2.find()) {
				System.out.println(m2.start() + "=====" + m2.end() + " =====>" + m2.group());
				cnt++;
			}
			System.out.println("Count for [\"\\\\d\"] ====>" + cnt);

			// ["\\D"] ===>Except digit any characters
			
			cnt = 0;
			Pattern p3 = Pattern.compile("\\D");
			Matcher m3 = p3.matcher("aba");
			while (m3.find()) {
				System.out.println(m3.start() + "=====" + m3.end() + " =====>" + m3.group());
				cnt++;
			}
			System.out.println("Count for \"[\\\"\\\\\\\\D\\\"]\" ====>" + cnt);
			
			// ["\w"] ===>To Find any word character[a-zA-Z0-9]
			cnt = 0;
			Pattern p4 = Pattern.compile("\\w");
			Matcher m4 = p4.matcher("1234ababbabb!@#$%aANSEKN");
			while (m4.find()) {
				System.out.println(m4.start() + "=====" + m4.end() + " =====>" + m4.group());
				cnt++;
			}
			System.out.println("Count for [[\\\"\\\\w\\\"]] ====>" + cnt);

			// ["\\W"] ===>Except word character/alphanumeric, find any special characters
			cnt = 0;
			Pattern p5 = Pattern.compile("\\W");
			Matcher m5 = p5.matcher("1234ababbabb!@#$%aANSEKN");
			while (m5.find()) {
				System.out.println(m5.start() + "=====" + m5.end() + " =====>" + m5.group());
				cnt++;
			}
			System.out.println("Count for [\"\\\\W\"] ====>" + cnt);
			
			// ["."] ===>To Find anycharector value
					cnt = 0;
					Pattern p6 = Pattern.compile(".");
					Matcher m6 = p6.matcher("1234ababbabb!@#$%aANSEKN");
					while (m6.find()) {
						System.out.println(m6.start() + "=====" + m6.end() + " =====>" + m6.group());
						cnt++;
					}
					System.out.println("Count for '.' ====>" + cnt);
		}
}
