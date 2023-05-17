package ax3;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import ax5.Message;
import ax5.MessageProcessor;

@Component
public class MyLife {
	
//	@Autowired
////	@Qualifier("sms")
//	private Message msg;

	@Autowired
	private MessageProcessor mp;
	
	public MyLife() {
		System.out.println("MyLife Constructor");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Pre life-cycle method");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Post life-cycle method");
	}
}
