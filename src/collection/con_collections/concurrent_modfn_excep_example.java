package collection.con_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class concurrent_modfn_excep_example extends Thread{
static List l = new ArrayList();

public void run() {
	try {
		Thread.sleep(2000);
	}catch (InterruptedException e) {
		System.out.println(e);
	}
	System.out.println("Child Thread Add Opewration");
	l.add(5);
	
}
public static void main(String[] args) {
	l.add(1);
	l.add(2);
	l.add(3);
	l.add(4);
	concurrent_modfn_excep_example cme = new concurrent_modfn_excep_example();
	cme.start();
	Iterator it =l.iterator();
	while(it.hasNext()) {
		int s1 = (int) it.next();
		System.out.println(s1);
		System.out.println("Current Thread Execution");
		try {
		Thread.sleep(3000);
		}catch (InterruptedException e) {
			// TODO: handle exception
		}
	}
	
}

}
