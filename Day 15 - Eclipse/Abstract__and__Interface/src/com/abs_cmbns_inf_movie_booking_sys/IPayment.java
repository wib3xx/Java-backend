package com.abs_cmbns_inf_movie_booking_sys;

public interface IPayment {

	void pay();
	void refund();
	void downloadTicket();
	
	default void offer() {
		System.out.println("No offer for this movie");
	}
	
	default void cashBack() {
		System.out.println("No cashback");
	}
}
