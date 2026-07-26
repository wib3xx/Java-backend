package com.abs_cmbns_inf_food_delivery_membership_sys;

public class CardPayment extends FoodOrder implements IPayment{

	@Override
	public void pay() {
		System.out.println("Payment recieved via card");
		
	}

	@Override
	void placeOrder() {
		System.out.println("Order has been placed");
		
	}

}
