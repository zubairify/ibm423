
public class Customer {

	private String name;
	private double limit;
	
	public Customer() {
		System.out.println("Default customer constructor");
		name = "Frank"; limit=1000;
	}

	public Customer(String name, double limit) {
		this.name = name;
		this.limit = limit;
	}
	
	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Limit: " + limit);
	}
}
