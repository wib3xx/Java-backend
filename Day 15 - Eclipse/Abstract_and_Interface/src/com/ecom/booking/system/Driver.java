package com.ecom.booking.system;

public class Driver {
	public static void main(String[] args) {
		RetailerUser retail = new RetailerUser();
		
			retail.placeOrder();
			retail.editOrder();
			retail.confirmOrder();
			retail.getOrderStatus();
		
				System.out.println();
			
		PremiumUser premium = new PremiumUser();
			premium.placeOrder();
			premium.editOrder();
			premium.confirmOrder();
			premium.getOrderStatus();
		
				System.out.println();
		
		ResellerUser reseller = new ResellerUser();
			reseller.placeOrder();
			reseller.editOrder();
			reseller.confirmOrder();
			reseller.getOrderStatus();
			
				
		
	}
}
