package generics;

import java.util.ArrayList;

public class testNameErasureError {
	// Here compiler first compiles the file with generics and then tries to recompile the file without generics,
	//While recompiling without generics method signature becomes i.e., test(Arraylist s),test(Arraylist l) this violates polymarphism and throws CE exception
	
//	public void test(ArrayList<String> s) {
//		
//	}
//	public int test(ArrayList<Integer> l) {
//		return 10;
//	}

}
