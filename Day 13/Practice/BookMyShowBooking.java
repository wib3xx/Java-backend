class BookMyShowBooking{

	public static void main(String[] args){
	
	String customerName = args[0];
	String movieName = args[1];
	int ticketPrice = Integer.parseInt(args[2]);
	int numberOfSeats = Integer.parseInt(args[3]);
	
	bookTicket(numberOfSeats , ticketPrice , customerName , movieName);
	
	}
	public static boolean bookTicket(int numberOfSeats , int ticketPrice , String customerName , String movieName ){
		System.out.println("======= BookMyShow Booking Details =======");
		System.out.println("Customer Name: "+ customerName);
		System.out.println("Movie Name: "+ movieName);
		System.out.println("Ticket Price: Rs."+ ticketPrice);
		System.out.println("Number of Seats Required : "+ numberOfSeats);
		
		boolean noOfSeatStatus = checkSeatAvailability(numberOfSeats);
		boolean checkingPaymentStatus = processPayment(ticketPrice);
			if(noOfSeatStatus && checkingPaymentStatus ){
				checkMovieAvailability();
				sendTicket();
					System.out.println("Your Movie tickets have been booked !! Enjoy !!");
					return true;
				} 
					System.out.println("Movie booking declined");
					return false;
	}
	private static boolean checkMovieAvailability(){
		//System.out.println("Checking Movie Availability");
		return true;
	}
	private static boolean checkSeatAvailability(int numberOfSeats){
		//System.out.println("Checking seat availability");
			if(numberOfSeats <=4){
			System.out.println("Reserving your seats");
			return true;
			} 
			System.out.println("Seats are full");
				 return false;
	}
	private static boolean processPayment(int ticketPrice){
		//System.out.println("Processing Payment");
			if(ticketPrice >= 600){
				System.out.println("Payment Done");
					return true;
				}
					System.out.println("Payment Failed");
					return false;
	
	}
	private static boolean sendTicket(){
		//System.out.println("Sending ticket");
		return true;
	}

}