package com.oops.interfaces.concepts01;

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
