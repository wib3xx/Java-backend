package com.oops.interfaces.concepts04;

public class ZeptoOrder implements IFoodDeliveryApp{

	@Override
	public void placeOrder() {
		System.out.println("============= Zepto Order Details =============");
		System.out.println("Placing Zepto Order");
		
	}

	@Override
	public void cancelOrder() {
		System.out.println("Cancelling Zepto Order");
		
	}

	@Override
	public void trackOrder() {
		System.out.println("Tracking Zepto Order");
		
	}

	@Override
	public void makePayment() {
		System.out.println("Making Payment for Zepto Order");
		
	}

	@Override
	public void rateRestaurant() {
		System.out.println("Rating Zepto Restaurant");
		
	}

	@Override
	public void scheduleDelivery() {
		System.out.println("Delivery Scheduled Successfully");
		
	}

}
