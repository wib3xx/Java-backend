package com.zepto.payment;

public class PaymentService {

	public boolean confirmPayment() {
		System.out.println("Payment Processing...");
		
		//Simulate payment confirmation
		boolean paymentSuccessful = true;
		
		if(paymentSuccessful) {
			System.out.println("Payment Confirmed Successfully !!");
			return true;
		}
		System.out.println("Payment failed.");
		return false;
	}
}
