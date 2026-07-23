package com.oops.interfaces.concepts03;

public class HDFCBanking implements IBankingSystem {

	@Override
	public void pay() {
		System.out.println("================= HDFC BANK =================");
		System.out.println();
		System.out.println("HDFC Bank Payment");
		
	}

	@Override
	public void settle() {
		System.out.println("HDFC Bank Settlement");
		
	}

	@Override
	public void cancelTxn() {
		System.out.println("HDFC Bank Payment Declined");
		
	}

}
