//Make a program to Use Encapsulation in PhonePay

package com.phonepay.upi;

public class Account {

	private int balance;                       //variables
	private String name; 
	
	public Account(int balance, String name) {  //Constructors
		super();
		this.balance = balance;
		this.name = name;  
	}

	public void transferAmount(int amount) {     //method
		if(amount <= balance) {    //This is called as validation
			balance = balance - amount;
		}
	}
	
	public void recieveAmount(int amount) {       //method
		if(amount > 0) {                          //conditionals
			balance = balance + amount;
		}
	}
	public int checkBalance() {                 //method
		return balance;
	}
	
}
