class BikeEmiCalculator{
	
	static String showRoomName = "Peak Autos";
	static String brandName = "Royal Enfield";
	String bikeName = "RE HUNTER 350";
	
	
	public static void main(String[] args){
	
	BikeEmiCalculator bike = new BikeEmiCalculator();
	
	int bikePrice = 180000;
	int downPayment = 60000;
	int months = 24;
	int loanAmount = (bikePrice - downPayment);
	int monthlyEmi = (loanAmount/24);
	
	System.out.println("Welcome to "+ showRoomName);
	System.out.println("Brand Name- "+ brandName);
	System.out.println("Bike Name: "+ bike.bikeName);
	System.out.println("Bike Price: "+ bikePrice);
	System.out.println("Down payment: "+ downPayment);
	System.out.println("Loan amount: "+ loanAmount);
	System.out.println("Bike Loan tenure: "+ months);
	System.out.println("Total Loan Amount: "+ loanAmount);
	System.out.println("Monthly EMI: "+ monthlyEmi);
		if(monthlyEmi<20000){
			System.out.println("Affordable Emi Plan");
		}
	}
}