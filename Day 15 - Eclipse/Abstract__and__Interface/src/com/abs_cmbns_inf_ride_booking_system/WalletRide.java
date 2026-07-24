package com.abs_cmbns_inf_ride_booking_system;

public class WalletRide extends Ride implements IPayment {

	@Override
	public void makePayment() {
		System.out.println("Payment successful using Wallet");
		
	}

	@Override
	public void refundPayment() {
		System.out.println("Refund sent to Wallet");
		
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
	
	@Override
	public void cashBack() {
		System.out.println("5% Cashback on UPI");
	}
	@Override
	public void applyCoupon() {
		System.out.println("Coupon Applied!!!");
	}

}
