class PaymentProcessor{

	public static void main(String[] args){
	
	String senderAccNo = args[0];
	String recieverAccNo = args[1];
	int senderAccountBalance = Integer.parseInt(args[2]);
	
	transferFunds(senderAccNo , recieverAccNo ,senderAccountBalance);
				System.out.println("===========Banking System Ltd.========");
				System.out.println("Benefeciary account No. :"+ recieverAccNo);
				System.out.println("Benefactor account No. :"+ senderAccNo);
				System.out.println("Benefactor sent: "+ senderAccountBalance);
	
	}
	
	public static boolean transferFunds(String senderAccNo, String recieverAccNo , int senderAccountBalance){
		boolean senderStatus = checkSenderDetails(senderAccNo);
		boolean recieverStatus = checkRecieverDetails(recieverAccNo);
		int senderBalanceStatus = senderBalance(senderAccountBalance);
			if(senderStatus && recieverStatus && senderBalanceStatus <= 1000){
				System.out.println("Transaction Completed");} else{
				System.out.println("Transaction Declined");
				} return true;
				
	}
	
	public static boolean checkSenderDetails(String senderAccNo){
		System.out.println("Checking sender details");
		return true;
	
	}
	
	public static boolean checkRecieverDetails(String recieverAccNo){
		System.out.println("checking reciever details");
		return true;
	
	}
	public static int senderBalance(int senderAccountBalance){
		System.out.println("checking sender balance");
		return senderAccountBalance;
	
	}

}