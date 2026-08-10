package com.zepto;

public class AOBI {
//Array Out of Bound Index Exception
	public static void main(String[] args) {
	
		System.out.println("Execution START");
		
		try {
		String name = args[0];
		String name1 = args[0];
		System.out.println("Name length: "+ name.length());
		System.out.println("Name1 length: "+ name1.length());
		AOBI outOfBoundIndex = new AOBI();
		outOfBoundIndex.doTask();
		
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Name length cannot be determined!");
			e.getStackTrace();
		}
		System.out.println("Execution STOPPED");
	}
	private void doTask() {
		System.out.println("WORK STARTED");
		String status = null;
		System.out.println("WORK STOPPED");
	}
}
