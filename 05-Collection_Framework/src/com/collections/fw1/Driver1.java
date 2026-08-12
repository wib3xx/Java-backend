package com.collections.fw1;

import java.util.ArrayList;

public class Driver1 {

	public static void main(String[] args) {
		ArrayList<String> empNameId = new ArrayList<String>();
		
		empNameId.add("Sarvagay");
		empNameId.add("Vaibhav");
		empNameId.add("Rohan");
		empNameId.add("Ankit");
		empNameId.add("Emmanual");
		empNameId.add("Priyanshu");
		empNameId.add("Aakash");
		empNameId.add("Sarvagay");
		
		//System.out.println(empNameId);
		
		for(String name : empNameId) {
			if(name.startsWith("A")) {
				System.out.println(name);
			}
		//	System.out.println(name);
		}
		
		
	}
}
