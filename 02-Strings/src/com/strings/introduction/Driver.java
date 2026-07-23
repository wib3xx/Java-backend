package com.strings.introduction;

public class Driver {

	public static void main(String[] args) {
		
	
	//Creating String Objects using Literals....!
	// Java checks if any object with content ("Banglore") exists
	// in String constant pool (SCP), if exists then no object created and 
	// it start referring the existing object, 
	//If not then it create new object with content "Banglore"
	String city = "Banglore";     //String Literals---> One of the way to create String Object.
	String country = "India";
	String c = "Banglore";
	
	System.out.println(city == c);  //return true
	          //Total Objects created: 2 because city and c exists in String constant pool
	}
}
