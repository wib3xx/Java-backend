package com.sbi.payment.abstracts;

public class UPIPayment extends PaymentSystem {        //child class

	@Override
	public void transfer() {
		System.out.println("Transferring Money using UPI");
	}

	@Override
	public void recieve() {
		System.out.println("Recieving Money using UPI");
		
	}

	@Override
	public void cancel() {
		System.out.println("Cancelling Transaction!!");
		
	}

}
