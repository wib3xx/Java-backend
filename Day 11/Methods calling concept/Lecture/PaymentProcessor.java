class PaymentProcessor
{

  public static void main(String args[])
  {
   System.out.println("main START");
   
   PaymentProcessor.tranferFund("0987654321", "1234567890");
   
   System.out.println("main START");
  
  }

  public static boolean tranferFund(String senderAccNo, String receiverAccNo)
  {
	System.out.println("tranferFund START");
	
	// Calling the method
	boolean recStatus = PaymentProcessor.checkReceiverDetails(receiverAccNo);
	 
	boolean senderStatus = PaymentProcessor.checkSenderDetails(senderAccNo);
	
	int balance = PaymentProcessor.checkBalance(senderAccNo);
	
	System.out.println("tranferFund END");
	return true;
	 
  }
  
  public static boolean checkReceiverDetails(String recAccNo)
  {
	  System.out.println(" checking receiver's details");
	  return true;
	  
  }
  
  public static boolean checkSenderDetails(String senderAccNo)
  {
	  
	   System.out.println(" checking sender's details");
	   return true;
  }
  
  public static int checkBalance(String senderAccNo)
  {
	   System.out.println(" checking balance details");
	  return 1000;
	  
  }
  
  


}