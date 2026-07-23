package com.icici.payment.abstracts;

public class UPIPayment extends PaymentSystem {

	@Override
	public void transferAmount() {
		System.out.println("UPI: Transfer");
		
	}

	@Override
	public void recieveAmount() {
		System.out.println("UPI: Recieving");
		
	}

	@Override
	public void cancelTransaction() {
		System.out.println("Cancelling Transaction");
		
	}

}
