package com.sbi.user;

public class MoreSBIUsers {

	private String userName;
	private String userId;        //instance variables
	private String pwd;
	private int balance;

	
	//MoreSBIUsers(){
		//returns nothing because it does'nt expect any args
	//}
	
	MoreSBIUsers(String _userName, String _userId ,String _pwd , int _balance){
		
		
		this.userName = _userName;
		this.userId = _userId;        //local variables to initialize state to Instance variables
		this.pwd = _pwd;
		this.balance = _balance;
			System.out.println(userName +", "+ userId+ ", "+ pwd+ ", "+ balance);
	}
	
	public static void main(String[] args) {
		
		MoreSBIUsers Sarvagay = new MoreSBIUsers("Sarvagay123", "210306@xyz", "sar@123", 50000); //constructor is used to build object
		MoreSBIUsers Monika = new MoreSBIUsers("Monika123", "2100@xyz", "mon@123", 10000);
	}
	
}
