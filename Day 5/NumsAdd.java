class AddNumbers{

	public static void main(String args[])
	{
	System.out.println("START main()");
	
	String firstNumberStr = args[0];
	String secondNumberStr = args[1];
	String thirdNumberStr = args[2];
	String fourthNumberStr = args[3];
	
	//==> This convert the number ("1" format to 1 !)

	int firstNumber = Integer.parseInt(firstNumberStr);
	int secondNumber = Integer.parseInt(secondNumberStr);
	int thirdNumber = Integer.parseInt(thirdNumberStr);
	int fourthNumber = Integer.parseInt(fourthNumberStr);
	
	int sum = firstNumber + secondNumber + thirdNumber + fourthNumber;
	
	System.out.println("Sum of the numbers is " + sum);
	
	System.out.println(" END main()");
	
	
	}

}