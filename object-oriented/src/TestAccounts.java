import com.ibm.bank.AccountFactory;
import com.ibm.bank.BalanceException;
import com.ibm.bank.Bank;

public class TestAccounts {

	public static void main(String[] args) {
	
		Bank s = AccountFactory.openSavingsAccount("Polo");
		
		s.deposit(1000);
		s.deposit(2000);
		s.deposit(1500);
		s.deposit(3000);
		try {
			s.withdraw(2000);
			s.withdraw(1000);
		} catch (BalanceException e) {
//			e.printStackTrace();	// Developers
//			System.out.println(e);	// Logging
			System.out.println(e.getMessage());	// End users
		}
		
		s.statement();
		
	}
}
