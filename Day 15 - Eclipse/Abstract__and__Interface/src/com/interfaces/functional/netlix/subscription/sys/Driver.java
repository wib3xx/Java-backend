package com.interfaces.functional.netlix.subscription.sys;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Driver {

	public static void main(String[] args) {
		System.out.println("-------- Netflix India ------");
		System.out.println();
		
		System.out.println("-------  Plan Status ------");
		Predicate<Integer> memberStatus = (plan) -> plan > 1300;
		System.out.println("Premium User?: "+memberStatus.test(800));
		
		Supplier<Integer> subscriptionId = () -> 100000 + new Random().nextInt(900000);
		System.out.println("Subscription ID: "+subscriptionId.get());
		
		Consumer<String> email = (emailTo) -> System.out.println("Email sent to: "+emailTo);
		email.accept("sarvagay123gist@gmail.com");
		
		Function<Integer, Integer> couponAmt = (amt) -> amt = amt - (amt*20/100);
		System.out.println("Plan: Premium");
		System.out.println("Price of Membership: Rs. 80000");
		System.out.println("Coupon Worth: 20% Discount");
		System.out.println("Price after Coupon: Rs."+ couponAmt.apply(80000));
		System.out.println("Subscription Added!!!!");
	}
}
