import java.util.Scanner;

class LuckyNumber{

	public static void main(String[] args){
	
	int userGuess = 0;
	int expectedNumber = 5;
	
	Scanner sc = new Scanner(System.in);
	
	while(userGuess != expectedNumber){
		
		userGuess = sc.nextInt();
		if(userGuess == expectedNumber){
			System.out.println("Congrats! You won !!!!");
				}
					System.out.println("You lost, enter the number again! ");
		
		
		}
	
	}

}