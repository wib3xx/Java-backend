package com.collections.fw1;

import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {
		//1. Storing String objects
		//2.Creating a collection object(This will create a container which will store objects)
		
		ArrayList<String> employeeName = new ArrayList<String>();
		
		//3. Adding the elements (Employee Name)
		
		employeeName.add("Sarvagay");
		employeeName.add("Sarvagay");
		employeeName.add("Sarvagay");
		employeeName.add("Vikram");
		employeeName.add("Sam");
		employeeName.add("Ayush");
		employeeName.add("Modi");
		
		System.out.println(employeeName);
		
	}
}
