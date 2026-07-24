package com.abs_cmbns_inf_ride_booking_system;

public interface IPayment {

	void makePayment();
	void refundPayment();
	void generateReciept();
	default void cashBack() {
		
	}

}
