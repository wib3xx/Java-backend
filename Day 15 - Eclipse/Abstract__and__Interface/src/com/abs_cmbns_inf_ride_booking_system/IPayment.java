package com.abs_cmbns_inf_ride_booking_system;

public interface IPayment {

	void makePayment();
	void refundPayment();
	void generateReciept();
	default void cashBack() {
		System.out.println("Cashback not applicable");
	}
	default void applyCoupon() {
		System.out.println("Coupons not applicable");
	}

}
