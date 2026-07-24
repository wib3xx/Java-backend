package com.abs_cmbns_inf_ride_booking_system;

public class CashRide extends Ride implements IPayment{

	@Override
	public void makePayment() {
		System.out.println("Payment successful via Cash");
		
	}

	@Override
	public void refundPayment() {
		System.out.println("Refunded via Cash");
		
	}

	@Override
	public void generateReciept() {
		System.out.println("Reciept Generated");
		
	}

	@Override
	void bookRide() {
		System.out.println("Ride booked, cash payment");
		
	}

	@Override
	void cancelRide() {
		System.out.println("Ride cancelled");
		
	}

	@Override
	void calculateFare() {
		System.out.println("Fare calculated");
		
	}

}
