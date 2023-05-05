package com.ibm.emp;

public class Manager extends Employee {
	private double incentives;

	public Manager() {
	}

	public Manager(String empName, double salary, double incentives) {
		super(empName, salary);	// constructor chaining
		this.incentives = incentives;
	}

	@Override
	public double getSalary() {
		return super.getSalary() + incentives;
	}

	@Override
	public void payslip() {
		super.payslip();
		System.out.println("Incentives: " + incentives);
	}
}
