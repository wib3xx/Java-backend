package com.hello.block;

public class SwitchPractice1 {
	public static void main(String[] args) {

		int day = Integer.parseInt(args[0]);
		String output = SwitchPractice1.identifyDay(day);
		System.out.println(output);
	}

	public static String identifyDay(int numbers) {

		String day = null;

		switch (numbers) {

		case 1:
			day = "Mon";
			break;

		case 2:
			day = "Tue";
			break;

		case 3:
			day = "Wed";
			break;

		default:
			day = "Invalid Day";
			break;

		}
		return day;

	}
}