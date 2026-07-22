package com.oops.concepts;

public class Driver {
	
	public static void main(String[] args) {
		
		UPIPayment payment = new UPIPayment();
			payment.doTxn();
			payment.suspendTxn();
		
			System.out.println();
	}
}