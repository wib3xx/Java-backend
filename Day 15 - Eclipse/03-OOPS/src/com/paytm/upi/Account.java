package com.paytm.upi;

public class Account {

	private int balance;
	private String name;
	
	public Account(int balance, String name) {
		super();
		this.balance = balance;
		this.name = name;
	}

	public void transferAmount(int Amount) {
		if(Amount <= balance) {
			balance = balance - Amount;
		}
	}
	
	public void recieverAmount(int Amount) {
		if(Amount > 0) {
			balance = balance + Amount;
		}
	}
	
	public int checkBalance() {
		return balance;
	}
	
}
