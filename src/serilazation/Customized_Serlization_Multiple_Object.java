package serilazation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Account1 implements Serializable {
	String usernme = "sanjay";
	transient String pwd = "abcd";
	transient int eid=1234;

	private void writeObject(ObjectOutputStream oos) throws Exception {
		oos.defaultWriteObject();
		String ecrypted_pwd = "123" + pwd;
		oos.writeObject(ecrypted_pwd);
		int e_eid=4444+eid;
		oos.writeInt(e_eid);
	}

	private void readObject(ObjectInputStream ois) throws Exception {
		ois.defaultReadObject();
		String s = (String) ois.readObject();
		pwd = s.substring(3);
		int d_eid =(Integer) ois.readInt();
		eid=d_eid-4444;
	}

	@Override
	public String toString() {

		return "User NAme ===>" + usernme + "  Pwd ===>" + pwd+" eid ===>"+eid;
	}

}

public class Customized_Serlization_Multiple_Object {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Account1 a1 = new Account1();
		System.out.println("Before SRLZN ====>" + a1);
		FileOutputStream fos = new FileOutputStream("custom_ser.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(a1);
		FileInputStream fis = new FileInputStream("custom_ser.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Account1 a2 = (Account1) ois.readObject();
		System.out.println("After SRLZN ====>" + a2);

	}

}

// Here deserialization has to happen in the order serilaization happens. i.e., firstString and then INteger

// Here programmer can't call private methods, private void writeObject and private void readObject. Here JVM will execute these methods.
