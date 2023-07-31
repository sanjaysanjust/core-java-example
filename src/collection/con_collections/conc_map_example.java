package collection.con_collections;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class conc_map_example {
public static void main(String[] args) {
	//PUT method example
	// putIfAbsent puts the value only key is absent, other wise it will not put the value
	HashMap m = new HashMap();
	m.put(1, "A");
	m.put(2, "B");
	m.putIfAbsent(1, "C");
	m.putIfAbsent(3, "C");
	System.out.println(m);
	System.out.println("**********************************");
	//Remove method example
	HashMap m1 = new HashMap();
	m1.put(1, "A");
	m1.put(2, "B");
	//replace method will replace only if both key and value exactly matches with the old value otherwise it returns false
	System.out.println(m1.replace(1, "A","D"));
	System.out.println(m1.replace(2, "A","E"));
	System.out.println(m1.replace(2, "B","E"));
	System.out.println(m1);
	System.out.println("**********************************");
	//Replace Method
	HashMap m2 = new HashMap();
	m2.put(1, "A");
	m2.put(2, "B");
	//remove method will remove only if both key and value exactly matches with the old value otherwise it returns false
	System.out.println(m2.remove(1,"C"));
	System.out.println(m2);
	System.out.println(m2.remove(1,"A"));
	System.out.println(m2);
	
}
}
