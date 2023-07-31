package wrapper_package_example;

public class wrapper_example {
	public static void main(String[] args) {
		// Two types of constructore for each primitives.
		Integer i = new Integer(0);
		Integer i1 = new Integer("10");

		Double d = new Double(0);
		Double d1 = new Double("10");

		// Number format exception will be thrown when there is a wrong value in String
		// Integer i2 = new Integer("ten");
		// FLoat contins three constructors, float, string and double

		Float f = new Float(10.5f);
		Float f1 = new Float("10.5");
		Float f2 = new Float(10.5);

		// Charector constructor conatin only one constructor which accepts only char
		// argument
		Character ch = new Character('A');
		// Character ch1 = new Character("A");// Invalid Constructor

		// Boolean can contain 2 constr. one can take boolean argument and other cam tak
		// string argumrnt.
		Boolean b = new Boolean(false);
		Boolean b1 = new Boolean("true");
		Boolean b2 = new Boolean("True");// INvalid, It takes only small true, false
		// if we are passing string as argument case and conetent is not important, if
		// the content is case insensitive then it is treated as true otherwuse false.

		Boolean b4 = new Boolean("true");
		System.out.println(b4);
		Boolean b5 = new Boolean("sanjay");
		System.out.println(b5);
		Boolean b6 = new Boolean("True");
		System.out.println(b6);
		Boolean b7 = new Boolean("False");
		System.out.println(b7);
		Boolean b8 = new Boolean("false");
		System.out.println(b8);
		Boolean b9 = new Boolean("kumar");
		System.out.println(b9);

		// .eqauls methos is overridden in all wrapper classes.
		valueOfMethod();
		xxxVaue();
		parsexxx();
		tooString();
		
	}

	private static void tooString() {
		// To convert wrapper object or primitive to string.
		//toString() method is overridden for all primitve ojects.
		
	}

	private static void parsexxx() {
		// To Convert string to primitive we use parsexxx Methods
		
		// Every wrapper class except charector class conatians a static parser method to find the primitive for the given string.
		//SYntax public static primitive parseXxx(String s)
		int i =Integer.parseInt("10");
		double d =Double.parseDouble("10.5");
		boolean b = Boolean.parseBoolean("true");
		
		// Every integer type wrapper class(byte,short int long) conatins the specified radix string to primitive
		
		//SYntax public static primitive parseXxx(String s, int radix)
		int i1 =Integer.parseInt("10",2);
		System.out.println("i1 ====>"+i1);
		
	}

	private static void xxxVaue() {
		// Use this methoods to get the primitivve value from the given wrapper object.
		
		Integer i =new Integer(130);
		
		byte i2= i.byteValue();
		System.out.println(i2);
		short i3= i.shortValue();
		System.out.println(i3);
		int i4= i.intValue();
		System.out.println(i4);
		long i5= i.longValue();
		System.out.println(i5);
		float i6= i.floatValue();
		System.out.println(i6);
		double i7= i.doubleValue();
		System.out.println(i7);
		// EVery primitive will have all these 6 conversions attached to it, INternally type conversion will happen from type to type except charValue
		Character ch = new Character('a');
		char c = ch.charValue();
		System.out.println("ch ===>"+ch);
		// Boolean class conatis boolean value method to get boolean primitive for the given boolean object.
		
		Boolean b =new Boolean("sanjay");
		boolean be= b.booleanValue();
		System.out.println("be ====>"+be);
		// IN total 38 xxxValue methods are possible
	}

	private static void valueOfMethod() {
		// TO create Integer Object to a given Primitive value as alternative to
		// constructor
		// Except char class all other Wrapper classes will have static valueOF method
		// for the given string

		Integer i1 = new Integer(0);
		Integer i2 = new Integer("10");

		Double d = new Double(0);
		Double d1 = new Double("10");
		Boolean b4 = new Boolean("sanjay");
		// Evry integer type wrapper class(byte integer lng)conatind the following of
		// methods to create WO specified raddix string.
		// Public static valueOf(String s , int radix)

		Integer i3 = Integer.valueOf("100", 2);
		Double d4 = Double.valueOf(0);
	}
}
