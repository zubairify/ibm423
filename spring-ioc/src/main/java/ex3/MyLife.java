package ex3;

public class MyLife {

	public MyLife() {
		System.out.println("MyLife Constructor");
	}
	
	public void init() {
		System.out.println("Pre life-cycle method");
	}
	
	public void destroy() {
		System.out.println("Post life-cycle method");
	}
}
