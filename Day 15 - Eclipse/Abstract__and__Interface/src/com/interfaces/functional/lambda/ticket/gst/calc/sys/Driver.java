package com.interfaces.functional.lambda.ticket.gst.calc.sys;

public class Driver {

		public static void main(String[] args) {
			MovieTicketCalculator calc = (amount, gst) -> {
				return amount + gst;
			};
			
			int calculate = calc.calculate(1000 , 180 );
			System.out.println("Movie Ticket Price: Rs. 1000");
			System.out.println("GST: Rs.180");
			System.out.println("Total Ticket Price: Rs."+ calculate);
		}
}
