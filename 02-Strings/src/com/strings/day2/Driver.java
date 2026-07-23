package com.strings.day2;

public class Driver {

	public static void main(String[] args) {
		
		String city = "Banglore";               //Object will rely SCP 
		 city.concat(", India");			//India is in SCP but resulted new object will be in heap
		
	String city2 = new String("Banglore");
		
		System.out.println(city == city2);   //False
		System.out.println(city.equals(city2));
	}
}

