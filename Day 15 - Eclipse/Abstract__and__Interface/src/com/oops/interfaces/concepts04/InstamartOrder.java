package com.oops.interfaces.concepts04;

public  class InstamartOrder implements IFoodDeliveryApp {

	@Override
	public void placeOrder() {
		System.out.println("============= Instamart Order Details =============");
		System.out.println("Placing Instamart Order");
		
	}

	@Override
	public void cancelOrder() {
		System.out.println("Cancelling Instamart Order");
		
	}

	@Override
	public void trackOrder() {
		
		System.out.println("Tracking Instamart Order");
		
	}

	@Override
	public void makePayment() {
		System.out.println("Making payment of Instamart Order");
		
	}

	@Override
	public void rateRestaurant() {
		System.out.println("Rating Instamart restaurant");
		
	}

	@Override
	public void scheduleDelivery() {
		System.out.println("Delivery Scheduled Successfully!");
		
	}

}
