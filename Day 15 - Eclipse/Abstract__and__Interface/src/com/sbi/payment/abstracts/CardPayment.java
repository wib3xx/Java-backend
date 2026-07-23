package com.sbi.payment.abstracts;

public class CardPayment extends PaymentSystem {     //child class

	@Override     //anotation
	public void transfer() {
		System.out.println("Transferring Money using Card");
		
	}

	@Override     //anotation
	public void recieve() {
		System.out.println("Recieving Money using Card");
		
	}

	@Override     //anotation
	public void cancel() {
		System.out.println("Cancelling Card Payment");
	}

	
}
