package com.oops.interfaces.concepts04;

public interface IFoodDeliveryApp {

	void placeOrder();
	void cancelOrder();
	void trackOrder();
	void makePayment();
	void rateRestaurant();
	default void scheduleDelivery() {
		System.out.println("Scheduled Delivery not Supported!");
	};
	
}
