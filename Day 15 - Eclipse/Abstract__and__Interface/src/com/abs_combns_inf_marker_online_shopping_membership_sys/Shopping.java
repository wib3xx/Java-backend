package com.abs_combns_inf_marker_online_shopping_membership_sys;

public abstract class Shopping {

	 abstract void placeOrder();
	 abstract void cancelOrder();
	 
	 public void trackOrder() {
		 System.out.println("Tracking Order");
	 }
}
