
public class ConstructorExecutionCheck {
	public static void main(String[] args) {
		C c = new C(5);
		
	}
}

class A {
	
	/* public A(int a) { System.out.println(" INside Cnstructor Call A "+ a); } */
	  
	 
		
		  public A() { System.out.println(" INside Cnstructor Call A "); }
		 
}

class B extends A {
	
	  public B() { //super();
		  System.out.println("INside Constructor B"); 
	  
	  }
	 
	
	  public B(int b) { 
		  //super(5); 
		  System.out.println("Inside Constructor B "+ b);
	  }
	 
}

class C extends B {
	public C(int c) {
		super(6);
		System.out.println("INside Constructor C "+c);
	}
}