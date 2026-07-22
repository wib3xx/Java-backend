class calculations{
	public static void main(String[] args){
	
	String num_A_Str = args[0];
	String num_B_Str = args[1];
	String num_C_Str = args[2];
	
	
	int numA = Integer.parseInt(num_A_Str);
	int numB = Integer.parseInt(num_B_Str);
	int numC = Integer.parseInt(num_C_Str);
	
	
	int product = numA * numB * numC;
	
	System.out.println(" a x b x c = " + product );
	
	}


}