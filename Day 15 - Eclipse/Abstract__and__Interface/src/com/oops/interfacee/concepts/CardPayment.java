package com.oops.interfacee.concepts;

public class CardPayment implements IPaymentSystem {

	@Override
	public void pay() {
		System.out.println("Card Payment");
		
	}

	@Override
	public void settle() {
		System.out.println("Card Settlement");
		
	}

}
