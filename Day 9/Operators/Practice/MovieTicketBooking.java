class MovieTicketBooking{
	
	static String theatreName = "VegaCity Mall";
	String movieName = "Dhurandhar: The Revenge";
	
	public static void main(String[] args){
	
	String customerName = args[0];
	String age = args[1];
	
	MovieTicketBooking movie = new MovieTicketBooking();
	
	int ticketPrice = 350;
	float discount1 = 50f/100f;
	float discount2 = 30f/100f;
	float ticketDiscountAmount1 =(ticketPrice * discount1);
	float ticketPriceAfterDiscount1 = (ticketPrice - ticketDiscountAmount1);
	float ticketDiscountAmount2 = (ticketPrice * discount2);
	float ticketPriceAfterDiscount2 = (ticketPrice - ticketDiscountAmount2);
	
	int customerAge = Integer.parseInt(age);
	
		System.out.println("Welcome to "+ theatreName);
		System.out.println("Movie Name: "+ movie.movieName);
		System.out.println("Customer Name: "+ customerName);
		System.out.println("Age: "+ customerAge);
		//System.out.println("Ticket Price: "+ "Rs."+ ticketPrice);
			if(customerAge < 12){
				System.out.println("Congratulations! You got 50% discount, You need to pay: Rs."+ ticketPriceAfterDiscount1);
					}else if(customerAge >= 60){
						System.out.println("Cpngratulations! You got 30% discount, You need to pay: Rs."+ ticketPriceAfterDiscount2);
						}else{
							System.out.println("You need to pay: "+ ticketPrice);
							}	
	
	}
}