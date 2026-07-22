class controlFlow{

	public static void main (String[] args){
	
	int amount = Integer.parseInt(args[0]);
	
	boolean deliveryStatus = controlFlow.checkDelStatus(amount);
		System.out.println("Customer delivery status(true : free | false : paid)"+ deliveryStatus);
	
	}
	private static boolean checkDelStatus(int amount){
	
	boolean status = false;
	
	if(amount>= 10000){
		System.out.println("Inside if block");
		return true;
		}else{
			System.out.println("Inside else block");
		}
			return status;
	              // check free delivery if order value is 350 and above
	}
	
}