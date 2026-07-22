package com.hello.block;

public class AirportTicketBookingSystem {

	static int price = 0;
	static String route = null;
	static int totalFare = 0;

	public static void main(String[] args) {

		String passengerName = args[0];
		int flightChoice = Integer.parseInt(args[1]);
		int noOfTicket = Integer.parseInt(args[2]);
		
		selectFlight(flightChoice);
		calculateFare(noOfTicket);
		
		System.out.println("===================== AIR INDIA TICKET =====================");
		System.out.println(" ");
		System.out.println("Passenger Name: " + passengerName);
		System.out.println("Flight Route: " + route);
		System.out.println("\nNumber of Tickets: " + noOfTicket);
		System.out.println("Total Amount: Rs." + totalFare);
		generateTicket();
		sendSMS();

	}

	private static void selectFlight(int flightChoice) {
		switch (flightChoice) {

		case 1: 
			route = "Banglore to Vadodara";
			price = 8000;
			break;
			//Keep Manifesting! :)
		case 2:
			route = "Banglore to Delhi";
			price = 10000;
			break;

		case 3:
			route = "Banglore to Dubai";
			price = 28500;
			break;

		case 4:
			route = "Banglore to Mumbai";
			price = 18000;
			break;

		case 5:
			route = "Banglore to Singapore";
			price = 20000;
			break;

		default:
			System.out.println("Invalid Flight");
		}

	}

	private static void calculateFare(int noOfTicket) {
		 totalFare = price * noOfTicket;

	}

	private static void generateTicket() {
		System.out.println("Ticket Generated");
	}

	private static void sendSMS() {
		System.out.println("SMS sent to the registered Mobile Number");
		System.out.println("Ticket Booked Successfully !!!");

	}

}
