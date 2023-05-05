import com.ibm.stock.Broker;
import com.ibm.stock.Exchange;
import com.ibm.stock.Holder;
import com.ibm.stock.StockSingleton;

public class TestStock {

	public static void main(String[] args) {
		
		Holder h = StockSingleton.getStock();
		h.viewQuote();
		
		Broker b = StockSingleton.getStock();
		b.viewQuote();
		b.getQuote();
		
		Exchange x = StockSingleton.getStock();
		x.viewQuote();
		x.getQuote();
		x.setQuote();
		
		System.out.println(h == b);
		System.out.println(h == x);
	}
}
