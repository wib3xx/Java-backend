package com.oops.interfaces.concepts04;

public class BlinkitOrder implements IFoodDeliveryApp {

	@Override
	public void placeOrder() {
		System.out.println("============= Blinkit Order Details =============");
		System.out.println("Placing Blinkit Order");
		
	}

	@Override
	public void cancelOrder() {
		System.out.println("Cancelling Blinkit Order");
		
	}

	@Override
	public void trackOrder() {
		System.out.println("Tracking Blinkit Order");
		
	}

	@Override
	public void makePayment() {
		System.out.println("Makeing payment for Blinkit Order");
		
	}

	@Override
	public void rateRestaurant() {
		System.out.println("Rating Blinkit restaurant");
		
	}

	@Override
	public void scheduleDelivery() {
		// TODO Auto-generated method stub
		
	}

}
