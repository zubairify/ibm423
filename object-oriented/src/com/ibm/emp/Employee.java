package com.ibm.emp;

public abstract class Employee {
	private int empNo;
	private String empName;
	private double salary;
	
	private static int autogen;
	
	static {	// static initialiser block
		System.out.println("Employee class loaded...");
		autogen = 101;
	}
	
	public Employee() {
	}

	public Employee(String empName, double salary) {
		this.empNo = autogen ++;
		this.empName = empName;
		this.salary = salary;
	}
	
	public double getSalary() {
		return salary;
	}

	public void payslip() {
		System.out.println("Emp No: " + empNo);
		System.out.println("Name: " + empName);
		System.out.println("Salary: " + salary);
	}
}
