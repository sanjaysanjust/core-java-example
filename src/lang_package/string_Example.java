package lang_package;

public class string_Example {
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

		String str = new String("sanjay");
		String str1 = str.toUpperCase();
		System.out.println(str == str1);
		String str3 = str.toLowerCase();
		System.out.println(str3 == str);
		// Here String str = new String("sanjay"); creates object in both heap and scp,
		// For str1, It creates a new object
		// "SANJAY" in heap space, because it is a run time operation. Runtime operation
		// will not create any object in SCP. If there is already a object exists then
		// it just refer tot the same object in runtime()
		// String str3 = str.toLowerCase(); This statement will not create a new object
		// in heap though its a runtime operation, As "sanjay" object already present it
		// just refer to the smae object
	}
}
