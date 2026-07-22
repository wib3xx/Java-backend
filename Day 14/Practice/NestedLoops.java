class NestedLoops{

	public static void main(String[] args){
	
		for(int i=1; i<=5; i++){      //Responsible for printing rows
			for(int j=1; j <= i; j++){   //Responsible for prinitng columns
			
				System.out.print(" * ");  //Print star without a new line
			}
			System.out.println();        //Move to next line after each row printing
		}
	
	}

}