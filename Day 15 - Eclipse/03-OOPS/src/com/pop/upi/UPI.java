package com.pop.upi;

public class UPI {

	public static void main(String[] args) {
		Account account = new Account(10000, "Sarvagay");
		System.out.println("Available Balance: Rs."+ account.checkBalance());
		
		account.sendMoney(1000);
		System.out.println("Available Balance after sending money: Rs."+ account.checkBalance());
		
		account.recieveMoney(5000);
		System.out.println("Available Balance after Recieving money: Rs."+ account.checkBalance());
	}
	
}
