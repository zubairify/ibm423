
class EventImpl implements Event {

	@Override
	public void perform() {
		System.out.println("Class level implementation");
	}
}

public class EventDemo {
	
	class InnerClassImpl implements Event {
		@Override
		public void perform() {
			System.out.println("Inner class implementation");
		}
	}

	static class StaticInnerClassImpl implements Event {
		@Override
		public void perform() {
			System.out.println("Static inner class implementation");
		}
	}
	
	public void nestedEvent() {
		class NestedEventImpl implements Event {
			@Override
			public void perform() {
				System.out.println("Nested event implementation");
			}
		};
		new NestedEventImpl().perform();
	}
	
	public void oneMoreEvent() {
		Event e = new Event () {
			@Override
			public void perform() {
				System.out.println("Anonymous event implementation");
			}
		};
		e.perform();
	}
	
	public void oneLastEvent() {
		Event e = () -> System.out.println("Lambda event implementation");
		e.perform();
	}
	
	public static void main(String[] args) {
		EventImpl e1 = new EventImpl();
		e1.perform();
		
		EventDemo demo = new EventDemo();
		InnerClassImpl ici = demo.new InnerClassImpl();
		ici.perform();
		
		EventDemo.StaticInnerClassImpl sic = new EventDemo.StaticInnerClassImpl();
		sic.perform();
		
		demo.nestedEvent();
		demo.oneMoreEvent();
		demo.oneLastEvent();
		
	}
}
