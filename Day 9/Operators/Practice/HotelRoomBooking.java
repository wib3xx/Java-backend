class HotelRoomBooking{
	
	static String hotelName = "Taj Hotel";
	
	public static void main(String[] args){
	
	String customerName = args[0];
	String roomType = args[1];
	
	int stayDays = Integer.parseInt(args[2]);
	
	int pricePerDay = 3500;
	float discount20 = 20f/100f;
	float discount10 = 10f/100f;
	float discount20daysAmount = (pricePerDay * discount20);
	float discount10daysAmount = (pricePerDay * discount10);
	float roomPrice20 = (pricePerDay - discount20daysAmount);
	float roomPrice10 = (pricePerDay - discount10daysAmount);
	
	System.out.println("Welcome to "+ hotelName);
	System.out.println("Customer Name: "+ customerName);
	System.out.println("Room Type you prefered: "+ roomType);
	System.out.println("No. of Days you will stay: "+ stayDays);
	System.out.println("Price of room: "+ pricePerDay);
		if(stayDays >= 5){
			System.out.println("Enjoy your room with 20% discount on rent. You need to pay Rs."+ roomPrice20);
				} else if(stayDays >= 3){
				System.out.println("Enjoy your room with 10% discount on rent. You need to pay Rs."+ roomPrice10);
				} else{
						System.out.println("You need to pay : Rs."+ pricePerDay);
						}
			
	}
}