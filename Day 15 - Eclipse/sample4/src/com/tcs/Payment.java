package com.tcs;

public class Payment {

	public static void main(String[] args) {

		String companyName = args[0];
		String employeeName = args[1];
		String customerName = args[2];
		int projectCharges = Integer.parseInt(args[3]);

		System.out.println("====  Here are the details: ====");
		System.out.println("Company Name: " + companyName);
		System.out.println("Employee Name:"+ employeeName);
		System.out.println("Customer Name: "+ customerName);
		System.out.println("Project Charges: Rs."+ projectCharges);

	}

}
