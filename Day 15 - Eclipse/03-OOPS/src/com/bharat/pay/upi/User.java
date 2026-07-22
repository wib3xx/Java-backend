package com.bharat.pay.upi;

public class User {

	public static void main(String[] args) {
		
		Account account = new Account(1000 , "Sarvagay Sanmotra");

		System.out.println("Available Balance- Rs"+ account.checkBalance());
		
		account.transferAmount(500);
		System.out.println("Balance after Transfering- Rs."+ account.checkBalance());
		
		account.recieveAmount(1000);
		System.out.println("Balance after Reciever Amount- Rs."+ account.checkBalance());	
	}

}
