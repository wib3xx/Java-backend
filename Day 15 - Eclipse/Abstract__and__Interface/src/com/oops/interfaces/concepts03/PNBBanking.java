package com.oops.interfaces.concepts03;

public class PNBBanking implements IBankingSystem{

	@Override
	public void pay() {
		System.out.println("================= PNB BANK =================");
		System.out.println();
		System.out.println("PNB Bank Payment");
		
	}

	@Override
	public void settle() {
		System.out.println("PNB Settlement Payment");
		
	}

	@Override
	public void cancelTxn() {
		System.out.println("PNB Bank Payment declined");
		
	}

}
