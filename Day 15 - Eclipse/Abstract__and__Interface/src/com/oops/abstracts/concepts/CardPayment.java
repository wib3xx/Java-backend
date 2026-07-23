package com.oops.abstracts.concepts;

public class CardPayment extends Payment {

	@Override
	public void pay() {
		System.out.println("Payment with card");
		
	}

	@Override
	public void suspend() {
		System.out.println("Suspend payment with card");
		
	}

	@Override
	public void stopPayment() {
		System.out.println("Stop payment using card");
		
	}

	
}
