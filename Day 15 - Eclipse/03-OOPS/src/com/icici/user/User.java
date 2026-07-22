package com.icici.user;

import com.icici.account.Account;

public class User {

	public static void main(String[] args) {
		
		Account account = new Account();
              
		System.out.println("Before Setting Balance"+" Rs."+ account.getBalance());        
		account.setBalance(2000);
		System.out.println("After Setting Balance"+" Rs."+ account.getBalance());
	}
	
}
