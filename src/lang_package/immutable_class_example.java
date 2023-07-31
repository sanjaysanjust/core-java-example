package lang_package;
//The class must be declared as final so that child classes can’t be created.
//Data members in the class must be declared private so that direct access is not allowed.
//Data members in the class must be declared as final so that we can’t change the value of it after object creation.
//A parameterized constructor should initialize all the fields performing a deep copy so that data members can’t be modified with an object reference.
//Deep Copy of objects should be performed in the getter methods to return a copy rather than returning the actual object reference)

final public class immutable_class_example {
	private int i;

	public immutable_class_example(int i) {
		this.i = i;
	}

	public immutable_class_example modify(int i) {
		if (this.i == i) {
			return this;
		} else {

			return (new immutable_class_example(i));
		}
	}
	
	public static void main(String[] args) {
		immutable_class_example ex1= new immutable_class_example(10);
		immutable_class_example ex2 = new immutable_class_example(100);
		immutable_class_example ex3=ex1;
		System.out.println(ex1 == ex2);
		System.out.println(ex1 == ex3);
		
		
		System.out.println(":::::::::::::::::::::::::");
		 Student1 s = new Student1("ABC", 101);
		 
	        // Calling the above methods 1,2 of class1
	        // inside main() method in class2 and
	        // executing the print statement over them
	        System.out.println(s.getName());
	        System.out.println(s.getRegNo());
	        
	 
	        // Uncommenting below line causes error
	        // s.regNo = 102;
	}

}

final class Student1 {
	 
    // Member attributes of final class
    private final String name;
    private final int regNo;
   
 
    // Constructor of immutable class
    // Parameterized constructor
    public Student1(String name, int regNo)
    {
 
        // This keyword refers to current instance itself
        this.name = name;
        this.regNo = regNo;        
    } 
    // Method 1
    public String getName() { return name; }
 
    // Method 2
    public int getRegNo() { return regNo; }   
    // Note that there should not be any setters  
}
 

