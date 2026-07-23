package com.oops.interfacee.concepts;

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
