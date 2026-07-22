class MobilePhoneDetails{
	public static void main(String[] args){
	
	String brandName = "Apple";
	System.out.println("Mobile Brand: " + brandName);
	
	String modelName = "iPhone 15";
	System.out.println("Model Name: " + modelName);
	
	int price = 89900;
	System.out.println("MRP: " +"Rs"+ price);
	
	int storageCapacity = 128;
	System.out.println("Variant Storage Capacity: " + storageCapacity + "GB");
	
	short ramCapacity = 16;
	System.out.println("RAM: " + ramCapacity+ "GB");
	
	short batteryCap = 100;
	System.out.println("battery health: " + 100+ "%");
	
	boolean is5gSupport = true;
		if(is5gSupport){
		System.out.println("5G Supported");
		}
	
	}
}