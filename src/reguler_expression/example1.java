package reguler_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class example1 {
	public static void main(String[] args) {
		int cnt=0;
		String reg_ex = "abb";
		Pattern p = Pattern.compile(reg_ex);
		String str= "ababbabb";
		Matcher m = p.matcher(str);
		while(m.find()) {
			System.out.println(m.start()+ "====="+m.end() +" =====>"+m.group());
			cnt++;
		}
		System.out.println("Count ====>"+cnt);
	}
}


// boolean m.find() always attempts to find the next match and returns true if it is available.
// int start() return start of the match
// int end() return end+1 index of the match
// String group() returns the matched patterns.