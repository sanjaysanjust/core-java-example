
public class AutoBoxingAndWideningExample {
	
	
	
	// main driver method
    public static void main(String[] args)
    {
 
        // Creating instance of class 1 inside main() method
        Conversion c = new Conversion();
 
        // Invoking the method with different signature
        c.method(10);
        c.method(new Integer(15));
        c.method(new Long(100));
 
        // Using short will give, argument mismatch;
        // possible lossy conversion from int to short
        // c.method(new Short(15));
    }
}


class Conversion {
	 
    // Method 1
    // Overloading method with primitive formal argument
	/*
	 * public void method(int i) {
	 * 
	 * // Print statement System.out.println( "Primitive type int formal argument :"
	 * + i); }
	 */
 
    // Method 2
    // Overloading method with reference formal argument
    public void method(Integer i)
    {
 
        // Print statement
        System.out.println(
            "Reference type Integer formal argument :" + i);
    }
 
    // Method 2
    // Overloading method primitive formal argument
    // and to be invoked for wrapper Object as overloaded
    // method with wrapper object of same(Long) type as an
    // argument is not available.
    public void method(double i)
    {
 
        // Print statement
        System.out.println(
            "Primitive type long formal argument :" + i);
    }
    
    public void method(float i)
    {
 
        // Print statement
        System.out.println(
            "Primitive type float formal argument :" + i);
    }
}


