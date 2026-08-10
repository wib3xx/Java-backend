package com.zepto;

public class ArithmeticExceptionss {
//Arithmetic Exception
	public static void main(String[] args) {
		System.out.println("Execution STARTS");
		try {
		int marks = 100;
		int result = 100/0;
		System.out.println("Result: "+ result);
		ArithmeticExceptionss ae = new ArithmeticExceptionss();
		ae.doSomething();
		
		}
		catch(ArithmeticException e) {
			System.out.println("100 / 0 is infinity!!!!");
			e.getStackTrace();
		}
		System.out.println("Execution ENDS");
		
	}
	
	private void doSomething() {
		System.out.println("Work Starts");
		System.out.println("Doing Something");
		System.out.println("Work Stopped");
	}
}
