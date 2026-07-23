package com.strings.introduction;

public class Driver2 {

	public static void main(String[] args) {
		String city = "Delhi";                           //Due to SCP  city is immutable
		String country = city.concat(", India"); 			//"India" will be created in SCP
															// new object will be created
		
		
		String temp = "Banglore";             //Object will be created in SCP (String constant pool)
		String s1 = new String(temp);         //Object will be created in SCP as well as Heap too.
		
		String s10 = "Mumbai";
		String s11 = "Mumbai";
		System.out.println(s10 == s11);   //True ---> because s10 "Mumbai" already exists in SCP
		
		
		String s12 = new String("Mumbai");    //Object will be created in Heap as well as SCP
		String s13 = new String("Mumbai");    // New object , because heap doesnt check new object creation
			System.out.println(s12 == s13);   // like SCP
	}
	
}
