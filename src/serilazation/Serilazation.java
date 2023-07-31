package serilazation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog implements Serializable {
	int age = 20;
	String name = "abcd";
	transient char[] pwd = { 'a', 'b', 'c', 'd', 'e' };
	static int id = 100;
	final int dob=2023;

	@Override
	public String toString() {

		return "Value OF Dog ::: Age ===> " + age + "  Name ===>" + name + "  Password ===>" + pwd+"  ID ===>"+id + " DOB ===>"+dob;
	}
}

public class Serilazation {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Dog d1 = new Dog();
		System.out.println("Dog Object Before serilization ===>" + d1);

		// Serilazation
		FileOutputStream fos = new FileOutputStream("ser_file.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		d1.id=2000;
		d1.age=35;
		
		System.out.println("Dog Object After serilization (static value chnage)===>" + d1);
		
		
		// Deserialization
		FileInputStream fis = new FileInputStream("ser_file.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog d2 = (Dog) ois.readObject();
		System.out.println("Dog Object After deSerilization ===>" + d2);
	}
}

// All transient variables will be assigned to its respective default values during deserilzation.

// All static members of a class will not participate in serilization/desrilization. Its value will not be serilaized, Any changes to static values will be reflected

// Applying transient key word to a static variable will not have any impact, i.e., Static variable will be having no impact.

// Final varibales will be participated in serilazation, Declaring a final variable as transient has no impact on the serilazation, final variables are resolved to its value at the compile time only, So applying transient to a variable at run time will have no imapct
