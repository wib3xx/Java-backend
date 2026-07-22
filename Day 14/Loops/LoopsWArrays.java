class Loops{

	public static void main(String[] args){
	
	Loops.printSomething(args);
	
	}
	
	private static void printSomething(String input[])  //5 elements (index from 0 to 4)
	{
	
	System.out.println("Total elements "+ input.length);
		//for loop
		for(int index = 0; index < input.length; index++){
		
		String city = input[index];
		System.out.println(city);
		
		}
	
	
	}

}