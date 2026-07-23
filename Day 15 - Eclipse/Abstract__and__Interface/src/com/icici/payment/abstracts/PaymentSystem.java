package com.icici.payment.abstracts;

public abstract class PaymentSystem {

	PaymentSystem(){
		System.out.println("======================= ICICI BANK =======================");
	}
	
		public abstract void transferAmount();
		public abstract void recieveAmount();
		public abstract void cancelTransaction();
		
		public void checkPaymentStatus() {
			System.out.println("Checking Payment Status: Initialized");
		}
	
}
