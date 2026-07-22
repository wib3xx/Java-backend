/* Develop an application for placing an e-com order for a given item.
-	User should be able to place and order(Main Task)
-	User should be able to receive an invoice(Sub Task) 
-	User should be getting an order update email(Sub Task)
-	User should be able to pay for an item(Sub Task)
Follow java naming convention */

class AmazonOrder{

	public static void main(String[] args){
	
	String customerName = args[0];
	String orderName = args[1];
	int orderAmount = Integer.parseInt(args[2]);
	
	System.out.println("=======Amazon Order===========");
	System.out.println("Customer Name: "+ customerName);
	System.out.println("Order Name: "+ orderName);
	System.out.println("Order Price:  "+ orderAmount);
	
			placeOrder();
	
	}
	public static boolean placeOrder(){
		 makePayment();
		updateEmail();
		recieveInvoice();
		System.out.println("Order Placed Successfully !");
	return true;
	}
	public static boolean makePayment(){
		System.out.println("Payment Successful");
		return true;
	}
	public static boolean updateEmail(){
		System.out.println("email Updated");
		return true;
		
	}
	public static boolean recieveInvoice(){
		System.out.println("Invoice Generated");
		return true;
	}
}