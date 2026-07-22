class AmazonPrimeDelivery{

	public static void main(String[] args){
	
		int orderAmount = Integer.parseInt(args[0]);
		
		boolean primeDeliveryStatus = AmazonPrimeDelivery.orderAmountStatus(orderAmount);
	
	}
	private static boolean orderAmountStatus(int orderAmount){
		
		if(orderAmount >= 499){
			System.out.println("Free Delivery ");
			}else{
				System.out.println("Delivery charges applicable");}
				
			return true;
		
		
		
		}

}