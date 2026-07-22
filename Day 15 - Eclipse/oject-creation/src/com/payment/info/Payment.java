package com.payment.info;

public class Payment {

	public static int LiveViewers=0;
	
	private String paymentRefId;
	private int amount;
	private String status;
	private String response;
	{
		LiveViewers++;
	}
	
	public Payment(String _paymentRefId, int _amount, String _status, String _response ) {
		super();
		this.paymentRefId = _paymentRefId;
		this.amount = _amount;
		this.status = _status;
		this.response = _response;
		
		
	}
}
