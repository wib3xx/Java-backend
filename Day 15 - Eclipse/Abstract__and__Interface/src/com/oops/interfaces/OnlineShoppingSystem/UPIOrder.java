package com.oops.interfaces.OnlineShoppingSystem;

public class UPIOrder extends Order implements IPayment {

	@Override
	public void pay() {
		System.out.println("Payment done by UPI");
		
	}

	

	@Override
	public void verifyPayment() {
		System.out.println("UPI Payment is being verified");
		
	}

	@Override
	public void cancelOrder() {
		System.out.println("Order is cancelled");
		
	}
	@Override
	public void refund() {
		System.out.println("Payment refund on UPI");
		
	}

	@Override
	public void returnOrder() {
		System.out.println("Order is returned");
		
	}

}
