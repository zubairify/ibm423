package ax5;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMessageProcess {

	@Test
	public void testProcess() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("appctx.xml");
		
		MessageProcessor mp = (MessageProcessor) ctx.getBean("mp");
		
		mp.process("sms", "9984843832", "Hello");
		mp.process("email", "zubair@mail.com", "Bonjour");
		mp.process("wap", "@zubair", "Aloha");
	}
}
