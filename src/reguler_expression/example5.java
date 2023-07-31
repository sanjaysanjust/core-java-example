package reguler_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class example5 {
	public static void main(String[] args) {
		// Regular expression for 10 digit Mobile number starts from 7 or 8 or 9.
		String pattern = "[789][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]";
		// OR
		String pattern1 = "[789][0-9]{9}";
		// RE for 11 digit mobile number where first number always starts with 0.
		String ptr = "0?[7-9][0-9] {9}";

		// RE for 11 OR 12 digit mobile number where first number always starts with
		// either 0 or 91.
		String ptr2 = "(0/91)?[7-9][0-9] {9}";

		// RE to represent mail id's where first charector in the mail should be either
		// character OR digit Ex. sanjay12_23.@gmail.com or sanjay12_23.@yahoo.co.in etc
		String ptr3 = "[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+";

		// RE to represent only gmail id's where first charector in the mail should be
		// either character OR digit Ex. sanjay12_23.@gmail.com
		String ptr4 = "[a-zA-Z0-9][a-zA-Z0-9_.]*@gmail[.]com";

		// RE to represent yava language identifiers. Allowed charactres, a-z,A-Z0-9,#$
		// Length of each identifiers shoulbe atleast 2
		// First chrarector should lower case alphabet symbol from a-k
		// Second charector shoud be a digit divisible by 3(0,3,6,9)
		String ptr5 = "[a-k][0369][a-zA-Z0-9#$]";
		
		String ptr6="[a-zA-Z0-9][a-zA-Z0-9_.]*@(gmail|yahoo)[.](com)|(co|in)+)+";
		
		Pattern p = Pattern.compile(ptr4);
		String str= ".sanjay@gmail.com";
		//Matcher m = ;
		
		System.out.println(p.matches(ptr4,str));

	}
}
