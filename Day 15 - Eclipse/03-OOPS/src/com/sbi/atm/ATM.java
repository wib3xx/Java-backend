package com.sbi.atm;

public class ATM {
	public static void main(String[] args) {
		
		Account account = new Account("Sarvagay Sanmotra", 10000);

		System.out.println("Available Balance: "+ account.checkBalance());
		
		account.deposit(1000);
		System.out.println("Available Balance after Deposit: "+ "Rs."+ account.checkBalance());
		
		account.withdraw(15000);
		System.out.println("Available Balance after Withdraw:"+ "Rs"+ account.checkBalance());
		
	}
	
	
	
}
