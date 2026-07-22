package com.payment.info;

public class Driver {

	public static void main(String[] args) {
		Payment uPay1 = new Payment("IGQRSTT122", 50000, "PAID", "SUCCESS" );
		Payment uPay2 = new Payment("IGQRSTT123", 25000, "UNPAID", "FAILED");
	}
}
