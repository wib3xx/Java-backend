class DataTypes{
	
	public static void main(String [] args){


		byte age = 18; //creating variable and assigning the value
		// Range : -128 to 127 //8 bits 
			System.out.println("Age is : " + age + ". Now he is an adult. " );
		
		long number = 6005815141L;
		System.out.println("Contact Number: " + number);
		
		short amount = 1234;
		// Range : -2^16 to +2^16  -1   // 16 bits
			System.out.println("Balance is " + amount);
		
		
		int balance = 120000;
			System.out.println("Balance for the year " + balance);
		// range : -2^32 to +2^32 -1     // 32bits
		
		
		float temp = 81.50f; // 32 bits --> 64 bits
			System.out.println("My percentage was " + temp);
		// range : 32 bits // decimals	
		
		
		boolean status = true;
			System.out.println("is short 16 bits?? : " + status);	
		//  It determines the True or false !!
		
		
		char ch = 'S';
		// Used with single quote  '' not "" !!    // 16 bits 
			System.out.println("My name & lastname starts with letter: " + ch);
		
	}

}