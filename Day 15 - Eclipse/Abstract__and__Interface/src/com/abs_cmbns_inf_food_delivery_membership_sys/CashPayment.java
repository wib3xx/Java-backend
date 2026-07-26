package com.abs_cmbns_inf_food_delivery_membership_sys;

public class CashPayment extends FoodOrder implements IPayment{

	@Override
	public void pay() {
		System.out.println("Payment recieved via cash");
		
	}

	@Override
	void placeOrder() {
		System.out.println("Order has been placed");
		
	}

}
