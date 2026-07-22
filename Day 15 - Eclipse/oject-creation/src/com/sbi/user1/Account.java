package com.sbi.user1;

public class Account {

	private String name;
	private int balance;
	
	Account(){
		this("Sar@123", 10000 );
		
	}
	
	Account(String _name, int _balance){
		super();
		this.name = _name;
		this.balance = _balance;
		System.out.println(name);
		System.out.println(balance);
	}
	
	Account(int _balance, String _name){
		this.name= _name;
		this.balance = _balance;
		
		System.out.println(name);
		System.out.println(balance);
	}
}