package com.interfaces.functional.clg.student.result.sys;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Driver {

	public static void main(String[] args) {
		
		Predicate<Integer> eligibility = (marks) -> marks >= 40;
		System.out.println("Marks = 44");
		System.out.println("Passing Marks cleared = "+eligibility.test(44));
		System.out.println("Result: Pass");
		
		
		Supplier<Integer> rollno = () -> 100000 + new Random().nextInt(900000);
		System.out.println("Roll Number : "+ rollno.get());
		
		
		Consumer<String> sms = (smsTo) -> System.out.println("SMS sent to: "+ smsTo);
		sms.accept("7764534410");
		
		
		Function<Integer, Integer > graceMarks = (grace) -> grace = grace+ 5;
		System.out.println("Grace Marks: "+ graceMarks.apply(44));
	}
}
