package com.sbi.payment.abstracts;

public abstract class PaymentSystem {

	PaymentSystem(){
		System.out.println("========== SBI ==========");
	}
	
	public abstract void transfer();
	public abstract void recieve();      //methods
	public abstract void cancel();
	
	public static void checkStatus() {
		System.out.println("Checking Status: Verifying Payment Status");
	}
}
