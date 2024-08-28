package lang_package;

public class equlas_example extends Thread implements Runnable{

	int rollno;
	String name;

	public equlas_example(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}

	public static void main(String[] args) {
		equlas_example eq1 = new equlas_example(0, "SAnjay");
		equlas_example eq2 = new equlas_example(1, "Kumar");
		equlas_example eq3 = new equlas_example(0, "SAnjay");
		equlas_example eq4 = eq1;
		System.out.println(eq1.equals(eq4));
		System.out.println(eq2.equals(eq1));
		System.out.println(eq3.equals(eq4));
		System.out.println(eq3.equals("SAnjay"));
		System.out.println(eq3.equals(null));
		
		Integer i =new Integer(10);
		Integer j = new Integer(10);
		System.out.println(i == j);
		System.out.println(i.equals(j));
	}

	@Override
	public boolean equals(Object obj) {
		// This to check of they both the object refernce are same, So that it will avoid going to the subsequent part of the code to return same directly.
		if (obj == this) {
			return true;
		}
		/*
		 * try { String name = this.name; int rno = this.rollno;
		 * 
		 * equlas_example ee = (equlas_example) obj; String name1 = ee.name; int rno1 =
		 * ee.rollno; if (name.equals(name1) && rno == rno1) { return true; } else {
		 * return false; } }catch (ClassCastException e) {
		 * System.out.println("INside return class cast exception"); return false;
		 * }catch(NullPointerException e) {
		 * System.out.println("Null Pointer Exception"); return false; }
		 */
		
		//More simplified version for the above.
		if (obj instanceof equlas_example) {
			equlas_example eq = (equlas_example)obj;			
			if (this.name.equals(eq.name) && this.rollno == eq.rollno) {
				return true;
			}else {
				return false;
			}
			
		}else {
			return false;
		}
	}

}

// We have to handle both class cast exception and Null pointer exception while overriting the equals object all the time by setting false instead of letting the programme to rise the exceptions.

// IN string class equals method is already over written
// In StringBuffer and StringBuilder classes, equals method is not over written
// Object class equals method is always for reference comparison not for content comparison. In String buffer and builder object level equals method will be executed.



// IF r1 == r2 is true then r1.equals(r2) is always true, Becuase both object refernce are same.
//If r1 == r2 is fals then r1.equals(r2) may not be same true, It may return true or flase
//If r1.equals(r2) is false then r1==r2 is always false
//If r1.equals(r2) is  true then we can not concude ny thing about r1 == r2, It may return true or false