package lang_package;

import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class getClass_example {
	public static void main(String[] args) throws SQLException {
		String o = new String("Sanjay");
		Class c = o.getClass();
		System.out.println("Fully Qualified Class Name ====>" + c.getName());
		Method[] m = c.getDeclaredMethods();
		for (Method method : m) {
			System.out.println(method.getName());
		}
		//Connection con = DriverManager.getConnection(null, null, null);
	}
}
