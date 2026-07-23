package com.oops.interfaces.concepts04;

public class ZomatoOrder implements IFoodDeliveryApp{

	@Override
	public void placeOrder() {
		System.out.println("============= Zomato Order Details =============");
		System.out.println("Placing Zomato Order");
		
	}

	@Override
	public void cancelOrder() {
		System.out.println("Cancelling Zomato Order");
		
	}

	@Override
	public void trackOrder() {
		
		System.out.println("Tracking Zomato Order");
		
	}

	@Override
	public void makePayment() {
		System.out.println("Making payment for Zomato Order");
		
	}

	@Override
	public void rateRestaurant() {
		System.out.println("Rating Zomato Restaurant");
		
	}
	@Override
	public void scheduleDelivery() {
		// TODO Auto-generated method stub
		
	}

}
