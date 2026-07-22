/* Read the requirement first              Immediately convert into small tasks:    
	Banking Example:                        checkRecieverDetails()
	"Transfer Funds"                        checkSenderDetails()
	1. Check reciever details               checkSenderAccountBalance()
	2. Check sender details                 transferFund()
	3. Check Sender balance
	4. Transfer Money */
	
class PaymentProcessor{               

	public static void main(String[] args){       //JVM STARTS FROM HERE main()
	
		PaymentProcessor.transferFund("12345678", "0987654321");    //first step
	
	}
	
	public static boolean transferFund(String senderAccNo , String recieverAccNo){
	
	boolean recieverStatus = PaymentProcessor.checkRecieverDetails(recieverAccNo);
	boolean senderStatus = PaymentProcessor.checkSenderDetails(senderAccNo);
	int senderBankBalance = PaymentProcessor.checkBalance(senderAccNo);
		System.out.println(recieverStatus);
		System.out.println(senderStatus);
		System.out.println(senderBankBalance);
	
	return true;

	}
	
	public static boolean checkRecieverDetails(String recieverAccNo){
		System.out.println("Check Reciever details");
		return true;
	
	}
	
	public static boolean checkSenderDetails(String senderAccNo){
		System.out.println("Check Sender details");
		return true;
	
	}
	
	public static int checkBalance(String senderAccNo){
		System.out.println("Checking Balance");
		return 1000;
	
	}

}