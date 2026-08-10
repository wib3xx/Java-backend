package com.zepto;

public class Driver1 {

	public static void main(String[] args) {
		System.out.println("Execution STARTS");
		
		try {
		String name = null;
		System.out.println("Name Length: "+ name.length() );
		Driver1 driver1= new Driver1();
		driver1.doSomething();
		
		}
		
		catch (NullPointerException e) {
			System.out.println("Exception : Name is Null");
			e.printStackTrace();
		}
		System.out.println("Execution ENDS");
	}
	
	private void doSomething() {
		System.out.println("Something START");

		System.out.println("Doing Something");
		System.out.println("Something ENDS");
	}
}
