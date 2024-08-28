package serilazation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class animal2 {
	int i=10;
}

class dog3 extends animal2 implements Serializable{
	int j = 20;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "i===>"+i+"  j===>"+j;
	}
}

public class serialization_wrt_inheritence {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileOutputStream fos = new FileOutputStream("ser_ex4.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);		
		dog3 d =new dog3();
		d.i=100;
		d.j=200;
				
		System.out.println("Before Seri ===>"+ d);
		oos.writeObject(d);	
		
		FileInputStream fis = new FileInputStream("ser_ex4.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		dog3 d2= (dog3)ois.readObject();
		System.out.println("After deSeri  ===>"+d2);
		
	}

}

//When Child class implements serlz but not parent class in that case JVM will always write the instance level assignment value while deserialization happens. i.e., here we have changed the value of i from 10 to 100 before serilization and after desrilization JVM assign the instance level assigment value 10.


//IN this scenarios every parent class should have no arg constuctor other wise InvalidClassException will be thrown by JVM. It may be default constructor OR explicitly provided by programmer.

/*
 * Case 2(a): What happens when a class is serializable, but its superclass is
 * not? Serialization: At the time of serialization, if any instance variable
 * inherits from the non-serializable superclass, then JVM ignores the original
 * value of that instance variable and saves the default value to the file.
 * 
 * De- Serialization: At the time of de-serialization, if any non-serializable
 * superclass is present, then JVM will execute instance control flow in the
 * superclass. To execute instance control flow in a class, JVM will always
 * invoke the default(no-arg) constructor of that class. So every
 * non-serializable superclass must necessarily contain a default constructor.
 * Otherwise, we will get a runtime exception.
 */
