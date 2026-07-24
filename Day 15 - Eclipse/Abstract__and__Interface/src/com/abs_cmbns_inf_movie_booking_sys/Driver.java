//Bookmyshow movie ticket booking system using Abstracts and Interface combination 
package com.abs_cmbns_inf_movie_booking_sys;

public class Driver {

	public static void main(String[] args) {
		
		System.out.println("============== BookMyShow ===============");
		Book book;
		IPayment payment;
		System.out.println();
		
		System.out.println("========== UPI Movie booking ==========");
		book = new UPIMovie();
		payment = new UPIMovie();
		
		book.bookTicket();
		book.showMovieDetails();
		book.selectSeats();
		payment.pay();
		payment.downloadTicket();
		payment.offer();
		payment.cashBack();
		book.cancelTicket();
		payment.refund();
		System.out.println();
		
		System.out.println("========== Card Movie booking ==========");
		book = new CardMovie();
		payment = new CardMovie();
		
		book.bookTicket();
		book.showMovieDetails();
		book.selectSeats();
		payment.pay();
		payment.downloadTicket();
		payment.offer();
		payment.cashBack();
		book.cancelTicket();
		payment.refund();
		System.out.println();
		
		System.out.println("========== Wallet Movie booking ==========");
		book = new WalletMovie();
		payment = new WalletMovie();
		
		book.bookTicket();
		book.showMovieDetails();
		book.selectSeats();
		payment.pay();
		payment.downloadTicket();
		payment.offer();
		payment.cashBack();
		book.cancelTicket();
		payment.refund();
		System.out.println();
		
		System.out.println("========== Cash Movie booking ==========");
		book = new CashMovie();
		payment = new CashMovie();
		
		book.bookTicket();
		book.showMovieDetails();
		book.selectSeats();
		payment.pay();
		payment.downloadTicket();
		payment.offer();
		payment.cashBack();
		book.cancelTicket();
		payment.refund();
		System.out.println();
	}
}




















