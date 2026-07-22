class Expense{

	public static void main(String [] args){
	
		String monthSalaryStr = args[0];
		String pensionStr = args[1];
		String extraIncomeStr = args[2];
		
		int monthSalary = Integer.parseInt(monthSalaryStr);
		int pension = Integer.parseInt(pensionStr);
		int extraIncome = Integer.parseInt(extraIncomeStr);
		
		int sum = monthSalary + pension + extraIncome;
		
		System.out.println("Your Total Income for the Month is = " + sum);
		
    }


}