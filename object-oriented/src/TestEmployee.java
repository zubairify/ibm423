import com.ibm.emp.Clerk;
import com.ibm.emp.Employee;
import com.ibm.emp.Manager;

public class TestEmployee {

	public static void main(String[] args) {
		
		Manager m1 = new Manager("Lili", 5000, 2000);
		
		Clerk c1 = new Clerk("Mili", 3000, 1000);
		
		showSalary(m1);
		showSalary(c1);
		
	}

	private static void showSalary(Employee e) {
		if(e instanceof Manager)
			System.out.println("Manager Salary: " + e.getSalary());
		else
			System.out.println("Clerk Salary: " + e.getSalary());
	}
	
//	private static void showSalary(Clerk c1) {
//		System.out.println("Clerk Salary: " + c1.getSalary());
//	}
//
//	private static void showSalary(Manager m1) {
//		System.out.println("Manager Salary: " + m1.getSalary());
//	}
}
