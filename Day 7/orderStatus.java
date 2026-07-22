class OrderStatus{
	public static void main(String [] args){
	
	int idProduct = 4453366;
	System.out.println("Your order id: " + idProduct);
	
	String productInfo = " Laptop ";
	System.out.println("Product : " + productInfo);
	
	int productPrice = 77000;
	System.out.println("Product MRP: " + productPrice);
	
	short product_GST = 5564;
	System.out.println("Product GST: " + product_GST);
	
	int cartInfo = 100001;
	System.out.println("Total cart value: " + cartInfo);
	
	String custName = "Sarvagay Sanmotra";
	System.out.println("Customer Name : " + custName);
	
	String pickupStatus = "Parul university, Vadodara, 391760";
	System.out.println("Pickup Address: " + pickupStatus);
	
	String deliveryStatus = "131, Panjtirthi, Andheri, Jammu 180001";
	System.out.println("Delivered to : " + deliveryStatus);
	
	String Status1 = args[0];
		System.out.println("Status: Tracking: " + Status1);
	
	//String Status2 = args[1];
	//	System.out.println("Status: Out for delivery " + Status2);
		
	//String Status3 = args[2];
	//	System.out.println("Status: Delivered " + Status3);
		
	boolean boxPacked = true;
		if(boxPacked){
		System.out.println("Order Package status: Yes box is packed");
		}
	
	}

}