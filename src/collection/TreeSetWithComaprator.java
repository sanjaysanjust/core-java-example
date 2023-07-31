package collection;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetWithComaprator {

	public static void main(String[] args) {

		TreeSet ts = new TreeSet(new ComparatorImplementor());
		ts.add(new StringBuffer("XYZ"));
		ts.add("A");
		ts.add(new StringBuffer("AAA"));
		ts.add(new StringBuffer("AAC"));
		ts.add("AZA");
		ts.add("A");
		ts.add(new StringBuffer("xyz"));
		

		System.out.println(ts);

	}

}

class ComparatorImplementor implements Comparator {
	String obj2 = null;
	String obj1 = null;

	@Override
	public int compare(Object o1, Object o2) {

		this.obj2 = o2.toString();

		this.obj1 = o1.toString();
		
		// Code for Ascending order
		return obj1.compareTo(obj2);

		// Code for Descending order
		//return obj2.compareTo(obj1);
		
		//Code for, If want to have duplicates and also the order of insertion
		//return 1;
		
		//Code for, If want to have duplicates and also the reverse order of insertion
		//return -1;
		
		//Code for, If want to have one insertion
				//return 0;
	}

}
