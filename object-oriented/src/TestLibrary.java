import com.ibm.lib.Book;
import com.ibm.lib.Member;

public class TestLibrary {

	public static void main(String[] args) {
		Book b = new Book("The Alchemist");
		Member m = new Member("Polo");
		Book b2 = new Book("Ikigai");
		
		b.status();
		
		m.status();
		
		b.issueBook(m);
		
		b.status();
		m.status();
		
		b.returnBook(m);
		
		b.status();
		m.status();
		
	}
}
