package com.abs_cmbns_inf_food_delivery_membership_sys;

public class Driver {

	public static void main(String[] args) {
		
		System.out.println("============== Food Order Status ============== ");
		System.out.println();
		FoodOrder order;
		IPayment payment;
		System.out.println("---------------- Zomato Gold ------------------");
		order = new ZomatoGold();
		payment = new ZomatoGold();
		
		order.placeOrder();
		payment.pay();
			if(order instanceof Membership) {
				System.out.println("Gold Member: Free Delivery + 20% OFF");
			} else {
				System.out.println("Normal User: No Membership Benefits");
			}
			System.out.println();
			System.out.println("---------------- Swiggy One ------------------");
		order = new SwiggyOne();
		payment = new SwiggyOne();
		
		order.placeOrder();
		payment.pay();
			if(order instanceof Membership) {
				System.out.println("Gold Member: Free Delivery + 20% OFF");
			} else {
				System.out.println("Normal User: No Membership Benefits");
			}
			System.out.println();
		System.out.println("---------------- Cash Payment ------------------");
		order = new CashPayment();
		payment = new CashPayment();
		
		order.placeOrder();
		payment.pay();
			if(order instanceof Membership) {
				System.out.println("Gold Member: Free Delivery + 20% OFF");
			} else {
				System.out.println("Normal User: No Membership Benefits");
			}
			System.out.println();
			
	 System.out.println("---------------- Card Payment ------------------");	
		order = new CardPayment();
		payment = new CardPayment();
		
		order.placeOrder();
		payment.pay();
			if(order instanceof Membership) {
				System.out.println("Gold Member: Free Delivery + 20% OFF");
			} else {
				System.out.println("Normal User: No Membership Benefits");
			}
	}
}
















