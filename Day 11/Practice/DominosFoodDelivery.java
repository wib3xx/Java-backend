/* Create a food delivery app 
 Main task: placeOrder() 
 sub tasks: check restaurant status()
            make payment 
            assign delivery partner 
 Condition: restaurant open --> order accept
			restaurant close --> order reject */

class DominosFoodOrder{

	public static void main(String[] args){
	
	String restaurantName = "Dominos Pvt. Ltd.";
	String customerName = args[0];
	String foodItemName = args[1];
	String restaurantStatus = args[2];
	placeOrder(restaurantStatus);
	
	
	}
	public static boolean placeOrder(String restaurantStatus){
		boolean restaurantOpen = checkRestaurant(restaurantStatus);
			if(restaurantOpen){
				
		makePayment();
		assignDeliveryPartner();
		System.out.println("Order placed successfully");
		} else {
			System.out.println("Restaurant is closed!");
			System.out.println("Order Rejected! ");
			}
			return true;
		
	}
	public static boolean checkRestaurant(String restaurantStatus){
		System.out.println("Checking restaurant status");
			if(restaurantStatus.equals("OPEN")){
				return true;}
		return false;
		
	}
	public static boolean makePayment(){
		System.out.println("Checking Payment status");
		return true;
	
	}
	public static boolean assignDeliveryPartner(){
		System.out.println("Assigning Delivery Partner");
		return true;
		
	}
	
}	