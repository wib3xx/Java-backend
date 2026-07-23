package com.oops.interfaces.concepts02;

public class CorpoprateBanking implements IBanking{

	@Override
	public void transfer() {
		System.out.println("Transfer from Corporate Banking");
		
	}

	@Override
	public void recieve() {

		System.out.println("Recieved from Corporate Banking");
	}

	@Override
	public void processing() {
		System.out.println("Processing from Corporate Banking");
		
	}

	@Override
	public void suspend() {
		System.out.println("Suspend from Corporate Banking");
		
	}

	@Override
	public void cancel() {
		System.out.println("Cancelling from Corporate Banking");
		
	}

}
