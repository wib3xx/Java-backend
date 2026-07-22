import java.util.Scanner;

class GuesserGame{

	public static void main(String[] args){
	
	int luckyNumber = 10;
	int userEntered = 0;
	
	Scanner sc = new Scanner(System.in);
	
	while(luckyNumber != userEntered){
		System.out.println("Please enter the number!");
		
		userEntered =sc.nextInt();
			if(userEntered == luckyNumber){
				System.out.println("You won !!");
					}else{
						System.out.println("You Lost! Enter the next again");
						}
	
		}

	}

}