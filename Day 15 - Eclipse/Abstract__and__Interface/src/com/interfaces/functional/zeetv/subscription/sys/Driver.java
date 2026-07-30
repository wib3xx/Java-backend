package com.interfaces.functional.zeetv.subscription.sys;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Driver {

	public static void main(String[] args) {
		Predicate<Integer> userStatus = (status) -> status > 699;
		System.out.println("Is user ZEE TV Plus member? - "+userStatus.test(1000));
		
		Supplier<Integer> otp = () -> 100000 + new Random().nextInt(900000);
		System.out.println("OTP: "+otp.get());
		
		Consumer<String> email = (emailTo) -> System.out.println("Email sent to "+ emailTo);
		email.accept("sarvagay123gist@gmail.com");
		
		Function<Integer, Integer> discAmt = (amt) -> amt = amt - (amt*15/100);
		System.out.println("Discount Price: "+discAmt.apply(1200));
		
		
	}
}
