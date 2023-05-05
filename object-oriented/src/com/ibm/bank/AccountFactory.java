package com.ibm.bank;

public final class AccountFactory {
	
	private AccountFactory() {
	}

	public static Savings openSavingsAccount(String holder) {
		return new Savings(holder);
	}
	
	public static Current openCurrentAccount(String holder) {
		return new Current(holder);
	}
}
