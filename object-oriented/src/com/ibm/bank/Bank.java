package com.ibm.bank;

public interface Bank {
	// Constants
	int INIT_ACCOUNT_NO = 10001;
	double MIN_SAVINGS_BAL = 1000;
	double INIT_CURRENT_BAL = 5000;
	double MIN_CURRENT_BAL = 0;
	double OVERDRAFT_LIMIT = 10000;

	void summary();

	void deposit(double amount);

	void withdraw(double amount) throws BalanceException;
	
	void statement();
}
