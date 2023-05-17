package ex3;

import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMyLife {

	@Test
	public void testLife() {
		ConfigurableApplicationContext appCtx = new ClassPathXmlApplicationContext("ex3ctx.xml");
		
		appCtx.getBean(MyLife.class);
		
		appCtx.close();
		System.out.println("Application exits");
	}
}
