import java.util.Scanner;
public class PasswordCheckingSystem {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String password = "";
		
		while(!password.equals("admin1234")) {
			
			System.out.println("Enter Password: ");
			
			password = sc.nextLine();
		}
		System.out.println("Access Granted successfully");
	}
}
