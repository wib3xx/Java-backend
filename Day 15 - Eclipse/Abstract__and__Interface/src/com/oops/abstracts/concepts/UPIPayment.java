package com.oops.abstracts.concepts;

public class UPIPayment extends Payment{

	@Override
	public void pay() {
		System.out.println("Pay with UPI ");
		
	}

	@Override
	public void suspend() {
		System.out.println("Suspend with UPI");
		
	}

	@Override
	public void stopPayment() {
		System.out.println("Stop with UPI");
		
	}

}
