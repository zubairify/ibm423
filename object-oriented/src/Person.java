
public class Person implements Cloneable {
	private String name;
	private int age;
	
	public Person() {
		this("Anonymous", -1);	// Constructor chaining
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void print() {
		System.out.println("Name: " + name + "\tAge: " + age);
	}
	
	@Override
	public String toString() {
		return "Name: " + name + "\tAge: " + age;
	}
	
	@Override
	public boolean equals(Object obj) {
//		if(obj instanceof Person) {
//			Person p = (Person) obj;
		if(obj instanceof Person p) {	// Enhanced instanceof in Java 14
			if(p.name.equals(name) && p.age == this.age)
				return true;
		}
		return false;
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		Person p1 = new Person("Polo", 21);
		
		System.out.println(p1.hashCode());
		System.out.println(p1);	// implicitly calling toString()
		
		Person p2 = new Person("Polo", 21);
		
		System.out.println(p1.equals(p2));
		
		Person pc = (Person) p2.clone();
		
		System.out.println(pc);
	}
}
