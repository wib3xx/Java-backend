package com.abs_cmbns_inf_Bank_acc_.system;

public class CurrentAccount extends Account implements IPayment{

	@Override
	public void pay() {
		System.out.println("Payment from Current account");
		
	}

	@Override
	public void transfer() {
		System.out.println("Transfer from Current account");
		
	}

	@Override
	void withdraw() {
		System.out.println("Withdrawing money from current account");
		
	}

	@Override
	void miniStatement() {
		System.out.println("Ministatement for current account");
		
	}

	@Override
	void deposit() {
		System.out.println("Depositing money in current account");
		
	}

	@Override
	void accInfo() {
		System.out.println("Account info: Current account");
		
	}

}
