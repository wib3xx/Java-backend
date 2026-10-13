package com.zepto.order;

public class OrderMgmt {

	public static void main(String[] args) {
		
	}
	
	public void placeOrder(Order order) {
		
		
		
		// take the order
		System.out.println("Order Recieved");
		System.out.println("-------------------------");
		System.out.println("Order ID                :"+ order.getOrderId());
		System.out.println("Order CustomerID        :"+ order.getCustomerId());
		System.out.println("Order Status            :"+ order.getOrderStatus());
		System.out.println("Total Amount            :"+ order.getTotalAmount());
		System.out.println("Payment Status          :"+ order.getPaymentStatus());
		System.out.println("Payment Method          :"+ order.getPaymentMethod());
		System.out.println("Delivery Address        :"+ order.getDeliveryAddress());
		System.out.println("Delivery Partner ID     :"+ order.getDeliveryPartnerId() );
		System.out.println("Order Date              :"+ order.getOrderDate());
		System.out.println("Estimated Delivery Time :"+ order.getEstimatedDeliveryTime());
		
		System.out.println("Order Recieved successfully !!");
		
		
		// confirm the payment
		
	}
}


