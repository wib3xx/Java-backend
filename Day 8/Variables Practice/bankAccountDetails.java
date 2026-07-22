class BankAccountSystem{
	
	static String bankName = "SBI Bank";
	String customerName = "Sarvagay Sanmotra";
	
	
	public static void main(String[] args){
	
	int accountBalance = 50000;
	
	BankAccountSystem account = new BankAccountSystem();
	
	System.out.println("Bank Name : "+ BankAccountSystem.bankName);
	System.out.println("Customer Name: " + account.customerName);
		if(accountBalance > 10000){
			System.out.println("Premium Customer");
		}
	}
}