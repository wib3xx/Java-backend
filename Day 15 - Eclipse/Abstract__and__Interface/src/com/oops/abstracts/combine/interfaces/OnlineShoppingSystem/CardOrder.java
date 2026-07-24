package com.oops.abstracts.combine.interfaces.OnlineShoppingSystem;

public class CardOrder extends Order implements IPayment {

	@Override
	public void pay() {
		System.out.println("Payment done by Card");
		
	}

	@Override
	public void verifyPayment() {
		System.out.println("Verifying card payment");
		
	}

	@Override
	public void cancelOrder() {
		System.out.println("Cancelling Order");
		
	}
	@Override
	public void refund() {
		System.out.println("Payment refund on card ");
		
	}

	@Override
	public void returnOrder() {
		System.out.println("Returning order");
		
	}

}
