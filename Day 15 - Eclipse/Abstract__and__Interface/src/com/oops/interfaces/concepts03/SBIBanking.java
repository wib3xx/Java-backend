package com.oops.interfaces.concepts03;

public class SBIBanking implements IBankingSystem {

	@Override
	public void pay() {
		System.out.println("================= SBI BANK =================");
		System.out.println();
		System.out.println("SBI Bank Payment");
		
	}

	@Override
	public void settle() {
		System.out.println("SBI Bank Settlement");
		
	}

	@Override
	public void cancelTxn() {
		System.out.println("SBI Bank Payment Declined");
		
	}

}
