/* Write a program to perform IRCTC ticket booking based on the user type.
 * User type: Retail or Agent
 * Condition: Agent can book any number of tickets and retail use to book only 6 tickets in a day. If user is other than
 * retail and agent then give warning that user type not supported
 */
package com.hello.block;

public class TrainTicketBookingSystem {

	public static void main(String[] args) {
		String userType = args[0];
		
		bookTicket(userType);
	}
	public static void bookTicket(String userType) {
		//String userType = null;
		
		switch (userType) {
		case "Retail" : 
			userType = "Retail user can book only 6 tickets";
			break;
			
		case "Agent" :
			userType = "Agent can book any number of tickets";
		
		}
	}
}
