package ex1;

public class Hello {
	private String greeting;
	
	public Hello() {
		System.out.println("Default constructor");
	}
	
	public Hello(String greeting) {
		this.greeting = greeting;
		System.out.println("Parameterised constructor");
	}

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
		System.out.println("Setter method");
	}
}
