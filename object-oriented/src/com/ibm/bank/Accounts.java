package com.ibm.bank;

import java.util.Vector;

/**
 * This class represents generic bank account.
 * @author Zubair Shaikh
 * @version 1.0
 */
public abstract class Accounts implements Bank {
	
	private int acntNo;
	private String holder;
	protected double balance;
	
	private static int autogen = INIT_ACCOUNT_NO;
	
	protected Vector<Transaction> txns;
	
	/** This is the default constructor */
	public Accounts() {
	}

	/**
	 * Parameterised constructor to open account.
	 * @param holder
	 * @param balance
	 */
	public Accounts(String holder, double balance) {
		this.acntNo = autogen ++;
		this.holder = holder;
		this.balance = balance;
		
		txns = new Vector<>();
		txns.add(new Transaction("OB", balance, balance));
	}
	
	/** Print the summary of bank account. */
	public void summary() {
		System.out.println("A/C No: " + acntNo);
		System.out.println("Holder: " + holder);
		System.out.println("Balance: " + balance);
	}
	
	// BL Methods
	public void deposit(double amount) {
		balance += amount;
		txns.add(new Transaction("CR", amount, balance));
	}
	
	public void statement() {
		System.out.println("Statement of A/C: " + acntNo);
		System.out.println("Type\tAmount\tBalance");
		for(Transaction t : txns) 
			t.print();
	}
}
