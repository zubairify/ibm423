
public class Person implements Comparable<Person> {
	private String name;
	private int age;	
	
	public Person() {
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		return "Person [Name=" + name + ", Age=" + age + "]";
	}
	@Override
	public int compareTo(Person p) {
		return this.age - p.age;
	}
}
