class SwiggyOrder{

	public static void main(String[] args){
	
	String restaurantName = "KFC";
	String deliveryPartnerName = "Swiggy";
	String customerName = args[0];
	String orderName = args[1];
	String restaurantUpdate = args[2];
	int paymentUpdate = Integer.parseInt(args[3]);
	
	placeOrder(restaurantStatus , checkPayment);
	
	
	
	}
	private static  placeOrder(String restaurantStatus, int paymentUpdate){
		boolean restaurantAcceptUpdate = restaurantStatus(restaurantUpdate);
		int paymentRecieved = checkPayment(paymentUpdate);
			if(restaurntAcceptUpdate && paymentUpdate ){
	
				checkRestaurantStatus();
				checkPayment();
				assignDeliveryBoy();
					System.out.println("You got a free delivery & Order Placed Successfully! ");
				} else{
					System.out.println(Restaurant is closed, Come back at 10AM);}
	
	}
	private static boolean restaurantStatus(String restaurantUpdate){
		System.out.println("Checking Restaurant Status ");
		if(String restaurantUpdate.equals("OPEN")){
			return true; }
			return false;
			
	}
	private static int checkPayment(int paymentUpdate){
		System.out.println("Checking payment status");
			if(paymentUpdate >= 200){
				System.out.println("You got a free delivery");
					} else {
						System.out.println("Delivery charges applicable");}
	
	
	}
	public static boolean assignDeliveryBoy(){
		System.out.println("Assigning Delivery Boy");
		return true;
	
	
	}

}