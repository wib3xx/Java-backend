package com.icici.payment.abstracts;

public class CardPayment extends PaymentSystem {

	@Override
	public void transferAmount() {
		System.out.println("Card: Transferring");
		
	}

	@Override
	public void recieveAmount() {
		System.out.println("Card: Recieving Amount");
		
	}

	@Override
	public void cancelTransaction() {
		System.out.println("Cancelling Transaction");
		
	}

}
