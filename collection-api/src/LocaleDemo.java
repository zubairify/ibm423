import java.util.Locale;
import java.util.ResourceBundle;

public class LocaleDemo {

	public static void main(String[] args) {
		
//		ResourceBundle labels = ResourceBundle.getBundle("labels");
		
//		ResourceBundle labels = ResourceBundle.getBundle("labels", Locale.FRANCE);
		
		Locale desi = new Locale("hi");
		ResourceBundle labels = ResourceBundle.getBundle("labels", desi);
		
		System.out.println(labels.getString("greeting"));
		System.out.println(labels.getString("message"));
	}
}
