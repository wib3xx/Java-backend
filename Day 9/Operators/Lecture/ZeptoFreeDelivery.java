// Write a program to check the minimum order value allowed to place an order on Zepto
// condition--> 450 above then free delivery

class ZeptoDelivery{
	
	static String storeName = "Zepto";
	String productName = "iPhone 16";
	
	public static void main(String[] args){
	
	ZeptoDelivery product = new ZeptoDelivery();
	
	int price = 100000;

	int freeDeliveryAbove  = 450;
		
	System.out.println("Store Name: "+ storeName);
	
	System.out.println("Product Name: "+ product.productName);
	
	System.out.println("Product Price: "+ price);
	
	System.out.println(price > freeDeliveryAbove);  
	System.out.println("Congratulations! You are getting a free delivery!!!");
	
	}
}