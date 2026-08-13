package com.collections.fw1;

import java.util.ArrayList;

public class Driver2 {

	public static void main(String[] args) {
		ArrayList<String> empName = new ArrayList<String>();
		
		empName.add("Sarvagay");
		empName.add("Ritik");
		empName.add("Aryan");
		empName.add("Dutt");
		empName.add("Vikram");
		empName.add("Sarvagay");
		empName.add("Sarvagay");
		
		for(String name : empName) {
			if(name.startsWith("S")){
				System.out.println(name);
			}
			
		}
	}
}
