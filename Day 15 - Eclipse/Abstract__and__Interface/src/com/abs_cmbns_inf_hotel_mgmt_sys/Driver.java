package com.abs_cmbns_inf_hotel_mgmt_sys;

public class Driver {

	public static void main(String[] args) {
		
		System.out.println("======================== Taj Hotels =========================");
		System.out.println();
		System.out.println();
		HotelBooking booking;
		IPayment payment;
		System.out.println("-------------------- Luxury Rooms Status ------------------");
		System.out.println();
		booking = new LuxuryRoom();
		payment = new LuxuryRoom();
		
		booking.bookRoom();
		payment.pay();
		payment.downloadReciept();
		booking.cancelBooking();
		payment.refund();
			if(booking instanceof VIPCustomer) {
				System.out.println("You are VIP Customer, Here are yoyr priviledges: ");
				System.out.println("-Free Breakfast");
				System.out.println("-Free airport pickup");
				System.out.println("-Late checkout");
			} else {
				System.out.println("Regular Customer, No VIP Benefits");
			} 
			System.out.println();
			System.out.println("-------------------- Suite Rooms Status ------------------");
			System.out.println();
		booking = new SuiteRoom();
		payment = new SuiteRoom();
		booking.bookRoom();
		payment.pay();
		payment.downloadReciept();
		booking.cancelBooking();
		payment.refund();
			if(booking instanceof VIPCustomer) {
				System.out.println("You are VIP Customer, Here are yoyr priviledges: ");
				System.out.println("-Free Breakfast");
				System.out.println("-Free airport pickup");
				System.out.println("-Late checkout");
			} else {
				System.out.println("Regular Customer, No VIP Benefits");
			}
			System.out.println();
			
			System.out.println("-------------------- Standard Rooms Status ------------------");
			System.out.println();
		booking = new StandardRoom();
		payment = new StandardRoom();
		booking.bookRoom();
		payment.pay();
		payment.downloadReciept();
		booking.cancelBooking();
		payment.refund();
			if(booking instanceof VIPCustomer) {
				System.out.println("You are VIP Customer, Here are yoyr priviledges: ");
				System.out.println("-Free Breakfast");
				System.out.println("-Free airport pickup");
				System.out.println("-Late checkout");
			} else {
				System.out.println("Regular Customer, No VIP Benefits");
			}
			System.out.println();
			
			System.out.println("-------------------- Dormatory Status ------------------");
			System.out.println();
		booking = new Dormatory();
		payment = new Dormatory();
		booking.bookRoom();
		payment.pay();
		payment.downloadReciept();
		booking.cancelBooking();
		payment.refund();
			if(booking instanceof VIPCustomer) {
				System.out.println("You are VIP Customer, Here are yoyr priviledges: ");
				System.out.println("-Free Breakfast");
				System.out.println("-Free airport pickup");
				System.out.println("-Late checkout");
			} else {
				System.out.println("Regular Customer, No VIP Benefits");
			}
	}
}



















