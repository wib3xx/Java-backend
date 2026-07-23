package com.oops.abstracts.concepts;

public class Driver {

	public static void main(String[] args) {
		UPIPayment upi = new UPIPayment();
		upi.pay();
		upi.suspend();
		upi.stopPayment();
		upi.checkStatus();
		System.out.println();
		
		CardPayment card = new CardPayment();
		card.pay();
		card.suspend();
		card.stopPayment();
		card.checkStatus();
		System.out.println();
	}
	
	
}
