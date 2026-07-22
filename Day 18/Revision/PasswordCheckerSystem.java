import java.util.Scanner;

	class PasswordCheckerSystem{
	
		public static void main(String[] agrs){
		
		Scanner sc = new Scanner(System.in);
		String password = "";
		
		while(!password.equals("admin123")){
			
			System.out.println("Enter Password: ");
			password = sc.nextLine();
			}
			System.out.println("Access Granted");
		
		}
	
	}