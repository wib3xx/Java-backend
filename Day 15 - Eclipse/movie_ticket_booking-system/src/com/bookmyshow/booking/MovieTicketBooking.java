package com.bookmyshow.booking;

public class MovieTicketBooking {

	public static void main(String[] args) {

		String customerName = args[0];
		String movieName = args[1];
		String seatStatus = args[2];
		int ticketPrice = Integer.parseInt(args[3]);
		String mob = args[4];
		bookMovieTicket(seatStatus, ticketPrice, mob);

		System.out.println("                               ");
		System.out.println("===== BookMyShow Reciept =====");
		System.out.println("Customer Name: " + customerName);
		System.out.println("Movie Name: " + movieName);
		System.out.println("Ticket Price: Rs." + ticketPrice);
		System.out.println("Customer's Contact Details: " + mob);
		System.out.println("                                   ");
		System.out.println("Congratulations: You Movie booking is Successful, Enjoy!!");
	}

	public static boolean bookMovieTicket(String seatStatus, int ticketPrice, String mob) {
		boolean bookingSeatStatus = checkSeats(seatStatus);
		boolean ticketPaymentStatus = checkPayment(ticketPrice);
		String alertCustStatus = sendSMS(mob);
		return true;

	}

	public static boolean checkSeats(String seatStatus) {
		System.out.println("Checking availability of seats");
		if (seatStatus.equals("OPEN")) {
			System.out.println("Booking your seats");
			return true;
		} else {
			System.out.println("Sorry! Seats are occupied! Booking failed.");
			return false;
		}

	}

	public static boolean checkPayment(int ticketPrice) {
		System.out.println("Checking Payment Status");
		if (ticketPrice >= 600) {
			System.out.println("Booking your tickets");
			return true;
		} else {
			System.out.println("Payment Declined");
			return false;
		}
	}

	public static String sendSMS(String mob) {
		System.out.println("Seats booking is Successfull, Details has been sent to you on this mobile number: " + mob);
		return mob;

	}
}
