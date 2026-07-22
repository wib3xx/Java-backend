package com.phonepay.upi;

public class UPI {

	public static void main(String[] args) {
		Account account = new Account(10000, "Sarvagay Sanmotra");
		
		System.out.println("Account Balance: "+"Rs." + account.checkBalance());
		
		account.recieveAmount(1000);
		System.out.println("Amount Recieved: Rs.1000, Available Balance: "+"Rs."+ account.checkBalance());
		
		account.transferAmount(20000);
		System.out.println("Amount Transfered: Rs.2000, Available Balance: "+ "Rs" + account.checkBalance());
		
	}
	
}
