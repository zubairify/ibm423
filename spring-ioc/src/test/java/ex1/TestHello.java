package ex1;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHello {

	@Test
	public void testHello() {
		ApplicationContext appCtx = new ClassPathXmlApplicationContext("ex1ctx.xml");
		
		Hello h = (Hello) appCtx.getBean("hi");
		System.out.println("Greeting: " + h.getGreeting());
		
	}
}
