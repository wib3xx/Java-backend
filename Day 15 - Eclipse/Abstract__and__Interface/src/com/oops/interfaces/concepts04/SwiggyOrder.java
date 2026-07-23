package com.oops.interfaces.concepts04;

public class SwiggyOrder implements IFoodDeliveryApp {

	@Override
	public void placeOrder() {
		System.out.println("============= Swiggy Order Details =============");
		System.out.println("Placing Swiggy Order");
		
	}

	@Override
	public void cancelOrder() {
		System.out.println("Cancelling Swiggy Order");
		
	}

	@Override
	public void trackOrder() {
		System.out.println("Tracking Swiggy Order");
		
	}

	@Override
	public void makePayment() {
		System.out.println("Making Payment for Swiggy Order");
		
	}

	@Override
	public void rateRestaurant() {
		System.out.println("Rating Swiggy Restaurant");
		
	}

	@Override
	public void scheduleDelivery() {
		// TODO Auto-generated method stub
		
	}

}
