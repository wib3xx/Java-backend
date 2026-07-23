package com.oops.interfaces.concepts02;

public class PersonalBanking implements IBanking {

	@Override
	public void transfer() {
		System.out.println("Transfer from Personal Banking");
		
	}

	@Override
	public void recieve() {
		System.out.println("Recieve from Personal Banking");
		
	}

	@Override
	public void processing() {
		System.out.println("Processing from Personal Banking");
		
	}

	@Override
	public void suspend() {
		System.out.println("Suspending from Personal Banking");
		
	}

	@Override
	public void cancel() {
		System.out.println("Cancelling from Personal Banking");
		
	}

}
