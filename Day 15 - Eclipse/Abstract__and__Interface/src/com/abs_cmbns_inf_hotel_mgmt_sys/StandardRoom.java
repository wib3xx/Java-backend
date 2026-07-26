package com.abs_cmbns_inf_hotel_mgmt_sys;

public class StandardRoom extends HotelBooking implements IPayment{

	@Override
	public void pay() {
		System.out.println("Payment recieved for Standard Room ");
		
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
		System.out.println("Booking room: Standard Room");
		
	}

	@Override
	void cancelBooking() {
		System.out.println("Cancelling Room booking");
		
	}

}
