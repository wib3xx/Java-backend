class FoodDeliveryDetails{
	public static void main(String[] args){
	
	long orderId = 55499822105833L;
	System.out.println("Order Id: " + orderId);
	
	String restaurantName = "KFC";
	System.out.println("Restaurant Name: "+ restaurantName);
	
	String foodItem = "Veg Burger X 2, Italian Pasta X 2";
	System.out.println("Food Items: " + foodItem);
	
	short quantity = 2;
	System.out.println("Total Quantity: 2 X " + quantity);
	
	int totalAmount = 550;
	System.out.println("Total Amount paid: " + totalAmount);
	
	String deliveryPartnerName = "Zomato";
	System.out.println("Delivery Partner: " + deliveryPartnerName );
	
	boolean isDelivered = true;
		if(isDelivered){
			System.out.println("Delivery Status: Delivery Done ");
		}
	} 
}