package com.abs_cmbns_inf_movie_booking_sys;

public class WalletMovie extends Book implements IPayment {

	@Override
	public void pay() {
		System.out.println("Payment done with Wallet");
		
	}

	@Override
	public void refund() {
		System.out.println("Refund Initiated to Wallet");
		
	}

	@Override
	public void downloadTicket() {
		System.out.println("Ticket is ready to download");
		
	}

	@Override
	void bookTicket() {
		System.out.println("Booking Ticket");
		
	}

	@Override
	void cancelTicket() {
		System.out.println("Cancelling Ticket");
		
	}

	@Override
	void showMovieDetails() {
		System.out.println("To Show Movie Details, You can scan QR code ");
		
	}

	@Override
	void selectSeats() {
		System.out.println("Select your seats");
		
	}
	
	@Override
	public void offer() {
		System.out.println("Free Popcorn");
	}

}
