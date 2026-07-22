import java.util.Scanner;

class LuckyWinner{

	public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	
	int guesserNumber = 0;
	int luckyNumber = 10;
	
	while(guesserNumber != luckyNumber){
		
		System.out.println("Lost! Enter the number again");
		
		guesserNumber = sc.nextInt();
		
			}
			System.out.println("You are lucky! You won");
	
	
	
	}

}