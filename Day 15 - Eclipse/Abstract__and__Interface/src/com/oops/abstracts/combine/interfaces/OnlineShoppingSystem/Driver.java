package com.oops.abstracts.combine.interfaces.OnlineShoppingSystem;

public class Driver {

	public static void main(String[] args) {
		System.out.println("======= Amazon India =======");
		IPayment payment;
		Order order;

		System.out.println("------UPI Payment Status-----");
		order = new UPIOrder();
		payment = new UPIOrder();
		payment.pay();
		order.trackOrder();
		order.downloadInvoice();
		order.cancelOrder();
		payment.refund();
		order.returnOrder();
		payment.verifyPayment();
		System.out.println();
		
		System.out.println("------Card Payment Status-----");
		order = new CardOrder();
		payment = new CardOrder();
		payment.pay();
		order.trackOrder();
		order.downloadInvoice();
		order.cancelOrder();
		payment.refund();
		order.returnOrder();
		payment.verifyPayment();
		System.out.println();
		
		System.out.println("------Wallet Payment Status-----");
		order = new WalletOrder();
		payment = new WalletOrder();
		payment.pay();
		order.trackOrder();
		order.downloadInvoice();
		order.cancelOrder();
		payment.refund();
		order.returnOrder();
		payment.verifyPayment();
		System.out.println();
		
		System.out.println("------NetBanking Payment Status-----");
		order = new NetBankingOrder();
		payment = new NetBankingOrder();
		payment.pay();
		order.trackOrder();
		order.downloadInvoice();
		order.cancelOrder();
		payment.refund();
		order.returnOrder();
		payment.verifyPayment();
		System.out.println();
			
		
	}
}















