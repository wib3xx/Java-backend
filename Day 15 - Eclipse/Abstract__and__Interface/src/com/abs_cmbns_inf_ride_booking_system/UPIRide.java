package com.abs_cmbns_inf_ride_booking_system;

public class UPIRide extends Ride implements IPayment{

	@Override
	public void makePayment() {
		System.out.println("Payment successful using UPI");
		
	}

	@Override
	public void refundPayment() {
		System.out.println("Refund sent to UPI");
		
	}

	@Override
	public void generateReciept() {
		System.out.println("Reciept Generated");
		
	}

	@Override
	void bookRide() {
		System.out.println("Ride booked using UPI");
		
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
