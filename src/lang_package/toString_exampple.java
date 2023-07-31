package lang_package;

import java.util.ArrayList;

/*
 * We need to override Object Class toString method to represent the object we use Ex.Student,Test Etc. Other wise Oject class toString method will return its own string format.
 */
public class toString_exampple {
	public static void main(String[] args) {
	student s =new student();
	System.out.println(s);
	// String Class by default toString method is overridden
	String str= new String("Sanjay");
	System.out.println(str);
	// Wrapper class toString method by default will be overridden.
	Integer i = new Integer(10);
	System.out.println(i);
	// ArrayList class toString method by default will be overridden.
	ArrayList al = new ArrayList();
	al.add(1);
	al.add(2);
	System.out.println(al);

	}
}
//IMPORTENT : All wrapper classes, StringBuffer Stringbuilder classes toString() method by default will be overidden.
class student{
	
}

