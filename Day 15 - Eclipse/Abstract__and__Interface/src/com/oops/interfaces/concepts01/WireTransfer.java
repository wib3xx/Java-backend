package com.oops.interfaces.concepts01;

public class WireTransfer implements IPaymentSystem {

	
	private static int calculatTxnFees(int amount) {        //Utility
		int txnFee = amount * 5/100;
		return txnFee;
	}

	@Override
	public void pay() {
		System.out.println("Wire Transfer Pay");
		
	}

	@Override
	public void settle() {
		System.out.println("Wire Transfer Settle");
		
	}
}
