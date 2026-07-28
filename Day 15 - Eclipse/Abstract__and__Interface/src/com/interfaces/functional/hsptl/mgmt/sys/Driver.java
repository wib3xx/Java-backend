package com.interfaces.functional.hsptl.mgmt.sys;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Driver {

	public static void main(String[] args) {
		System.out.println("--- Fortis hospitality ---");
		System.out.println("     Bill Status");
		
		Predicate<Integer> age = (a) -> a > 60;
		System.out.println("Senior citizen? : "+age.test(61));
		
		Supplier<Integer> id = () -> 100000 + new Random().nextInt(900000);
		System.out.println("Patient Id: "+id.get());
		
		Consumer<String> msg = (msgTo) -> System.out.println("Message sent to "+ msgTo);
		msg.accept("9901102228");
		
		Function<Integer, Integer> discAmt = (amt) -> amt = amt - (amt * 15/100);
		System.out.println("Bill Amount: Rs.10000");
		System.out.println("Bill after Discount: Rs."+discAmt.apply(10000));
	}
}
