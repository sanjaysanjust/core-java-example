package serilazation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog1 implements Serializable {
	int age = 10;
	String name = "abc";
	smalldog sm =new smalldog();
}

class Cat implements Serializable {
	int age = 10;
	String name = "abc";
}

class Rat implements Serializable {
	int age = 10;
	String name = "abc";
}

public class Ser_multiple_Object {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileOutputStream fos = new FileOutputStream("ser_ex.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(new Dog1());
		oos.writeObject(new Cat());
		oos.writeObject(new Rat());

		FileInputStream fis = new FileInputStream("ser_ex.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog1 d2 = (Dog1) ois.readObject();
		Cat c2 = (Cat) ois.readObject();
		Rat r1 = (Rat) ois.readObject();
		

	}

}

// Multiple objects can be serialized to a single file. It will be serialized in the same sequence. Desrializarion also has to happen in the same way serilization happened. Other wise class cast exception will be thrown

// Example code to overcome the above sequence issue.

/*
 * public class Ser_multiple_Object { public static void main(String[] args)
 * throws IOException, ClassNotFoundException { FileOutputStream fos = new
 * FileOutputStream("ser_ex.ser"); ObjectOutputStream oos = new
 * ObjectOutputStream(fos); oos.writeObject(new Dog1()); oos.writeObject(new
 * Cat()); oos.writeObject(new Rat());
 * 
 * FileInputStream fis = new FileInputStream("ser_ex.ser"); ObjectInputStream
 * ois = new ObjectInputStream(fis); Object o = ois.readObject();
 * 
 * if (o instanceof Dog1) { Dog1 d2 = (Dog1) o; } else if (o instanceof Cat) {
 * Cat c2 = (Cat) o; } else { Rat r1 = (Rat) o; }
 * 
 * }
 * 
 * }
 */

// Whenever we serilize Objects, All the objects and its refernce objects inside the class must implement serializable interface other wise code may compile fine but RUN time exception will occur with CannotCAst exception
class smalldog implements Serializable{
	int age=30;
	String name= "assd";
	}