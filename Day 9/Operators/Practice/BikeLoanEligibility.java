class BikeLoanEligibility{
	
	static String bikeBrand = "Royal Enfield";
	String bikeModelName = "Royal Enfield Hunter 350";
	
	public static void main(String[] args){
	
	BikeLoanEligibility bikeModel= new BikeLoanEligibility();
	
	String applicantName = args[0];
	String applicantAge = args[1];
	String applicantSalary = args[2];
	
	
		int bikePrice = 180000;
		int age = Integer.parseInt(applicantAge);
		int salary = Integer.parseInt(applicantSalary);
		//int price = Integer.parseInt(bikePrice);
		
			System.out.println("=========HERE IS YOUR APPLICATION STATUS===========");
			System.out.println("\n Your choice is our responsibility ---"+ bikeBrand);
			System.out.println("Bike Model Name: " +(bikeModel.bikeModelName) );
			System.out.println("Applicant Name: "+ applicantName);
			System.out.println("Applicant Age: "+ age);
			System.out.println("Applicant Salary: "+ salary);
			System.out.println("Bike Price: "+"Rs."+ bikePrice);
				if(salary >= 50000 && age >= 21){
					System.out.println("Loan Approved");
					}else{
						System.out.println("Sorry! Loan Rejected");
						
						}
	
	
	
	}
}