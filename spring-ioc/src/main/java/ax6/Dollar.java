package ax6;

import org.springframework.stereotype.Component;

@Component("usd")
public class Dollar implements Currency {

	@Override
	public double dollarValue() {
		return 1.0;
	}

}
