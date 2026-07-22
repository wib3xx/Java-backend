class BikeModelDetails{

	static String brandName = "Royal Enfield";
	
	String bikeModel = "RE Hunter 350";
	


	public static void main(String[] args){
	
	int bikePrice = 180000;
	BikeModelDetails model = new BikeModelDetails();
	
	System.out.println("Bike Brand : " + brandName);
	System.out.println("Bike Model : "+ model.bikeModel);
		if(bikePrice > 100000){
		System.out.println("Its a Premium Bike !");
		}
	
	
	}


}