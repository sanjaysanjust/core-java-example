package lang_package;

//To create the exact duplicate object is called cloning.
// Purpose of cloning is to maintain the duplicate copy and preserve the state of an object for future comparision.

//Change in the primitive type value will not reflect, But change in the object type will reflect. This is what Shallow copy is

public class clone_example_1 {

	public static void main(String[] args) throws CloneNotSupportedException {

		Test2 t2 = new Test2();
		t2.a = 10;
		t2.b = 20;
		t2.c.x = 30;
		t2.c.y = 40;
		System.out.println("Before Cloning t2 object===>" + t2);

		Test2 t2_clone = (Test2) t2.clone();
		t2_clone.a = 100;
		t2_clone.c.x = 300;

		System.out.println("After Cloning t2 object ===>" + t2);

		System.out.println("Cloned Oject ===> " + t2_clone);

		/*
		 * Test2 t2 = new Test2(); t2.a = 10; t2.b = 20; t2.x = 30; t2.y = 40;
		 * System.out.println("Before Cloning t2 object===>"+ t2);
		 * 
		 * Test2 t2_clone = (Test2) t2.clone(); t2_clone.a = 100; t2_clone.x = 300;
		 * System.out.println("After Cloning t2 object===>"+ t2);
		 * System.out.println("Cloned Object ===>"+ t2_clone);
		 */

	}

}

class Test {
	int x, y;
}

class Test2 implements Cloneable {
	int a;
	int b;
	Test c = new Test();

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {

		return "Value Of a : " + a + "Value Of b : " + b + " Value of x " + c.x + " Value Of y " + c.y;
	}
}

/*
 * class Test2 extends Test implements Cloneable { int a; int b;
 * 
 * public Object clone() throws CloneNotSupportedException { return
 * super.clone(); }
 * 
 * @Override public String toString() {
 * 
 * return "Value Of a : " + a + "Value Of b : " + b + " Value of x " + x +
 * " Value Of y " + y; } }
 */
