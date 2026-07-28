package com.interfaces.functional.amazon.sale;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Driver {

	public static void main(String[] args) {
		
		System.out.println("------- Amazon Sale -------");
		System.out.println();
		
		System.out.println("---- Order Details ----");
		Supplier<Integer> generateCode = () -> 100000 + new Random().nextInt(900000);
		System.out.println("Coupon Code: "+generateCode.get());
		
		Predicate<Integer> CheckValidity = (code) -> code <= 900000;
		System.out.println("Coupon Validity: "+CheckValidity.test(450000));
		
		Function <Integer, Integer> CalcBill = (bill) -> bill = bill - (bill * 15/100);
		System.out.println("Order Price: Rs. 500 ");
		System.out.println("Coupon Worth: 15% Discount");
		System.out.println("Final Price: "+ CalcBill.apply(500));
		System.out.println("Order placed successfully !!!");
		
		Consumer<String> email = (emailTo) -> System.out.println("Email sent to: "+ emailTo);
		email.accept("sarvagay123gist@gmail.com");

	}
}
