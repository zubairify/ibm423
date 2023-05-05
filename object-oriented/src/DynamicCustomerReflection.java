import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class DynamicCustomerReflection {

	public static void main(String[] args) throws Exception {
		// Manually loading Customer class
		Class cc = Class.forName("Customer");
		
		// Referring to default constructor with null arguments
		Constructor dc = cc.getConstructor(null);
		System.out.println(dc);
		
		// Instantiating object using default constructor
		Object oc = dc.newInstance(null);
		System.out.println(oc);
		
		// Referring to display method takes null arguments
		Method disp = cc.getDeclaredMethod("display", null);
		System.out.println(disp);
		
		// Invoking display method on oc object with null parameters
		disp.invoke(oc, null);
	}
}
