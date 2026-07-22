package com.hello.block;

public class DiscountCalculator {

	public static void main(String[] args) {

		int customerType = Integer.parseInt(args[0]);
		double billAmount = Double.parseDouble(args[1]);

		calculateDiscount(customerType, billAmount);

	}

	private static void calculateDiscount(int customerType, double billAmount) {

		double discount = 0;

		switch (customerType) {

		case 1:
			discount = billAmount * 5d / 100d;
			System.out.println("Customer type: Silver");
			break;

		case 2:
			discount = billAmount * 10d / 100d;
			System.out.println("Customer type: Gold");
			break;

		case 3:
			discount = billAmount * 15d / 100d;
			System.out.println("Customer type: Platinum");
			break;
			
		case 4: 
			discount = billAmount * 20d/100d;
			System.out.println("Customer type: Premium PLUS");
			break;
			
		default:
			System.out.println("Invalid Customer Type");
			break;

		}
		System.out.println("Discount You got : " + discount);
		System.out.println("Total Price after Discount: Rs." + (billAmount - discount));
	}

}
