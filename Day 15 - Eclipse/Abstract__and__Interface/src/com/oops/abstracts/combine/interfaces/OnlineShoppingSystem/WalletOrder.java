package com.oops.abstracts.combine.interfaces.OnlineShoppingSystem;

public class WalletOrder extends Order implements IPayment{

	@Override
	public void pay() {
		System.out.println("Payment done by wallet");
		
	}

	

	@Override
	public void verifyPayment() {
		System.out.println("Verifying wallet payment");
		
	}

	@Override
	public void cancelOrder() {
		System.out.println("Cancelling order");
		
	}
	@Override
	public void refund() {
		System.out.println("Initiatining refund to wallet");
		
	}

	@Override
	public void returnOrder() {
		System.out.println("Returning order");
		
	}

}
