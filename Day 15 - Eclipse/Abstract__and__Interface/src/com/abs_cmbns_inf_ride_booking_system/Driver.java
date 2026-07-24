// Ride booking system using Abstract and Interface both. 
package com.abs_cmbns_inf_ride_booking_system;

public class Driver {

	public static void main(String[] args) {
		System.out.println("========= Rapido Booking Status =========");
		IPayment payment;
		Ride ride;
		
		System.out.println("------------ Ride using UPI Payment ------------");
		payment = new UPIRide();
		ride = new UPIRide();
		
		ride.bookRide();
		ride.trackRide();
		ride.showDriverDetails();
		ride.calculateFare();
		payment.makePayment(); 
		payment.applyCoupon();
		payment.generateReciept();
		payment.cashBack();
		payment.refundPayment();
		ride.cancelRide();
		System.out.println();
		
		System.out.println("------------ Ride using Card Payment------------");
		payment = new CardRide();
		ride = new CardRide();
		
		ride.bookRide();
		ride.trackRide();
		ride.showDriverDetails();
		ride.calculateFare();
		payment.makePayment();
		payment.applyCoupon();
		payment.generateReciept();
		payment.refundPayment();
		payment.cashBack();
		ride.cancelRide();
		System.out.println();
		
		System.out.println("------------ Ride using Wallet ------------");
		ride = new WalletRide();
		payment = new WalletRide();
		
		ride.bookRide();
		ride.trackRide();
		ride.showDriverDetails();
		ride.calculateFare();
		payment.makePayment();
		payment.applyCoupon();
		payment.generateReciept();
		payment.refundPayment();
		payment.cashBack();
		ride.cancelRide();
		System.out.println();
		
		System.out.println("------------ Ride with Cash Payment ------------");
		ride = new CashRide();
		payment = new CashRide();
		
		ride.bookRide();
		ride.trackRide();
		ride.showDriverDetails();
		ride.calculateFare();
		payment.makePayment();
		payment.applyCoupon();
		payment.generateReciept();
		payment.refundPayment();
		payment.cashBack();
		ride.cancelRide();
	}
}






















