package com.zepto;

public class Driver2 {

	public static void main(String[] args) {
		System.out.println("Execution STARTED");
		try {
		int result = 22/0;
		String name = args[0];
		String name1 = null;
		
		Driver2 driver2 = new Driver2();
		driver2.doSomething();
		
		}
		catch(Exception e) {
			System.out.println("if 0 is Denominator, then It is proven as Infinity");
			System.out.println("User input not provided");
			System.out.println("User input is null");
			e.getStackTrace();
		}
		System.out.println("Execution ENDED");
	}
	
	private void doSomething() {
		System.out.println("WORK STARTED");
		System.out.println("Doing Work !!!");
		System.out.println("WORK ENDED");
	}
}
