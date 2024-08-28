package serilazation;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Externalization_example {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//ext_example ex = new ext_example("sanjay", 10, 20);
		ext_example ex = new ext_example();
		FileOutputStream fos = new FileOutputStream("ser_ex4.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		System.out.println("Beforefter  Externalise ====> " + ex);
		oos.writeObject(ex);

		FileInputStream fis = new FileInputStream("ser_ex4.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		ext_example ext_ex = (ext_example) ois.readObject();
		System.out.println("After  Externalise ====> " + ext_ex);
	}

}

class ext_example implements Externalizable {

	String s="sanjay";
	int i=100;
	int j=200;

	public ext_example() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * public ext_example(String s, int i, int j) { this.s = s; this.i = i; this.j =
	 * j; }
	 */

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(s);
		out.writeInt(i);

	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		s = (String) in.readObject();
		i = (Integer) in.readInt();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "I  ====>" + i + " J ===>" + j + " s ===>" + s;
	}
}

// Here  JVM will always look for no-arg constructor defined externally while deserializing other wise ClassNotFound Exception will be thrown.
// IN extrlzn, transient keyword does not make any difference, As Externalzn will happen fully on programmer will and serlzn will happen and fully controllerd by JVM.