package com.abs_cmbns_inf_ride_booking_system;

public class Driver {

	public static void main(String[] args) {
		System.out.println("======= Rapido Booking Status =======");
		IPayment payment;
		Ride ride;
		
		System.out.println("------------ UPI Ride ------------");
		payment = new UPIRide();
		ride = new UPIRide();
		
		ride.bookRide();
		ride.trackRide();
		ride.showDriverDetails();
		ride.calculateFare();
		payment.makePayment();
		payment.generateReciept();
		payment.refundPayment();
		ride.cancelRide();
		payment.cashBack();
		
	}
}
