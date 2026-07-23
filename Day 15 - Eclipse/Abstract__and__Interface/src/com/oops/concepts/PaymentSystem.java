package com.oops.concepts;

public abstract class PaymentSystem { //declare abstract and normal methods    //parent class

	PaymentSystem(){
		System.out.println("Payment status");
	}
	
	public abstract void doTxn();         //Abstraction
	public abstract void suspendTxn();   //Concept which happening here is //WHAT concept
	
	public void sendSms() {  //Non Abstract method   --> Normal Method
		                   
	}
}

class UPIPayment extends PaymentSystem{     //child class-->  //Inheritence
	
	@Override   // Method Overriding Polymorphism 
	public void doTxn() {
		// //Concept which happening here is //HOW concept
		System.out.println("Transaction Successful");
	}

	@Override  //method overriding--> Polymorphism 
	public void suspendTxn() {
		System.out.println("Transaction declined!");
		
	}

	UPIPayment(){
		super();
		System.out.println("UPI payment in progress!");
	}
	
}

