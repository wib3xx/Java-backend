package com.strings.day2;

public class StudentRegisterationSystem {

	public static void main(String[] args) {
		String name = "Sarvagay";
		String fullName = name.concat(" Sanmotra");
		
		String email = "sarvagay123@gmail";
	    String fullEmailAddress =email.concat(".com");
		
		
		String city = "Jammu";
		String cityFullAddress= city.concat(", 180001");
		
		String college = "XYZ";
		String collegeFullName = college.concat(" University");
			   
		System.out.println("========= Student Registeration Details =========");
		System.out.println("          Full Name: "+fullName);
		System.out.println("          Email: "+ fullEmailAddress);
		System.out.println("          College Name: "+ collegeFullName);
		System.out.println("          City: "+ cityFullAddress);
		System.out.println("=================================================");
		
	}
}
