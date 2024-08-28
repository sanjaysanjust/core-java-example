package generics;

import java.util.ArrayList;

public class testGeneric {

	public static void main(String[] args) {
		// Compiler will only look at reference variable type for type check, If nothing
		// specified ArrayList<String> then it accepts any thing along with stirng
		ArrayList l = new ArrayList<String>();
		l.add("sanjay");
		l.add("chaithra");
		l.add(4);
		l.add(true);
		System.out.println("l ====>" + l);

		// Compiler will only look at reference variable type for type check, If
		// specified ArrayList<String> then it accepts only type string variables
//		ArrayList<String> l =new ArrayList<String>();
//		l.add("sanjay");
//		l.add("chaithra");
//		l.add(4);
//		l.add(true);
//		System.out.println("l ====>"+l);
	}

}
