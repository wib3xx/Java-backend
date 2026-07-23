package com.strings.introduction;

public class StringExample1 {

	public static void main(String[] args) {
		
		String address = "Mubarak Mandi";
		String fullAddress = address.concat(", Jammu");
		String pinCodeWithFullAddress = fullAddress.concat(", 180001");
		String nameOfEmployeeWithAddress = pinCodeWithFullAddress.concat(", Sarvagay Sanmotra");
		
		
	//	System.out.println(address);
		//System.out.println(fullAddress);
		//System.out.println(pinCodeWithFullAddress);
		System.out.println(nameOfEmployeeWithAddress);
		
	}
}
