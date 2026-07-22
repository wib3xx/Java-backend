class GooglePayPayment{

	public static void main(String[] args){
	
	String senderName = args[0];
	String recieverName = args[1];
	int senderBalance = Integer.parseInt(args[2]);
	int transferAmount = Integer.parseInt(args[3]);
	
	moneyTransfer(senderName , recieverName , senderBalance , transferAmount);
	
				System.out.println("======= Payment Portal Gpay =========");
				System.out.println("Your Name: "+ senderName);
				System.out.println("Money Sending to : "+ recieverName);
				System.out.println("Total amount sent: Rs."+ transferAmount);
	}
	public static boolean moneyTransfer(String senderName , String recieverName , int senderBalance , int transferAmount){
		boolean senderStatus = checkSender(senderName);
		boolean recieverStatus = checkReciever(recieverName);
		int senderBalanceStatus = checkBalance(senderBalance);
		int transferMoneyStatus = transferMoney(transferAmount);
			if(senderBalance >= transferAmount){
				System.out.println("Payment Successful!" );
				System.out.println("Remaining Balance: Rs." + (senderBalance - transferAmount));} else{
					System.out.println("Payment Declined due to insufficient funds");}
		return true;
	}
	public static boolean checkSender(String senderName){
		System.out.println("Checking Sender");
		return true;
	
	}
	public static boolean checkReciever(String recieverName){
		System.out.println("Checking Reciever");
		return true;
	
	}
	public static int checkBalance(int senderBalance){
		System.out.println("Checking Balance");
		return senderBalance;
	
	}
	public static int transferMoney(int transferAmount){
		System.out.println("Checking Money Transfer Status");
		return transferAmount;
	}

}