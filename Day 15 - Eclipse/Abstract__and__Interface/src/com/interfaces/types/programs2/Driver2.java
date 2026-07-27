package com.interfaces.types.programs2;

public class Driver2 {

	public static void main(String[] args) {
		CalculationSystem calc = (i , j) -> {
		
		//Multiplication	
			int product = i * j;
			return product;
		};
		int product = calc.add(2 ,4);
		System.out.println("2 X 4 = "+product);
			
		//Addition
		
		calc = (i, j)->{
				int add = i + j;
				return add;
		};
		int add = calc.add(6, 6);
		System.out.println("6 + 6 = "+add);
		
	}
}
