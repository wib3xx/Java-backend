// Add two numbers using two methods


class AddNumbers{

public static void main(String[] args){ //JVM is calling this main method(AddNumbers.main())  //A static method calls another static method

	System.out.println("Start main()");
	//call the methods from main()
	
	String input1 = args[0];
	String input2 = args[1];
	
	int first = Integer.parseInt(input1);
	int second = Integer.parseInt(input2);
	
	int result = AddNumbers.add(first , second); //calling a method

	System.out.println("Sum of two numbers: "+ result);
	
	System.out.println("End main()");
	} 

static int add(int firstNumber, int secNumber){  //A static method calls another static method

	System.out.println("Start add()");
	int sum = firstNumber + secNumber;
	System.out.println("End add()");
	
	return sum;
	}
}