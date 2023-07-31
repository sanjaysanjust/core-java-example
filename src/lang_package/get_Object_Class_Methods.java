package lang_package;

import java.lang.reflect.Method;

public class get_Object_Class_Methods {
public static void main(String[] args) throws ClassNotFoundException {
	Class c = Class.forName("java.lang.Object");
	int cnt=0;
	Method[] m = c.getDeclaredMethods();
	
	for(Method m1 : m) {
		System.out.println(m1.getName());
		cnt++;
	}
	System.out.println(cnt);
}
}
/*finalize
wait
wait
wait
equals
toString
hashCode
getClass
clone
notify
notifyAll
registerNatives
 * 
 */
 
