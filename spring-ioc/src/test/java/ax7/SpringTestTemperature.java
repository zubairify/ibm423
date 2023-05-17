package ax7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "classpath:appctx.xml")
public class SpringTestTemperature {

//	@Autowired
//	private ApplicationContext ctx;
	
	@Autowired
	private TemperatureConverter tc;

	@Test
	public void testFtoc() {
//		TemperatureConverter tc = (TemperatureConverter) ctx.getBean("temp");

		int c = tc.ftoc(102);
		Assertions.assertEquals(38, c);
	}

	@Test
	public void testCtof() {
//		TemperatureConverter tc = (TemperatureConverter) ctx.getBean("temp");

		int f = tc.ctof(36);
		Assertions.assertEquals(96, f);
	}
}
