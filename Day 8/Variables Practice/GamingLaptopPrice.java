class LaptopGstCalculator{
	
	static String storeName = "Best Buy Computers";
	String deviceName = "Dell inspirion 15 7000 Gaming";
	
	public static void main(String[] args){
	
	int laptopPrice = 85000;
	int gst = 18;
	int discount = 5000;
	
	int gstAmount = (laptopPrice * gst/100);
	int finProductAmount = (laptopPrice + gstAmount);
	int finalAmount = (finProductAmount - discount);
	
	LaptopGstCalculator device = new LaptopGstCalculator();
	
	System.out.println("Welcome to "+ storeName);
	System.out.println("Your Selection is "+ device.deviceName);
	System.out.println("Price without GST: "+"Rs."+ laptopPrice);
	System.out.println("GST: " +gst+ "%");
	System.out.println("GST Amount: "+"Rs."+ gstAmount);
	System.out.println("Final Product MRP: "+"Rs."+ finProductAmount);
	System.out.println("You Paid after Discount: "+"Rs."+finalAmount);
		if(finalAmount > 80000){
			System.out.println("Hey! You Got a Premium Gaming Laptop!!");
		}
	}
}