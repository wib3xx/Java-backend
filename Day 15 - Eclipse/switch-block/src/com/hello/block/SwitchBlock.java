package com.hello.block; 

public class SwitchBlock {

	public static void main(String[] args) {
		
		System.out.println("SwitchCase.main()");
		int day = Integer.parseInt(args[0]);
		String output = SwitchBlock.identifyDay(day);
		System.out.println(output);
	}
	public static String identifyDay(int  number) {
		String day = null;
		
		switch (number) {
		case 1: 
			day = "Mon";
			break;
		
		case 2: 
			day = "Tue";
			break;
			
		case 3: 
			day = "Wed";
			break;
			
		case 4: 
			day = "Thurs";
			break;
			
		case 5: 
			day = "Fri";
			break;
			
		case 6: 
			day = "Sat";
			break;
			
		case 7: 
			day = "Sun";
			break;
		}
		return day;
		
			
	}
}
