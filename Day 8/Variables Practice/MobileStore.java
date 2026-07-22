class MobileStore{
	
	static String storeName = "iConcept";
	String brandName = "Apple";
	String mobileName = "iPhone 17 Pro Max";
	
	public static void main(String[] args){
	
	int mobilePrice = 140000;
	MobileStore mobile = new MobileStore();
	MobileStore brand = new MobileStore();
	
	System.out.println("Store Name: " + storeName);
	System.out.println("Brand Name: "+ brand.brandName);
	System.out.println("Mobile Name: " + mobile.mobileName);
	if(mobilePrice > 100000){
		System.out.println("Congratulations! You purchased a premium device");
		}

	}
}