package com.abs_cmbns_inf_Bank_acc_.system;

public class SavingsAccount extends Account implements IPayment , PremiumCustomer{

	@Override
	public void pay() {
		System.out.println("Payment from Savings account");
		
	}

	@Override
	public void transfer() {
		System.out.println("Transfer from Savings account");
		
	}

	@Override
	void withdraw() {
		System.out.println("Withdrawing money from savings account");
		
	}

	@Override
	void miniStatement() {
		System.out.println("Ministatement for savings account");
		
	}

	@Override
	void deposit() {
		System.out.println("Depositing money in savings account");
		
	}

	@Override
	void accInfo() {
		System.out.println("Account info: Savings account");
		
	}

}
