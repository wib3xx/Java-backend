package com.interfaces.types.programs2;

import java.util.Random;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import java.util.function.Supplier;

public class Driver4 {

	public static void main(String[] args) {
		Predicate<Integer> predicate = (a) -> a <100;
		System.out.println(predicate.test(80));   // ==>True
		System.out.println(predicate.test(120));  // ==> False
		
		Supplier<String> supplier = () -> "Bengaluru";
		System.out.println(supplier.get());
		
		Supplier<Integer> supplier2 = () -> 100000 + new Random().nextInt(900000);
		System.out.println("OTP: "+ supplier2.get());
		
		Consumer<String> consumer = (emailTo) -> System.out.println("Email has sent : "+ emailTo);
		consumer.accept("sarvagay123@gmail.com");
		
		Function<Integer, Integer> function = (amt) -> amt = amt-(amt*5/100);
		System.out.println(function.apply(100));
 	}
	
}
