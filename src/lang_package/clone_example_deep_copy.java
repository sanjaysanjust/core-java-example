package lang_package;

public class clone_example_deep_copy {
	public static void main(String[] args) throws CloneNotSupportedException {

		Test22 t2 = new Test22();
		t2.a = 10;
		t2.b = 20;
		t2.c.x = 30;
		t2.c.y = 40;
		System.out.println("Before Cloning t2 object===>" + t2);

		Test22 t2_clone = (Test22) t2.clone();
		System.out.println("Clone object before chnage ===>" + t2_clone);
		t2_clone.a = 100;
		t2_clone.c.x = 300;

		System.out.println("After Cloning t2 object ===>" + t2);

		System.out.println("Cloned Oject ===> " + t2_clone);
		
		System.out.println("*********************8");

		Test5 t5 = new Test5();
		t5.a = 10;
		t5.b = 20;
		t5.x = 30;
		t5.y = 40;
		System.out.println("Before Cloning t2 object===>" + t5);

		Test5 t5_clone = (Test5) t5.clone();
		t5_clone.a = 100;
		t5_clone.x = 300;
		System.out.println("After Cloning t2 object===>" + t5);
		System.out.println("Cloned Object ===>" + t5_clone);

	}
}

class Test_1 {
	int x, y;
}

class Test22 implements Cloneable {
	int a;
	int b;
	Test_1 c = new Test_1();

	public Object clone() throws CloneNotSupportedException {

		//Test22 test22 = (Test22) super.clone();
		//test22.c = new Test_1();
		//test22.c.x = c.x;
		//test22.c.y = c.y;

		Test_1 t1 = new Test_1();
		t1.x = c.x;
		t1.y = c.y;

		Test22 test22 = new Test22();
		test22.a = a;
		test22.b = b;
		test22.c = t1;

		return test22;

	}

	@Override
	public String toString() {

		return "Value Of a : " + a + "Value Of b : " + b + " Value of x " + c.x + " Value Of y " + c.y;
	}
}

class Test5 extends Test implements Cloneable {
	int a;
	int b;

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {

		return "Value Of a : " + a + "Value Of b : " + b + " Value of x " + x + " Value Of y " + y;
	}
}
