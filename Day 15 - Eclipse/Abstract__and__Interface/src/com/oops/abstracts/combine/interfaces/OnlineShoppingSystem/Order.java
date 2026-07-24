package com.oops.abstracts.combine.interfaces.OnlineShoppingSystem;

public abstract class Order {

	Order(){
		System.out.println("Checking Order Status");
	}
	public abstract void cancelOrder();
	public abstract void returnOrder();
	public static void trackOrder() {
		System.out.println("Tracking Order");
	}
	public static void downloadInvoice() {
		System.out.println("Downloading Invoice");
	}
}



////Order()           // constructor
//
//trackOrder()      // common method
//
//downloadInvoice() // common method
//
//abstract cancelOrder();
//
//abstract returnOrder();