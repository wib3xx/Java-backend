package com.oops.interfaces.concepts03;

public interface IBankingSystem {

	public void pay();
	public void settle();
	public void cancelTxn();
	
	default void printPassBook() {
		System.out.println("Printing Passbook");
	}
}
