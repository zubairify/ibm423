package com.ibm.stock;

public class Stock implements Exchange {

	@Override
	public void getQuote() {
		System.out.println("Get quote method");
	}

	@Override
	public void viewQuote() {
		System.out.println("View quote method");
	}

	@Override
	public void setQuote() {
		System.out.println("Set quote method");
	}

}
