package com.abstractt.ordermgmt.system;

public abstract class OrderManagement {
	
	OrderManagement(){
		System.out.println("=================== MYNTRA INDIA PVT. LTD. ===================");
	}
		public abstract void placeOrder();
		public abstract void editOrder();
		public abstract void confirmOrder();
	
		public void getOrderStatus() {
		System.out.println("Order Delivered!");
	}
}

class RetailUser extends OrderManagement{
	
	@Override
	public void placeOrder() {
		System.out.println("Retailer has placed order!");
	}
	
	@Override
	public void editOrder() {
		System.out.println("Retailer has edited order!");
	}
	
	@Override
	public void confirmOrder() {
		System.out.println("Retailer has confirmed order!!");
	}
}

class PremiumUser extends OrderManagement{
	
	@Override
	public void placeOrder() {
		System.out.println("Premium User has placed the order!");
	}
	
	@Override
	public void editOrder() {
		System.out.println("Premium user has edited order");
	}
	
	@Override
	public void confirmOrder() {
		System.out.println("Premium User has confirmed order");
	}
}

class ResellerUser extends OrderManagement{
	
	@Override
	public void placeOrder() {
		System.out.println("Reseller user has placed bulk orders");
	}
	
	@Override
	public void editOrder() {
		System.out.println("Reseller has editted bulk orders");
	}
	
	@Override
	public void confirmOrder() {
		System.out.println("Reseller has confirmed bulk orders");
	}
	
}













































