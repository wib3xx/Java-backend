class MovieTicketBooking{
	public static void main(String[] args){
	
	long bookingId = 2234332234577l;
	System.out.println("Booking ID : " + bookingId);
	
	String movieName = "Obsession";
	System.out.println("Movie Name : " + movieName);
	
	String theatreName = "Vega City Mall";
	System.out.println("Theatre name : " + theatreName);
	
	Short seatNum = 121;
	System.out.println("Seat Number : " + seatNum);
	
	int ticketPrice = 399;
	System.out.println("Ticket Price MRP : " + ticketPrice);
	
	String showTime = "7:00 AM";
	System.out.println("Show Time : "+ showTime);
	
	boolean confirmStatus = true;
		if(confirmStatus){
			System.out.println("Your movie ticket is confirmed! ");
	    }
	}
}