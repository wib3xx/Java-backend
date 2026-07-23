package com.oops.interfacee.concepts2;

public abstract class Payment {

	Payment(){
		System.out.println("============= State Bank of India =============");
	}
	//Setting up contract
	public abstract void pay();
	public abstract void suspend();
	public abstract void stopPayment();

	//common functionality
	public void checkStatus() {
		System.out.println("Check Status: Online");
	}
}
