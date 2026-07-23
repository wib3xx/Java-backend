package com.oops.interfaces.concepts04;

public class Driver {

	public static void main(String[] args) {
		IFoodDeliveryApp app ;
		app = new SwiggyOrder();
		app.placeOrder();
		app.cancelOrder();
		app.trackOrder();
		app.makePayment();
		app.rateRestaurant();
		app.scheduleDelivery();
		System.out.println();
		
		app = new ZomatoOrder();
		app.makePayment();
		app.cancelOrder();
		app.trackOrder();
		app.makePayment();
		app.rateRestaurant();
		app.scheduleDelivery();
		System.out.println();
		
		app = new ZeptoOrder();
		app.placeOrder();
		app.cancelOrder();
		app.trackOrder();
		app.makePayment();
		app.rateRestaurant();
		app.scheduleDelivery();
		System.out.println();
		
		app = new BlinkitOrder();
		app.placeOrder();
		app.cancelOrder();
		app.trackOrder();
		app.makePayment();
		app.rateRestaurant();
		app.scheduleDelivery();
		System.out.println();
		
		app =  new InstamartOrder();
		app.placeOrder();
		app.cancelOrder();
		app.trackOrder();
		app.makePayment();
		app.rateRestaurant();
		app.scheduleDelivery();
		
		
	}
}










