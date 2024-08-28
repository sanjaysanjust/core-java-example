package lang_package;

/**
 * 
 * @author SanjayST
 * 
 * If we know the name of the class & if it has a public default constructor we can create an object Class.forName.
 *  We can use it to create the Object of a Class. 
 *  Class.forName actually loads the Class in Java but doesn�t create any Object.
 *   To create an Object of the Class you have to use the new Instance Method of the Class.
 *
 */

public class crt_obj_using_new_instance {
	String name = "SAnjay";
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		Class c = Class.forName("lang_package.crt_obj_using_new_instance");
		
		crt_obj_using_new_instance cobj = (crt_obj_using_new_instance)c.newInstance();
		System.out.println("String value is ====>"+cobj.name);
	}

}
