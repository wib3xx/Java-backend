class FlipcartOrderSystem{

	static String eCommerceName = "Flipcart";
	String productName = "MacBook Pro";
	
	public static void main(String[] args){
	
	FlipcartOrderSystem product = new FlipcartOrderSystem();
	String customerName = args[0];
	int cartValue = Integer.parseInt(args[1]);
	
	float discount = 15f/100f;
	float discountAmount = (cartValue*discount);
	float productPricewDiscount = (cartValue-discountAmount);
	float deliveryCharges = 50f;
	
		System.out.println("Thanks for shopping from "+ eCommerceName);
		System.out.println("Product Name: "+ product.productName);
		System.out.println("Customer Name: "+ customerName);
		System.out.println("Cart Value: "+ cartValue);
		 if(cartValue>=10000){
			System.out.println("You got 15% discount and free delivery on the item in your cart.");
			System.out.println("You need to pay Rs."+ productPricewDiscount);
			}else if(cartValue >= 3000 || cartValue>= 5000){
				System.out.println("You got free delivery!"+"You need to pay Rs."+ cartValue);
				}else{
					System.out.println("You need to pay Rs."+ cartValue+ " Delivery Charges: Rs."+deliveryCharges );
					System.out.println("Total Amount You need to pay Rs."+ (cartValue+ deliveryCharges));
					}
	}
}