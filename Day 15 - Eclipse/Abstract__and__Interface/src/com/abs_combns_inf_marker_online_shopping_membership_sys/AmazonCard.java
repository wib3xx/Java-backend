package com.abs_combns_inf_marker_online_shopping_membership_sys;

public class AmazonCard extends Shopping implements IPayment{

	@Override
	public void makePayment() {
		System.out.println("Payment Paid using Card");
		
	}

	@Override
	public void refundPayment() {
		System.out.println("Payment refunded to the source");
		
	}

	@Override
	void placeOrder() {
		System.out.println("Order has been placed");
		
	}

	@Override
	void cancelOrder() {
		System.out.println("Order has been cancelled");
		
	}

}
