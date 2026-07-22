class FoodDeliveryCoupon{
	
	static String deliveryPartnerName = "Zomato";
	
	public static void main(String[] args){
		
		String customerName = args[0];
		String foodItem1 = args[1];
		String foodItem2 = args[2];
		int cartValue = Integer.parseInt(args[3]);
		
		float discount1 = 20f/100f;
		float discount2 = 10f/100f;
		float disc1Amount = (cartValue * discount1);
		float disc2Amount = (cartValue * discount2);
	
		float cartValueItem1wDiscount = (cartValue - disc1Amount);
		float cartValueItem2wDiscount = (cartValue - disc2Amount);

			System.out.println("Thanks for ordering on "+ deliveryPartnerName);
			System.out.println("Customer Name: "+ customerName);
			System.out.println("Ordered Food Items: 1. "+ foodItem1);
			System.out.println("                    2. "+ foodItem2);
			System.out.println("Total Amount: "+ cartValue);
			
				if(cartValue >= 1000){
					System.out.println("You have ordered food items and You got 20% discount !! You need to pay: Rs."+cartValueItem1wDiscount );
					System.out.println("Thanks for Ordering !");
						} else if(cartValue>=500){
							System.out.println("You have ordered food items and You got 10% discount !! You need to pay: Rs."+ cartValueItem2wDiscount);
							System.out.println("Thanks for Ordering !");
								} else {
									System.out.println("Sorry! No discount this time, You need to pay Rs."+ cartValue);
									System.out.println("Thanks for Ordering !");
									}
		}		
}