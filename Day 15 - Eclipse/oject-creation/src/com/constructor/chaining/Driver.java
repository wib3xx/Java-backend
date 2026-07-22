package com.constructor.chaining;

class paymentSystems extends Object{
	public paymentSystems(String status) {
		super();
	}
	
}

class Payment extends paymentSystems{
	public Payment(){
		super("initialized");
	}	
}

class UPIPayment extends Payment{
	public UPIPayment() {
		super();
	}
	
}

public class Driver {

	public static void main(String[] args) {
		
		UPIPayment p1 = new UPIPayment();
		
	}
}
