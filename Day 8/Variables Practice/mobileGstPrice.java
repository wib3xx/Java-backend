// Program for iPhone 15 
// Price : 1000000
// GST: 20

class ProductTotalPrice{
	
	static int price = 1000000;
	static int gst = 20;
	
	
	public static void main(String[] args){
	
	int totalGstAmount = price * gst/100;
	int totalProductPrice = price + totalGstAmount;
	
	System.out.println("Price of iPhone 15: "+ ProductTotalPrice.price);
	System.out.println("GST Amount: "+ ProductTotalPrice.gst);
	System.out.println("Total GST Amount: " + totalGstAmount);
	System.out.println("Total Price of Apple iPhone 15 "+ totalProductPrice);
	
	}


}