import java.util.Scanner;

	class GuesserGame{
	
		public static void main(String[] args){
		
		
		int userGuess = 0;
		int correctNumber = 13;
		
		Scanner sc = new Scanner(System.in);
		
		while(userGuess != correctNumber){
			System.out.println("You lost, Enter the number again");
			
			userGuess = sc.nextInt();
			
			}
			System.out.println("You won !!!");
		
		}
	
	}