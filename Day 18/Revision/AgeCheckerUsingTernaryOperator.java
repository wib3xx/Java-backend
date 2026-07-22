class AgeCheckerUsingTernaryOperator{

	public static void main(String[] args){
	
	int age = Integer.parseInt(args[0]);
	
	String result = (age>= 18)? "Adult" : "Minor";
	
	System.out.println("You are: "+ result);
	
	}


}