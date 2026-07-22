class EmployeeBonusCalculator{

	static String companyName = "Deloitte";
	
	public static void main(String[] args){
	
	String employeeName = args[0];
	//string employeeSalary = args[1];
	
	int salary = Integer.parseInt(args[1]);
	int jobExperience = Integer.parseInt(args[2]);
	
	float salaryBonus1 = 20f/100f;
	float salaryBonus2 = 10f/100f;
	
	float bonusAmount1 = (salary * salaryBonus1);
	float bonusAmount2 = (salary * salaryBonus2);
	
	float salaryWith20Bonus = (salary + bonusAmount1);
	float salaryWith10Bonus = (salary + bonusAmount2);
	
		System.out.println("Company Name: "+ companyName);
		System.out.println("Employee Name: "+ employeeName);
		System.out.println("Salary: "+ salary);
		System.out.println("Job Experience: "+ jobExperience+" Years");
			if(jobExperience >= 5){
				System.out.println("Congratulations: You are getting 20% bonus in you salary: ");
				System.out.println("Your Salary is Rs."+ (salaryWith20Bonus));
				}	else if(jobExperience >= 3){
						System.out.println("Congratulations: You are getting 10% bonus in you salary:");
						 System.out.println("Your Salary is Rs."+ (salaryWith10Bonus));
						 } else {
							System.out.println("You will start getting bonuses after 3 years!!!");
							}

	}

}