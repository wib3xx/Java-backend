package com.interfaces.functional.lambda.salary.calc.sys;

public class Driver {

	public static void main(String[] args) {
		
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
