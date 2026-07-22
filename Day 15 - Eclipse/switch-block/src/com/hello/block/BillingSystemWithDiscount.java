package com.hello.block;

public class BillingSystemWithDiscount {

	public static void main(String[] args) {

		int customerType = Integer.parseInt(args[0]);
		double billAmount = Double.parseDouble(args[1]);

		calculateBill(customerType, billAmount);

	}

	private static void calculateBill(int customerType, double billAmount) {

		double discount = 0;

		switch (customerType) {

		case 1:
			discount = billAmount * (5d / 100d);
			System.out.println("Customer Type: Silver");
			break;

		case 2:
			discount = billAmount * (10d / 100d);
			System.out.println("Customer Type: Gold");
			break;

		case 3:
			discount = billAmount * (15d / 100d);
			System.out.println("Customer Type: Platinum");
			break;

		case 4:
			discount = billAmount * (20d / 100d);
			System.out.println("Customer Type: Diamond");
			break;
			
		case 5:
			discount = billAmount * (25d/100d);
			System.out.println("Customer Type: Elite");
			break;
			
		default:
			System.out.println("Invalid CustomerType");
			break;
		}
		System.out.println("You got Discount : Rs." + discount);
		System.out.println("Price after Discount : Rs." + (billAmount - discount));

	}

}
