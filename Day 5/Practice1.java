class AddingNums{

	public static void main(String [] args){
		System.out.println("Main() starts here");
		
		String firstNumStr = args[0];
		String secondNumStr = args[1];
		
		
		int firstNum = Integer.parseInt(firstNumStr);
		int secondNum = Integer.parseInt(secondNumStr);
		
		int sum = firstNum + secondNum;
		
		System.out.println("The sum is = " + sum);
		
		System.out.println("Main() ends here");
		
		}








}