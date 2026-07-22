class StaticVariable
{
	static int amount = 2000; //Belongs to class(StaticVariables)
	
	static int interestRate =5;  //Same for all the customers //stores in heap
	
	public static void main(String[] args)
	{
	int balance = 2000;
	System.out.println("Balance : "+ StaticVariable.amount);
	System.out.println("Interest rate : "+ StaticVariable.interestRate+"%");
	
	}
}