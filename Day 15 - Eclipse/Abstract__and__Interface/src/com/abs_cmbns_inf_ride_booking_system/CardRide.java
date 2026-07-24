package com.abs_cmbns_inf_ride_booking_system;

public class CardRide extends Ride implements IPayment {

	@Override
	public void makePayment() {
		System.out.println("Payment successful using Card");
		
	}

	@Override
	public void refundPayment() {
		System.out.println("Refund sent to Card Account");
		
	}

	@Override
	public void generateReciept() {
		System.out.println("Reciept Generated");
		
	}

	@Override
	void bookRide() {
		System.out.println("Ride booked using card");
		
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
