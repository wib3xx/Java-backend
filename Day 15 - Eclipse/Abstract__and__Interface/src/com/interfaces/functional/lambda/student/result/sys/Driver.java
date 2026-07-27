package com.interfaces.functional.lambda.student.result.sys;

public class Driver {

	public static void main(String[] args) {
		
		//Grace marks added in total marks
		ResultCalculator result = (marks, grace) -> {
			return marks + grace;
		};
		int finalMarks = result.calculate(70, 5);
		System.out.println("Original Marks: 70");
		System.out.println("Grace marks: 5");
		System.out.println("Final marks: "+finalMarks);
		System.out.println();
		//penalty for attendance
		result = (marks, penalty)->{
			return marks - penalty;
		};
		System.out.println("Penalty marks: 3");
		System.out.println("Final Marks: "+  result.calculate(70, 3) );
		
	
	}
	
	
}
