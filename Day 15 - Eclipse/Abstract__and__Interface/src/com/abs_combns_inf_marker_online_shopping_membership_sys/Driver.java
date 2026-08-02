package com.abs_combns_inf_marker_online_shopping_membership_sys;

public class Driver {

	public static void main(String[] args) {

		System.out.println("=================== Amazon India ===================");
		System.out.println("=================== Order Status ===================");
		System.out.println();

		Shopping shopping;
		IPayment payment;
		System.out.println("------------------- Amazon Prime -------------------");
		shopping = new AmazonPrime();
		payment = new AmazonPrime();
		shopping.placeOrder();
		payment.makePayment();
		if (shopping instanceof PrimeMember) {
			System.out.println("You are Prime customer: Free delivery & Cashback");
		} else {
			System.out.println("Normal customer: No offers");
		}
		shopping.cancelOrder();
		payment.refundPayment();
		System.out.println();

		shopping = new AmazonCard();
		payment = new AmazonCard();
		System.out.println("------------------- Amazon Card -------------------");
		shopping.placeOrder();
		payment.makePayment();
		if (shopping instanceof PrimeMember) {
			System.out.println("You are Prime customer: Free delivery & Cashback");
		} else {
			System.out.println("Normal customer: No offers");
		}
		shopping.cancelOrder();
		payment.refundPayment();
		System.out.println();

		shopping = new AmazonWallet();
		payment = new AmazonWallet();
		System.out.println("------------------- Amazon Wallet -------------------");
		shopping.placeOrder();
		payment.makePayment();
		if (shopping instanceof PrimeMember) {
			System.out.println("You are Prime Member: Free Coupon & Cashback");
		} else {
			System.out.println("Normal customer: No offers");
		}
		shopping.cancelOrder();
		payment.refundPayment();
		System.out.println();

		shopping = new CashOnDelivery();
		payment = new CashOnDelivery();
		System.out.println("------------------- Cash on Delivery -------------------");

		shopping.placeOrder();
		payment.makePayment();
		if (shopping instanceof PrimeMember) {
			System.out.println("You are Prime Member: Free Coupon & Cashback");
		} else {
			System.out.println("Normal customer: No offers");
		}
		shopping.cancelOrder();
		payment.refundPayment();
		System.out.println();

	}
}
