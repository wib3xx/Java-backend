class OnlineShoppingCart{
	
	static String webSiteName = "Amazon";
	
	String product1 = "MacBook Neo";
	String product2 = "AirPods";
	
	public static void main(String[] args){
	
	int product1Price = 60000;
	int product2Price = 25000;
	int totalAmount = product1Price + product2Price;
	
	OnlineShoppingCart product = new OnlineShoppingCart();
		
		System.out.println("Welcome To Amazon:");
		System.out.println("Product 1 : "+ product.product1);
		System.out.println("Product 2 : "+ product.product2);
		System.out.println("Total Amount  paid: "+"Rs."+ totalAmount );
		if(totalAmount>50000){
		System.out.println("You are getting a free Delivery!!");
		
		}
	}
}