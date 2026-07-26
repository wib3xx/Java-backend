package com.abs_cmbns_inf_hotel_mgmt_sys;

public class LuxuryRoom extends HotelBooking implements IPayment, VIPCustomer {

	@Override
	public void pay() {
		System.out.println("Payment recieved for Luxury Room");
		
	}

	@Override
	public void refund() {
		System.out.println("Refund Initiated");
		
	}

	@Override
	public void downloadReciept() {
		System.out.println("Reciept is available to download");
		
	}

	@Override
	void bookRoom() {
		System.out.println("Booking room: Luxury Room");
		
	}

	@Override
	void cancelBooking() {
		System.out.println("Cancelling Room booking");
		
	}

}
