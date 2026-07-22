package com.hello.block;

public class PizzaOrderingSystem {

	public static void main(String[] args) {
		
		int itemName = Integer.parseInt(args[0]);
		placeOrder(itemName);
	}
	private static void placeOrder(int itemName) {
		
		String pizzaName = null;
		int price = 0;
		
		switch(itemName) {
		
		case 1: 
			pizzaName = "Margherita";
			price = 199;
			break;
			
		case 2:
			pizzaName = "Farmhouse";
			price = 299;
			break;
			
		case 3:
			pizzaName = "Veg Deluxe";
			price = 399;
			break;
			
		case 4:
			pizzaName = "Paneer Pizza";
			price = 499;
			break;
			
		case 5:
			pizzaName = "Chicken Pizza";
			price = 599;
			break;
			
		default:
			System.out.println("Invalid Pizza");
			return;
		}
		System.out.println("======== Dominos Pizza Reciept ========");
		System.out.println("        Pizza Name: "+ pizzaName);
		System.out.println("        Price: Rs."+ price);
		System.out.println("        Order Successful");
		
	}
	
}
