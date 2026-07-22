class AmazonPrimeDelivery{
	
	static String eCommerceName = "Amazon Prime";
	
	public static void main(String[] args){
	
	String productName = args[0];
	String customerName = args[1];
	String orderPrice = args[2];
	
	int orderAmount = Integer.parseInt(orderPrice);
	
	float discount = 15f/100f;
	float discountAmount = (orderAmount * discount);
	float finalOrderAmountWithDiscount = (orderAmount - discountAmount);
	int deliveryCharge = 50;

	
	
	System.out.println("e-Commerce Website: "+ eCommerceName);
	System.out.println("Product Name: "+ productName);
	System.out.println("Customer Name: "+ customerName);
	System.out.println("Price of item in Cart: "+ orderPrice);
	
		if(orderAmount >= 2000){
			System.out.println("Being a Prime user, You get 15% Discount and Free Delivery!"+ "You need to Pay Rs."+ finalOrderAmountWithDiscount );
			}else if(orderAmount >= 500) {
				System.out.println("You will get free delivery. You need to pay Rs."+ orderPrice);
				} else{
					System.out.println("You need to Pay " + "Delivery Charges: Rs."+ deliveryCharge);
					System.out.println("Total: Rs." + orderPrice + deliveryCharge);
					}
	
	
	}
}