package com.interfaces.functional.lambda.flipcart.order.sys;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Driver {

	public static void main(String[] args) {
		
		System.out.println("------------- Flipcart Order Status --------------");
		System.out.println();
		Predicate<Integer> eligibility = (amt) -> amt >= 1000; 
		System.out.println("Is customer eligible for flipcart plus?");
		System.out.println(eligibility.test(1200));
	
		Supplier<Integer> orderNo = () -> 100000 + new Random().nextInt(900000);
		System.out.println("Order Number: "+orderNo.get());
	
		Consumer<String> email = (emailTo) -> System.out.println("Email sent to: "+ emailTo);
		email.accept("sarvagay123gist@gmail.com");
	
		Function<Integer, Integer> discCalc = (amt) -> amt = amt - (amt*10/100);
		System.out.println("Discount Price: Rs."+discCalc.apply(1000));
	}
}
