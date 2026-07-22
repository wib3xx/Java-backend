package com.ecom.booking.system;

public abstract class OrderManagement {

	OrderManagement(){
		System.out.println("================= Amazon India =================");
	}
	public abstract void placeOrder();
	public abstract void editOrder();        //These three methods have no body, They are contract
	public abstract void confirmOrder();     //Every child class MUST implement them
	
	public void getOrderStatus() {
		System.out.println("Order status: Delivered");
	}
	
	
}
 class RetailerUser extends OrderManagement{
	
	@Override 
	public void placeOrder() {
		System.out.println("Retail user has Placed order");
	}
	
	@Override
	public void editOrder() {
		System.out.println("Retail user edited the order");
	}
	
	@Override
	public void confirmOrder() {
		System.out.println("Retail user confirmed order");
	}
}
 
class PremiumUser extends OrderManagement {
	
	@Override
	public void placeOrder() {
		System.out.println("Premium user placed order");
	}
	
	@Override
	public void editOrder() {
		System.out.println("Premium user has edited order");
	}
	
	@Override
	public void confirmOrder() {
		System.out.println("Premium user has confirmed order");
	}
}

class ResellerUser extends OrderManagement {
	
	@Override
	public void placeOrder() {
		System.out.println("Bulk order has placed by reseller");
	}
	
	@Override
	public void editOrder() {
		System.out.println("Bulk order has been edited by reseller");
	}
	
	@Override
	public void confirmOrder() {
		System.out.println("Bulk order has been confirmed by reseller!");
	}
}




























