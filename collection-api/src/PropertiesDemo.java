import java.io.FileReader;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws Exception {
		
		FileReader reader = new FileReader("src/person.txt");
		
		Properties person = new Properties();
		person.load(reader);
		
		System.out.println(person.getProperty("name"));
		System.out.println(person.getProperty("address"));
	}
}
