package com.oops.interfaces.concepts03;

public class RuralBanking implements IBankingSystem {

	@Override
	public void pay() {
		System.out.println("================= Rural BANK =================");
		System.out.println();
		System.out.println("Rural Bank Payment");
		
	}

	@Override
	public void settle() {
		System.out.println("Rural Bank Settlement");
		
	}

	@Override
	public void cancelTxn() {
		System.out.println("Rural Bank payment Declined");
		
	}
	
	@Override
	public void printPassBook() {
		System.out.println("Printing Passbook");
	}
	
	
}


