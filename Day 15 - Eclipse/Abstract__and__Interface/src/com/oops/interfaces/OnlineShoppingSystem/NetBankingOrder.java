package com.oops.interfaces.OnlineShoppingSystem;

public class NetBankingOrder extends Order implements IPayment {

	@Override
	public void pay() {
		System.out.println("Payment done by NetBanking");
		
	}

	

	@Override
	public void verifyPayment() {
		System.out.println("Verifying Netbanking Payment");
		
	}

	@Override
	public void cancelOrder() {
		System.out.println("Cancelling Order");
		
	}
	
	@Override
	public void refund() {
		System.out.println("Initiating Refund to source");
		
	}

	@Override
	public void returnOrder() {
		System.out.println("Returning Order");
		
	}

}
