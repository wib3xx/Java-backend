package com.interfaces.functional.hotstar.subscription.sys;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Driver {

	public static void main(String[] args) {
		Predicate<Integer> validUser = (plan) -> plan > 499;
		System.out.println("Is user Authenticated? = "+validUser.test(699));
		
		Supplier<Integer> otp = () -> 100000 + new Random().nextInt(900000);
		otp.get();
		
		Consumer<String > email = (emailTo) -> System.out.println("Email sent to: "+ emailTo);
		email.accept("sarvagay123gist@gmail.com");
		
		Function<Integer, Integer> disc = (amt) -> amt = amt - (amt * 5/100);
		
		System.out.println("Price of Plan: 1000");
		System.out.println("Discounted Price: "+ disc.apply(1000));
		
	}
}
