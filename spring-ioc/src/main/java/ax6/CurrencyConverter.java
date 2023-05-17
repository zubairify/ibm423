package ax6;

import org.springframework.stereotype.Repository;

@Repository("cc")
public final class CurrencyConverter {
	
	private CurrencyConverter() {
	}

	public static double convert(Currency source, Currency target, double amount) {
		double rate = target.dollarValue() / source.dollarValue();
		return rate * amount;
	}
}
