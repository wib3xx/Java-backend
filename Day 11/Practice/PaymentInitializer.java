class PaymentInitializer{

	public static void main(String[] args){
	
	String senderAccNo = args[0];
	String recieverAccNo = args[1];
	
	transferFunds(senderAccNo , recieverAccNo);
	
	
	}
	
	public static boolean transferFunds(String senderAccNo , String recieverAccNo ){
	
	boolean recieverStatus = checkRecieverDetails(recieverAccNo);
	boolean senderStatus = checkSenderDetails(senderAccNo);
	int senderBalance = checkSenderBalance(senderAccNo);
	
		if(recieverStatus && senderStatus && senderBalance >= 500){
			System.out.println("Payment is Successfull");
		} else{
			System.out.println("Payment Declined");
		}
	return true;
	}
	
	public static boolean checkSenderDetails(String senderAccNo){
		System.out.println("Checking Sender Details");
		return true;

	}
	
	public static boolean checkRecieverDetails(String recieverAccNo){
		System.out.println("Checking Reciever Details");
		return true;
	
	}
	
	public static int checkSenderBalance(String senderAccNo){
		System.out.println("Checking Balance");
	
		return 1000;
	}
}