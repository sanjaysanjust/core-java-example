package lang_package;

public class string_Example2 {
	public static void main(String[] args) {
		// String creates an empty string string object when we create like below;

		String s1 = new String();// Here An empty string object will be created with 0 length.

		// String s2 = new String(String Literal);// Here It creates one object in Heap
		// and one literal in String constant pool

		// String s3 = new String(StringBuffer sb);// It creates an equivalent string
		// object for the given string buffer.

		// String s4 = new String(Char[] ch);// It creates an equivalent string object
		// for the given Char buffer.
		char[] ch = { 'A', 'B', 'C' };
		String s4 = new String(ch);
		System.out.println("s4 ===>" + s4);

		// String s5 = new String(byte[] b);// It creates an equivalent string object
		// for the given byte array.
		byte[] b = { 100, 102, 102, 103, 104 };
		String s5 = new String(b);
		System.out.println("s5 ===>" + s5);

		// Important Example for comparision of objects created on heap and constant
		// pool.

		String a1 = new String("You can nto change me");// Created a3 in heap
		String a2 = new String("You can nto change me");// Created a3 in heap
		System.out.println(a1 == a2);
		String a3 = "You can nto change me";// Created a3 in scp.
		System.out.println(a1 == a3);
		String a4 = "You can nto change me";// Assign to the object created for a3 in scp.
		System.out.println(a4 == a3);
		String a5 = "You can nto" + " change me";// Since both are strign constants, jvm will resolve the value to 'You
													// can nto change me' and the value will be created in SCP at
													// compile time itself, Since
													// already that resolved string already exist part of SCP It gets
													// reassigned to same string object You can nto change me.
		System.out.println(a4 == a5);
		String a6 = "You can nto";
		String a7 = a6 + "change me";// Since a6 is a string variable and 'change me' is a string constant and both
										// are
										// created in SCP, But Appending happens at runtime as one(a6) is variable and
										// other one is string literal. So the object "You can nto change me" gets
										// created in heap not in SCP.

		System.out.println(a7 == a3);// This operation also will be performed at compile time only, As A string
										// variable modifier is final, The value will remain same so JVM will resolve
										// the value at compile time itself and appending takes place at compile time
										// only hence object gets created at compile time in SCP not in heap

		final String a8 = "You can nto";
		String a9 = a8 + " change me";
		System.out.println("SAnjay   =====>");
		System.out.println(a9 == a3);
		
		
		// INTERN() method
		
		// This method will eb used to get a refernce of SCP object which corresponds to heap object.
		System.out.println("Intern Example");
		
		String w2= new String("Sanjay");// This would create a object in heap and refer w2 to object in heap, At the same time this stateent create an string literal in SCP for future use. If user wants to refer SCP literal butnot heap object then we can make use of intern() method.
		String w3 = w2.intern();
		System.out.println(w2 ==w3);
		String w4 = "Sanjay";
		System.out.println(w4 ==w3);
		

	}
}
