package com.navi.app;

public class User {

	public static void main(String[] args) {
		
		Account account = new Account(10000 , "Sarvagay Sanmotra");
		
		System.out.println("Avaiable Balance: "+ "Rs. "+ account.checkBalance());
		
		account.recieveAmount(1000);
		System.out.println("Balance after Recieving Money: "+ "Rs. "+ account.checkBalance());
		
		account.transferAmount(5000);
		System.out.println("Balance after Transfering Money: "+"Rs. "+ account.checkBalance());
		
		
	}
	
}
