package com.sbi.payment.abstracts;

public class Driver {

	public static void main(String[] args) {
		UPIPayment upi = new UPIPayment();
			upi.transfer();
			upi.recieve();
			upi.cancel();
			upi.checkStatus();
			System.out.println();
		
			CardPayment card = new CardPayment();
			card.transfer();
			card.recieve();
			card.cancel();
			card.checkStatus();
		  
	}
	
}
