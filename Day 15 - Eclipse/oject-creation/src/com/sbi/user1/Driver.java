package com.sbi.user1;

public class Driver {

	public static void main(String[] args) {
		
		//I need to create an object of SBIUser1 class
		
		Account acc = new Account();

		Account acc1 = new Account("Sarvagay_Sanmotra", 500000);
	
		Account acc2 = new Account("Infosys", 96000);
		
		Account acc3 = new Account(88000, "Google Company");
		
	}
}
