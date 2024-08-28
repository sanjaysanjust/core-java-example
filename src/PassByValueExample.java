import java.util.ArrayList;
import java.util.List;

public class PassByValueExample {
	void changeValue(int i){
		i =i+1;
		System.out.println("Chnage value "+i);
		
	}
	public static void main(String[] args) {
		int i=10;
		primitivePassing p = new primitivePassing();
		System.out.println("i before value change "+i);
		p.changeValue(i);
		System.out.println("i after chnage "+ i);
		
		// Object change implementation.
		List<String> fruitList = new ArrayList<String>();
		fruitList.add("Apple");
		fruitList.add("Orange");
		fruitList.add("Mango");
		objectPassing op = new objectPassing();
		System.out.println("Before ===>"+fruitList);
		op.changeValue(fruitList);
		System.out.println("After ===>"+fruitList);
		op.changeAndAssignnewList(fruitList);
		System.out.println("After ===>"+fruitList);
	}
}

class primitivePassing {
	void changeValue(int i){
		i =i+1;
		System.out.println("Chnage value "+i);
	}
}

class objectPassing {
	
	void changeValue(List lst){
		lst.add("Lemon");
	}
	void changeAndAssignnewList(List lst){
		lst = new ArrayList<String>();
		lst.add("Lemonnew");
		System.out.println("lst inside changeAndAssignnewList ===>"+lst);
		
	}
	
}


//PassByValue: In case of primitives, java always passes the copy of the primitives as a argument to calling method
//PassByValue: In case of object, java always passes the references variable of an argument to the calling method.