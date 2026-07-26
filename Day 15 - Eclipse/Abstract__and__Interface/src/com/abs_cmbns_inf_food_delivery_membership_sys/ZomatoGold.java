package com.abs_cmbns_inf_food_delivery_membership_sys;

public class ZomatoGold extends FoodOrder implements IPayment, Membership{

	@Override
	public void pay() {
		System.out.println("Payment completed");
		
	}

	@Override
	void placeOrder() {
		System.out.println("Order has been placed");
		
	}

}
