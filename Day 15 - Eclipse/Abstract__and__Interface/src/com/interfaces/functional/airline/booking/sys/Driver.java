package com.interfaces.functional.airline.booking.sys;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Driver {

	public static void main(String[] args) {
		System.out.println("---- Indigo Airlines ----");
		System.out.println();
		System.out.println("      Ticket Status      ");
		
		Predicate<Integer> weight = (w) -> w < 15; 
		System.out.println("Weight of luggage is under 15KG: "+ weight.test(10));
		
		Supplier<Integer> boardingPass = () -> 100000 + new Random().nextInt(900000);
		System.out.println("Boarding Pass ID: "+ boardingPass.get());
		
		Consumer<String> email = (emailTo) -> System.out.println("Email sent to: "+ emailTo);
		email.accept("sarvagay123gist@gmail.com");
		
		Function<Integer, Integer> gstAmt = (amt) -> amt = amt + (amt * 18/100 );
		System.out.println("Ticket Price: Rs.12000");
		System.out.println("GST 18% ");
		System.out.println("Ticket price with GST: Rs."+ gstAmt.apply(12000));
	}
}
