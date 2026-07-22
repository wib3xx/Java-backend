class SwiggyOrder{

	public static void main(String[] args){
	
	String restaurantName = "KFC";
	String deliveryPartnerName = "Swiggy";
	String customerName = args[0];
	String orderName = args[1];
	String restaurantUpdate = args[2];
	int paymentUpdate = Integer.parseInt(args[3]);
	
	placeOrder(restaurantUpdate , paymentUpdate);
		
	}
	private static boolean placeOrder(String restaurantUpdate, int paymentUpdate){
		boolean restaurantAcceptUpdate = restaurantStatus(restaurantUpdate);
		boolean paymentRecieved = checkPayment(paymentUpdate);
			if(restaurantAcceptUpdate && paymentRecieved ){
	
				
				assignDeliveryBoy();
					System.out.println("You got a free delivery & Order Placed Successfully! ");
				} else{
					System.out.println("Restaurant is closed, Come back at 10AM");}
					return true;
	
	}
	private static boolean restaurantStatus(String restaurantUpdate){
		System.out.println("Checking Restaurant Status ");
		if(restaurantUpdate.equals("OPEN")){
			return true; }
			return false;
			
	}
	private static boolean checkPayment(int paymentUpdate){
		System.out.println("Checking payment status");
			if(paymentUpdate >= 200){
				System.out.println("You got a free delivery");
				return true;
					}
						System.out.println("Delivery charges applicable");
						return false;
	
	
	}
	public static boolean assignDeliveryBoy(){
		System.out.println("Assigning Delivery Boy");
		return true;
	
	
	}

}