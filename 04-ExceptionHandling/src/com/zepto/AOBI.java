package com.zepto;

public class AOBI {

	public static void main(String[] args) {
		System.out.println("Execution START");
		String name = args[0];
		System.out.println("Name lenght: "+ name.length());
		AOBI outOfBoundIndex = new AOBI();
		outOfBoundIndex.doTask();
		System.out.println("Execution STOPPED");
	}
	private void doTask() {
		System.out.println("WORK STARTED");
		String status = null;
		System.out.println("WORK STOPPED");
	}
}
