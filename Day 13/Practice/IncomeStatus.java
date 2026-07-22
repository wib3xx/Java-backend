/*Develop an application to identify the category of individual based on income range
	1. Yearly income less than 200lakh  --> BPL
	2. More than 2 lakh and less than 10 lakh --> Lower middle class
	3. More than 10 lakh and less than 1 cr--> Middle Class
	4. More than 10 cr --> Upper  class */
	
class AnnualIncomeDeterminer{

	public static void main(String [] args){
	
	int annualSalary = Integer.parseInt(args[0]);
	
	AnnualIncomeDeterminer.IncomeDeterminer(annualSalary);
	
	}
	public static void IncomeDeterminer(int AnnualSalary){
		if(AnnualSalary < 200000){
			System.out.println("Your income status low so you fall in Below Poverty Line");
			} else if(AnnualSalary > 200000 && AnnualSalary < 100000){
				System.out.println("Your income status is medium so you fall in Lower Middle Class");
				} else if(AnnualSalary > 100000 && AnnualSalary < 10000000){
					System.out.println("Your income status is Better so you fall in Middle class ");
					} else {
						System.out.println("Your income status is high  so you fall in Upper class");
						
						}
					
	
		}

}