package com.pop.upi;

public class Account {

	private int balance;
	private String name;
	
	public Account(int balance, String name) {
		super();
		this.balance = balance;
		this.name = name;
	}

	public void sendMoney(int amount) {
		if(amount <= balance) {
			balance = balance - amount;
		}
	}
	
	public void recieveMoney(int amount) {
		if(amount>0) {
			balance = balance + amount;
		}
	}
	
	public int checkBalance() {
		return balance;
	}
}
