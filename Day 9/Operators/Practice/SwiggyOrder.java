// Write a program to check the minimum order value allowed to place an order on Swiggy
// condition--> 100 above then free delivery

class SwiggyDelivery{

	static String deliveryPartner = "Swiggy";
	String restaurantPartnerName = "Chinese Hut";
	//String orderName = "Chilli Garlic Noodles";
	
	public static void main(String[] args){

	String orderName = args[0];
	String orderPrice = args[1];
	
	SwiggyDelivery restaurantName = new SwiggyDelivery();
	
	int orderPricee = Integer.parseInt(orderPrice);
	//SwiggyDelivery order = new SwiggyDelivery();
	int deliveryCharges = 30;
	
	System.out.println("Order Details: ");
	System.out.println("Delivery Partner Name: "+ deliveryPartner);
	System.out.println("Restaurant Name: "+ restaurantName.restaurantPartnerName);
	System.out.println("Order Name: "+ orderName);
	System.out.println("Order Price: " + orderPricee);
		if(orderPricee >= 100){
			System.out.println("You will get a free Delivery");
		} else{
			System.out.println("Delivery Charges Rs.30");
			System.out.println("You need to pay: "+ (orderPricee + deliveryCharges) );
		}
	
	
	}

}

