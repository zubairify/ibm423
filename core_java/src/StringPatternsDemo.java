
public class StringPatternsDemo {

	public static void main(String[] args) {
		
		String name = "Zubair";
		String namePattern = "[A-Z][a-z]{3,}";
		System.out.println(name.matches(namePattern));
		
		String mobile = "7484373429";
		String mobilePattern = "[7-9][0-9]{9}";
		
		String email = "zubair@mail.com";
		String emailPattern = "[a-zA-Z0-9+_.]+@[a-z0-9.]+[a-z]{2,}$";
		
	}
}
