package com.abs_cmbns_inf_Bank_acc_.system;

public class Driver {

	public static void main(String[] args) {
		
		System.out.println("================== STATE BANK OF INDIA ===================");
		System.out.println();
		System.out.println();
		
		System.out.println("----------------Savings Bank Account Info -------------");
		System.out.println();
		Account account;
		IPayment payment;
		
		account = new SavingsAccount();
		payment = new SavingsAccount();
		
		account.accInfo();
		account.deposit();
		account.miniStatement();
		account.withdraw();
		payment.pay();
		payment.transfer();
			if(account instanceof PremiumCustomer) {
				System.out.println("Premium Customer: Savings Account Holder");
			} else {
				System.out.println("You can upgrade to savings bank account, You will get Premium Priviledge ");
			}
			System.out.println();
			System.out.println("----------------Current Bank Account Info -------------");
			System.out.println();
		account = new CurrentAccount();
		payment = new CurrentAccount();
		account.accInfo();
		account.deposit();
		account.miniStatement();
		account.withdraw();
		payment.pay();
		payment.transfer();
			if(account instanceof PremiumCustomer) {
				System.out.println("Premium Customer: Savings Account Holder");
			} else {
				System.out.println("You can upgrade to savings bank account, You will get Premium Priviledge ");
			}
	}
	
	
}
