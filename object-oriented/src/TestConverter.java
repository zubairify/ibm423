import com.ibm.xe.Currency;
import com.ibm.xe.CurrencyConverter;
import com.ibm.xe.Dollar;
import com.ibm.xe.Pound;
import com.ibm.xe.Rupee;

public class TestConverter {

	public static void main(String[] args) {
		
		Dollar usd = new Dollar();
		Rupee inr = new Rupee();
		Currency ukp = new Pound();
		
		System.out.println(CurrencyConverter.convert(usd, inr, 10));
		
		System.out.println(CurrencyConverter.convert(inr, usd, 1000));
		
		System.out.println(CurrencyConverter.convert(ukp, inr, 10));
		
	}
}
