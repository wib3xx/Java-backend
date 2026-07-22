package com.hello.block;

public class HolidaySchedule {
	
	public static void main(String[] args) {
		
		int holiday = Integer.parseInt(args[0]);
		
		holidayChecker(holiday);
		
	}
	private static void holidayChecker(int holiday) {
		
		String day = null;
		
		switch(holiday) {
		
		case 1:
			day = "Sunday";
			break;
		case 2:
			day = "Saturday";
			break;
			
		default:
			System.out.println("Invalid Day");
		}
		System.out.println("You have a holiday on "+ day);
	}
	
}
