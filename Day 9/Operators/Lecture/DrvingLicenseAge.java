class Operators{
	
	public static void main(String[] args){
	
	String ageStr = args[0];
	
	int applicantAge = Integer.parseInt(ageStr);
	
	int minAge=  18;
	int maxAge = 60;
	// int applicantAge = 24;
	System.out.println("Dear Applicant, ");
	if(applicantAge >= minAge && applicantAge <= maxAge){
	
		System.out.println("You are Allowed to apply for Driving Licence");
		
		}
	else{
		System.out.println("You are not allowed to apply for Driving Licence because you age is "+ applicantAge);
		}
	
	}

}