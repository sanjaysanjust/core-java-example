package serilazation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class animal implements Serializable {
	int i = 10;
}

class dog2 extends animal {
	int j = 20;
	dog4 g3=new dog4();
	
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "i===>"+i+"  j===>"+j+ "    g3===>"+g3.age+"  name ===>"+g3.name;
	}
}

public class serialization_wrt_inheritence2 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileOutputStream fos = new FileOutputStream("ser_ex4.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		dog2 d =new dog2();
		d.g3.name = "Sanjay";
		System.out.println("Before Seri ===>"+ d);
		oos.writeObject(d);
		FileInputStream fis = new FileInputStream("ser_ex4.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		dog2 d2= (dog2)ois.readObject();
		System.out.println("After Seri  ===>"+d2);
		
	}

}

//Ser. will be inherited to the child objects via inheritence.
// Object class doess not implement serlzn.

// Serilzation throws NotSerializaleException when an instance class is not serilazed. Example: dog4

class dog4 implements Serializable{
	int age=10;
	static String name = "adf";
}
