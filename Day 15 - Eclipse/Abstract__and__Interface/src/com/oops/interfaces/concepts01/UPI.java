package com.oops.interfaces.concepts01;

public class UPI implements IPaymentSystem {

	@Override
	public void pay() {
		
		System.out.println("UPI Payment");
		
	}

	@Override
	public void settle() {
		
		System.out.println("UPI settle");
	}

	
}
