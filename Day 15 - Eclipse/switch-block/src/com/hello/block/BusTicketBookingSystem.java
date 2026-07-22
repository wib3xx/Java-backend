package com.hello.block;

public class BusTicketBookingSystem {

	public static void main(String[] args) {
		
		String customerName = args[0];
		int customerRouteChoice = Integer.parseInt(args[1]);
		bookTicket(customerRouteChoice , customerName);
		
		//System.out.println(bookTicket);
	}
	private static void bookTicket(int customerRouteChoice , String customerName) {
		
		String route = null;
		int ticketPrice = 0;
		
		switch(customerRouteChoice) {
		
		case 1: 
			route = "Banglore to Mysore";
			ticketPrice = 250;
			break;
			
		case 2:
			route = "Banglore to Chennai";
			ticketPrice = 600;
			break;
			
		case 3:
			route = "Banglore to Hyderabad";
			ticketPrice = 900;
			break;
			
		case 4:
			route = "Banglore to Goa";
			ticketPrice = 1200;
			break;
			
		case 5:
			route = "Banglore to Vadodara";
		ticketPrice = 3500;
		break;
		
		}
		System.out.println("====== KSRTC BUS TICKET ======");
		System.out.println("Customer Name: "+ customerName);
		System.out.println("Route: "+ route );
		System.out.println("Ticket Price :"+ ticketPrice);
		printTicket();
	}
	private static boolean printTicket() {
		System.out.println("Ticket booking Successful");
		return true;
		}
	
	
}
