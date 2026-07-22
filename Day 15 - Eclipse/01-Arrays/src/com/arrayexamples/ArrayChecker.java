package com.arrayexamples;

public class ArrayChecker {

	public static void main(String[] args) {
		
		ArrayChecker.checkArray();
		
	}
	public static void checkArray() {
		
		int numbersType1[] = new int[10];
		
		

		numbersType1[0] = 2;
		numbersType1[1] = 3;
		numbersType1[2] = 1;
		numbersType1[3] = 5;
		numbersType1[4] = 6;
		numbersType1[5] = -998;
		numbersType1[6] = 95;
		numbersType1[7] = 43;
		numbersType1[8] = 21;
		numbersType1[9] = -31;
		
		for(int i = 0; i < numbersType1.length ; i++) {
			int numbers = numbersType1[i]; 
				if(numbers < 0) {
					System.out.println("The Negative Numbers are: "+ numbers);
					//System.out.println(" ");
				}
		}
	
				int numbersType2 [] = new int[8];
		
		numbersType2[0] = 12;
		numbersType2[1] = 4;
		numbersType2[2] = 31;
		numbersType2[3] = 5;
		numbersType2[4] = 6;
		numbersType2[5] = 78;
		numbersType2[6] = 95;
		numbersType2[7] = 42;
		
		for(int i = 0; i < numbersType2.length ; i++) {
			int numbers = numbersType2[i]; 
				if(numbers > 0) {
					System.out.println("The Positive Numbers are: "+ numbers);
				}
		}	
	}
	
}
