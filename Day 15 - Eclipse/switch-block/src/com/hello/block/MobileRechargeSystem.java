package com.hello.block;

public class MobileRechargeSystem {
	
	public static void main(String[] args) {
		int operator = Integer.parseInt(args[0]);
		
		mobileRecharge(operator);
	}
	private static void mobileRecharge(int operator) {
		
		String companyName = null;
		int rechargeAmount = 0;

		switch(operator) {
		
		case 1:
			companyName = "Jio";
			rechargeAmount = 299;
			break;
			
		case 2:
			companyName = "Airtel";
			rechargeAmount = 349;
			break;
			
		case 3:
			companyName = "Vi";
			rechargeAmount = 249;
			break;
			
		case 4:
			companyName = "BSNL";
			rechargeAmount = 199;
			
		case 5:
			companyName = "Aircel";
			rechargeAmount = 198;
			
		default: 
			System.out.println("Invalid Operator");
		}
		System.out.println("====== Mobile Recharge System ======");
		System.out.println("Operator Name: "+ companyName);
		System.out.println("Recharge Amount: Rs."+ rechargeAmount);
		System.out.println("Recharge Successful");
		
	}
	
}
