package com.interfaces.functional.lambda.shopping.disc.sys;

public class Driver {

	public static void main(String[] args) {
		ShoppingDiscount disc = (amount, discount) ->{
			return discount = amount * discount/100;
		};
		int result = disc.calculate(1000, 5);
		System.out.println("Price of TShirt : Rs. 1000");
		System.out.println("You got 5% Discount");
		System.out.println("Discount Price: Rs."+ result);
		
	}
}
