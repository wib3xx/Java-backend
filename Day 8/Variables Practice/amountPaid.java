//Write a program using local variable and static variable to find the total price of iPhone 16 
// Price: 100000;
// GST : 18

class ProductTotalPrice{
	
	static int price = 100000;                //Static Variables
	static int gst = 18;                      //Static Variables
	
	
	public static void main(String[] args){
		
		int gstAmount = price * gst/100;              //local variabes
		int totalProductPrice = price + gstAmount;    //local variabes
		
		System.out.println("Product Price: "+ ProductTotalPrice.price);
		System.out.println("Product GST : "+ ProductTotalPrice.gst +"%");
		System.out.println("Product Total GST Amount: "+ gstAmount);
		System.out.println("Product MRP: "+"Rs"+" " +totalProductPrice);
		
	}
}