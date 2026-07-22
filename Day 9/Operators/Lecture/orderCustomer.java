// Develop an application for calculating delivery charges and total price for a product.
//Conditions: If customer type is premium and cart value is 5000 or above, give 10% discount
// If customer type is premium and cart value is 1000 or above, give free delivery
//For other cases, there will be flat 30/- delivery charges 
//User should be allowed to supply / pass information using command line
// 1. Item name, Price
// 2. Name/ Customer Name and Customer type
// Print input details recieved by customer and total cart value and breakup of Price and Delivery charges 
// and discount if any.

class macBookOrderDetails{
	
	//static String brandName = "Apple";
	
	public static void main(String[] args){
	
	String deviceName = args[0];
	String customerName = args[1];
	//String customerType = args[2];
	String productPrice = args[2];
   
   int productPriceByCustomer = Integer.parseInt(productPrice);
   
	float discountPrice = 10f/100f;
	int deliveryCharges = 30;
	float discountAmount = (productPriceByCustomer * discountPrice);
	float finalProductPrice = (productPriceByCustomer - discountAmount);
	
	System.out.println("Total Price of the Product: "+ "Rs."+ productPrice);
	System.out.println("Delivery charges: " + "Rs."+ deliveryCharges);
	
	if(productPriceByCustomer >= 5000){
		System.out.println("You are getting 10% Discount and Free Delivery, because You are a Premium customer!!"+"You need to Pay :"+ "Rs."+ finalProductPrice);}
		else{
		System.out.println("You need to pay Rs." + (productPriceByCustomer + deliveryCharges) );
		}
	}
}