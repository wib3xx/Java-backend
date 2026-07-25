package com.abs_combns_inf_marker_online_shopping_membership_sys;

public class AmazonWallet extends Shopping implements IPayment, PrimeMember{

	@Override
	public void makePayment() {
		System.out.println("Payment Paid using Wallet");
		
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
