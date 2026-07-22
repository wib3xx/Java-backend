class PlacingOrder{

	static String orderWebsite = "Amazon";
	
	public static void main(String[] args){
	
		String customerId = args[0];
		String customerName = args[1];
		int purchaseAmount = Integer.parseInt(args[2]);
		String orderName = args[3];
		
		float discountRegular = 5f/100f;
		float discountPremium = 10f/100f;
		float discountVip = 20f/100f;
		float discountRegAmount = (purchaseAmount * discountRegular);
		float discountPremiumAmount = (purchaseAmount * discountPremium);
		float discountVipAmount = (purchaseAmount * discountVip);
		
		float cartValueAftRegDiscount = (purchaseAmount - discountRegAmount);
		float cartValueAftPremDiscount = (purchaseAmount - discountPremiumAmount);
		float cartValueAftVipDiscount = (purchaseAmount - discountVipAmount);
		
			System.out.println("======== Amazon Order Details ========");
			System.out.println("Customer Id = "+ customerId);
			System.out.println("Customer name: "+ customerName);
			System.out.println("Order Name = "+ orderName);
			System.out.println("Cart Value: "+ purchaseAmount);
			
				if(purchaseAmount <= 500){
					System.out.println("You are regular customer and you got 5% discount on your order.");
					System.out.println("You need to pay Rs."+ cartValueAftRegDiscount);
					}	else if(purchaseAmount <= 1000){
							System.out.println("You are a premium customer, You got 10% discount on you order");
							System.out.println("You need to pay Rs."+ cartValueAftPremDiscount);
							}	else{
								System.out.println("You are the VIP customer, You got 20% Discount");
								System.out.println("You need to pay Rs."+ cartValueAftVipDiscount);
								}
	}
}