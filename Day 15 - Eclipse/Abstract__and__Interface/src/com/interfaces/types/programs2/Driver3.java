package com.interfaces.types.programs2;

public class Driver3 {
	public static void main(String[] args) {
		IDiscount iDiscount = (amt , dsc) -> {
			int disc = amt * dsc /100;
			return disc;
		};
		int result = iDiscount.apply(1000, 5);
		System.out.println(result);
}
}
