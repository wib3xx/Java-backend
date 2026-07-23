package com.oops.interfacee.concepts;

public interface IPaymentSystem {
	void pay();
	void settle ();
	
	public default void checkBalance() {
		connectToDB();
		System.out.println("Check Balance");
	}
	
	public static int calculatTxnFees(int amount, int txnPercentage) {
		connectToDB();
		int txnFee = amount * txnPercentage/100;
		return txnFee;
		
	}

	public static int calculatConvFees(int amount, int txnPercentage, String type) {
		connectToDB();
		int txnFee = amount * txnPercentage /100;
		return txnFee;
	}
	
	private static void connectToDB() {
		System.out.println("Database");
	}
}


