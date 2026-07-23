package com.icici.payment.abstracts;

public class Driver {

	public static void main(String[] args) {
		UPIPayment upi = new UPIPayment();
			upi.transferAmount();
			upi.recieveAmount();
			upi.cancelTransaction();
			upi.checkPaymentStatus();
			System.out.println();
			
		CardPayment card = new CardPayment();
			card.transferAmount();
			card.recieveAmount();
			card.cancelTransaction();
			upi.checkPaymentStatus();
			
	}
}
