package com.abs_cmbns_inf_ride_booking_system;

public abstract class Ride {

	abstract void bookRide();
	abstract void cancelRide();
	abstract void calculateFare();
	//abstract void cashBack();
	public void trackRide() {
		System.out.println("Tracking your ride");
	}
	public void showDriverDetails() {
		System.out.println("Fetching Driver details...");
	}
  
}
