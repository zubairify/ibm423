package com.ibm.emp;

public class Clerk extends Employee {
	private double commission;

	public Clerk() {
	}

	public Clerk(String empName, double salary, double commission) {
		super(empName, salary);
		this.commission = commission;
	}

	@Override
	public double getSalary() {
		return super.getSalary() + commission;
	}

	@Override
	public void payslip() {
		super.payslip();
		System.out.println("Commission: " + commission);
	}
}
