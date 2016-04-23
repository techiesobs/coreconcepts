package com.kensiris.java8.samples.invoice.model;

public class Invoice {

	
	private double amount;

	public Invoice(double d) {
		this.amount = d;
	}

	public double getAmount() {
		return amount;
	}
	
	@Override
	public String toString() {
		return "Amount: "+amount;
	}
}
