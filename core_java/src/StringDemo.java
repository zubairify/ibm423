
public class StringDemo {

	public static void main(String[] args) {
		
		String s1 = "Hello";
		String s2 = new String("Hello");
		String s3 = "Hello";
		
		System.out.println(s1);
		// Comparing memory locations
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		
		// Comparing values
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		
		s1 = s1 + "World";
		System.out.println(s1 == s3);
		
		String week = "Sun-Mon-Tue-Wed-Thu-Fri-Sat";
		String[] days = week.split("-");
		for (String day : days) 
			System.out.println(day);
	}
}
