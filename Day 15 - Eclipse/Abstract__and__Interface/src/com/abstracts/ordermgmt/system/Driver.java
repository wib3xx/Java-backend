package com.abstracts.ordermgmt.system;

public class Driver {

	public static void main(String[] args) {
		RetailUser retail = new RetailUser();
		retail.placeOrder();
		retail.editOrder();
		retail.confirmOrder();
		retail.getOrderStatus();
			System.out.println();
		
		PremiumUser premiumUser = new PremiumUser();
		 premiumUser.placeOrder();
		 premiumUser.editOrder();
		 premiumUser.confirmOrder();
		 premiumUser.getOrderStatus();
		 	System.out.println();
		 	
		ResellerUser reseller = new ResellerUser();
			reseller.placeOrder();
			reseller.editOrder();
			reseller.confirmOrder();
			reseller.getOrderStatus();
	
	}
}
