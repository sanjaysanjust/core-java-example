package serilazation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Account implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String usernme = "sanjay";
	transient String pwd = "abcd";

	private void writeObject(ObjectOutputStream oos) throws Exception {
		oos.defaultWriteObject();
		String ecrypted_pwd = "123" + pwd;
		oos.writeObject(ecrypted_pwd);
	}

	private void readObject(ObjectInputStream ois) throws Exception {
		ois.defaultReadObject();
		String s = (String) ois.readObject();
		pwd = s.substring(3);
	}

	@Override
	public String toString() {

		return "User NAme ===>" + usernme + "  Pwd ===>" + pwd;
	}

}

public class Customized_Serlization {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Account a1 = new Account();
		System.out.println("Before SRLZN ====>" + a1);
		FileOutputStream fos = new FileOutputStream("custom_ser.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(a1);
		FileInputStream fis = new FileInputStream("custom_ser.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Account a2 = (Account) ois.readObject();
		System.out.println("After SRLZN ====>" + a2);

	}

}

// Here programmer can't call private methods, private void writeObject and private void readObject. Here JVM will execute these methods.
