class FoodDelivery{
	
	static String appName = "Swiggy";
	String foodItem1 = "Burger";
	String foodItem2 = "Pizza";
	String foodItem3 = "Coke";
	
	
	public static void main(String[] args){
	
	int quantity = 3;
	int pricePerItem = 100;
	int total = quantity*pricePerItem;
	
	FoodDelivery food = new FoodDelivery();
	
	
	System.out.println("Food Partner Name: "+ appName);
	System.out.println("Food Item 1 : " + food.foodItem1 +" X 1");
	System.out.println("Food Item 2 : " + food.foodItem2+ " X 1");
	System.out.println("Food Item 3 : " + food.foodItem3+ " X 1");
	
	System.out.println("Total Price for 3 Food Items = " + total );
		if(total > 250){
			System.out.println("You are eligible for FREE Food Delivery !!!!");}
	
	}
}