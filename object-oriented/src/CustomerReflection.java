import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class CustomerReflection {

	public static void main(String[] args) throws ClassNotFoundException {
//		Customer c1 = new Customer("Jack", 2500);
//		c1.display();
//		
//		Class cc = c1.getClass();
		// ---- OR -----
		
		Class cc = Class.forName("Customer");	// Loads a Java class
		System.out.println(cc.getName());
		
		System.out.println("- List of constructors");
		Constructor[] constructors = cc.getConstructors();
		for (Constructor c : constructors) {
			System.out.println(c);
		}
		
		System.out.println("- List of methods");
		Method[] methods = cc.getMethods();
		for (Method m : methods) {
			System.out.println(m);
		}
		
		System.out.println("- List of declared methods");
		Method[] decMethods = cc.getDeclaredMethods();
		for (Method m : decMethods) {
			System.out.println(m);
		}
		
		// Print all the fileds 
		System.out.println("- List of fields");
		Field[] fields = cc.getDeclaredFields();
		for (Field f : fields) {
			System.out.println(f);
		}
	}
}
