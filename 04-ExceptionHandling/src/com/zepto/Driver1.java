package com.zepto;

public class Driver1 {

	public static void main(String[] args) {
		System.out.println("Execution STARTS");
		String name = "Sarvagay";
		System.out.println("Name Length: "+ name.length() );
		Driver1 driver1= new Driver1();
		driver1.doSomething();
		System.out.println("Execution ENDS");
	}
	
	private void doSomething() {
		System.out.println("Something START");
		String work = null;
		System.out.println("Doing Something"+ work.length());
		System.out.println("Something ENDS");
	}
}
