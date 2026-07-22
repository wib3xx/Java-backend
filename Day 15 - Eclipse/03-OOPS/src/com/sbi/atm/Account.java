package com.sbi.atm;

public class Account {

	private String customerName;
	private int balance;
	
	public Account(String customerName, int balance) {
		super();
		this.customerName = customerName;
		this.balance = balance;
	}
	public void deposit(int amount) {
		if(amount>0) {
			balance = balance + amount;
		}
	}
	public void withdraw(int amount) {
		if(amount<=balance) {
			balance = balance - amount;
		} else {
			System.out.println("Insufficient Funds ");
			}
	}
	public int checkBalance() {
		return balance;
	}
	public String checkCustomerName() {
		return customerName;
	}
}
