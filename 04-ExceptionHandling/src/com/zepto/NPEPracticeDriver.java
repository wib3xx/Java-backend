package com.zepto;

public class NPEPracticeDriver {
//Null pointer Exception
	public static void main(String[] args) {
		System.out.println("Execution STARTS");
		try {
		String name = null;
		System.out.println("Name length: "+ name.length());
		
		NPEPracticeDriver pdriver = new NPEPracticeDriver();
		pdriver.doSomething();
		
		}
		catch(NullPointerException e) {
			System.out.println("Name is not Mentioned!");
			e.printStackTrace();
		}
		System.out.println("Execution ENDS");
	}
	
	private void doSomething() {
		System.out.println("WORK START");
		System.out.println("Doing Something");
		System.out.println("WORK DONE");
	}
}
