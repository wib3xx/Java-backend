package com.zepto;

public class Driver {

	public static void main(String[] args) {
		
		System.out.println("Extecution STARTS");
		//String name = "Sarvagay Sanmotra";
		String name = null;    //Null Pointer exception -->null.length()
		
		System.out.println("Length of String is- "+ name.length());
		Driver driver = new Driver();
		driver.doSomething();
		System.out.println("Execution ENDS");
	}
	
	private void doSomething() {
		System.out.println("START");
		System.out.println("Doing something!!");
		System.out.println("END");
	}
	
}
