package com.sbi.user;

public class SBIUser {

	//instance variables
	private String userId;
	private String userName;
	private String pwd;
	private int balance;
	
	SBIUser(){
		// Constructor which does not expect any arguments
		System.out.println("I am SBIUser() ");  //construct
	}
	
	SBIUser(String _userId, String _userName , String _pwd, int _balance){      //Constructor with local variables
		System.out.println("SBIUser.SBIUser(String _userId, String _userName , String _pwd, int _balance)");
		this.userId = _userId;														//This constructor expect args
		this.userName = _userName;     /*Assigning values from instance variables to local variables */
		this.pwd = _pwd;
		this.balance = _balance;       //This is used for more readability
	}

	public static void main(String[] args) {
	
/*Execution No :1*/ 	System.out.println("SBIUser.main() START HERE");
								//Create an object of SBIUser class
/*Execution No :2*/				SBIUser sbiUser = new SBIUser("210306@sarv", "sarvagay122", "123@123", 50000); //SBIUser class object created using SBIUser() constructor.
								// type ref name = new object created for class SBIUser
/*Execution No :3*/				System.out.println("SBIUSer.main() ENDS HERE");
	
	}
}
