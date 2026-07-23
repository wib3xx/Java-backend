package com.sbi.payment.abstracts;

public class CardPayment extends PaymentSystem {

	@Override
	public void transfer() {
		System.out.println("Transferring Money using Card");
		
	}

	@Override
	public void recieve() {
		System.out.println("Recieving Money using Card");
		
	}

	@Override
	public void cancel() {
		System.out.println("Cancelling Card Payment");
	}

	
}
