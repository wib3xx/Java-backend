package com.interfaces.types.programs2;

@FunctionalInterface
interface IDiscount 
	{
		int apply (int amount , int disc);
	}

@FunctionalInterface
interface IDiscountECom extends IDiscount{
	int apply(int amount, int disc);
}
	


	

