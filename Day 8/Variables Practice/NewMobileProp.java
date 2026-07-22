class MobileGstCalculator{
	
	static String storeName = "iConcept";
	String mobileName = "iPhone 16";
	
	public static void main(String[] args){
	
	int mobilePrice = 100000;
	int gst = 18;
	
	int gstAmount = (mobilePrice * gst/100);
	int totalAmount = (mobilePrice + gstAmount);
	
	MobileGstCalculator device = new MobileGstCalculator();
	
	System.out.println("Device :"+ device.mobileName);
	System.out.println("Store :"+ storeName);
	System.out.println("Mobile Price without GST : "+ "Rs."+ mobilePrice);
	System.out.println("GST: "+ "Rs."+ gstAmount);
	System.out.println("iPhone Price = "+ "Rs."+ totalAmount);
	if(totalAmount > 100000){
		System.out.println("You got a premium device! ");
		
		}
	
	}
	
}