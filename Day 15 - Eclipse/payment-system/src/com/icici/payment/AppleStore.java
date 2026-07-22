package com.icici.payment;

public class AppleStore {

	public static void main(String[] args) {

		double amount = Double.parseDouble(args[0]);
		String recAccNo = args[1];
		String senderAccNo = args[2];
		String mob = args[3];

		doPayment(amount, recAccNo, senderAccNo, mob);

	}

	private static void doPayment(double amount, String recAccNo, String senderAccNo, String mob) {

		System.out.println("====== AppleStore Billing Reciept ======");
		System.out.println("Total Amount Paid " + amount);
		System.out.println("Reciever Account Number: " + recAccNo);
		System.out.println("Sender Account Number: " + senderAccNo);
		System.out.println("Customer Mobile Number: " + mob);

		sendSMS(mob);

	}

	private static void sendSMS(String mob) {

		System.out.println("You have complted your transaction! " + mob);

	}

}
