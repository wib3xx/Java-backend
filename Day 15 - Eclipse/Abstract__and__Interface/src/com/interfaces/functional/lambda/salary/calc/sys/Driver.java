package com.interfaces.functional.lambda.salary.calc.sys;

import java.util.Random;
import java.util.function.*;

public class Driver {

	public static void main(String[] args) {
		
		System.out.println("===== Google India =====");
		System.out.println();
		System.out.println("----- Employee Status -----");
		//Predicate
		Predicate<Integer> predicate = (a) ->  a <100; 
		System.out.println("Is Employee Working Hard?: "+ predicate.test(80));
		System.out.println("Is Employee in Love with HR? : "+predicate.test(120));
		
		//Supplier
		Supplier<String> supplier = () -> "Banglore";
		System.out.println("City: "+supplier.get());
		
		//Supplier OTP
		Supplier<Integer> supplier2 = () -> 100000 + new Random().nextInt(900000);
		System.out.println("OTP: "+ supplier2.get());
		
		//Consumer
		Consumer<String> consumer = (emailTo) -> System.out.println("Email sent to: "+ emailTo);
		consumer.accept("sarvagay123gist@gmail.com");
		
		//Discount (Function in built utility) 
		Function<Integer, Integer> function = (amt) -> amt = amt - (amt * 5/100);
		System.out.println("Employee got Discount: Rs."+ function.apply(1000));
		
		//Salary bonus
		SalaryCalculator calc = (salary , bonus) -> {
			return salary + bonus;
		};
		
		int totalSalary = calc.calculate(40000, 5000);
		System.out.println("Your Salary: Rs.40000");
		System.out.println("Diwali Bonus: Rs.5000");
		System.out.println("Total Salary: Rs."+totalSalary);
		
		//Deduction of salary due to Absent
		
		calc = (salary , absentees) -> {
			return salary - absentees;
		};
		System.out.println("Absentism charges: Rs.1600");
		System.out.println("Total Salary: Rs."+calc.calculate(totalSalary, 1600));
		
	}
}
