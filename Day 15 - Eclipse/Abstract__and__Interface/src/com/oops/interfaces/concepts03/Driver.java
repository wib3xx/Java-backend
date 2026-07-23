package com.oops.interfaces.concepts03;

public class Driver {

	public static void main(String[] args) {
		IBankingSystem app;
		app = new HDFCBanking();
		app.pay();
		app.settle();
		app.cancelTxn();
		
		System.out.println();
		
		app = new PNBBanking();
		app.pay();
		app.settle();
		app.cancelTxn();
		
		System.out.println();
		
		app = new SBIBanking();
		app.pay();
		app.settle();
		app.cancelTxn();
		
		System.out.println();
		
		app = new RuralBanking();
		app.pay();
		app.settle();
		app.cancelTxn();
		app.printPassBook();
	}
}
