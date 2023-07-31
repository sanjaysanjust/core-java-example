package collection.con_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class concurrent_modfn_using_chm extends Thread{
static ConcurrentHashMap l = new ConcurrentHashMap();

public void run() {
	try {
		Thread.sleep(2000);
	}catch (InterruptedException e) {
		System.out.println(e);
	}
	System.out.println("Child Thread Add Opewration");
	l.put(3,"E");
	
}
public static void main(String[] args) {
	l.put(1,"A");
	l.put(2,"B");
	l.put(3,"C");
	l.put(4,"D");
	concurrent_modfn_using_chm cme = new concurrent_modfn_using_chm();
	cme.start();
	Set s  = l.keySet();
	Iterator it = s.iterator();
	while(it.hasNext()) {
		int s1 = (int) it.next();
		System.out.println("Key Is ===> " + s1+" And The value is ===>"+l.get(s1));
		System.out.println("Current Thread Execution");
		try {
		Thread.sleep(3000);
		}catch (InterruptedException e) {
			// TODO: handle exception
		}
	}
	
}

}
