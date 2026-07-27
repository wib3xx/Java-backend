package com.interfaces.types.programs2;

public class Driver {

	public static void main(String[] args) {
		MyInterface myInterface = (i, j) -> 
		{
			int sum = i+j;
			return sum;
		};
		int sum = myInterface.add(1, 5);
		System.out.println(sum);
	}
}
