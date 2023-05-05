package com.ibm.bank;

public class Transaction {
	private String txnType;
	private double txnAmount;
	private double balance;
	
	public Transaction() {
	}

	public Transaction(String txnType, double txnAmount, double balance) {
		this.txnType = txnType;
		this.txnAmount = txnAmount;
		this.balance = balance;
	}
	
	public void print() {
		System.out.println(txnType + "\t" + txnAmount + "\t" + balance);
	}
}
