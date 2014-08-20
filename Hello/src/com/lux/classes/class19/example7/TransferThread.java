package com.lux.classes.class19.example7;

public class TransferThread implements Runnable {

	private Bank bank;
	private Account srcAccount;
	private Account destAccount;
	private double amount;

	public TransferThread(Bank bank, Account srcAccount, Account destAccount, double amount) {
		this.bank = bank;
		this.srcAccount = srcAccount;
		this.destAccount = destAccount;
		this.amount = amount;
	}

	@Override
	public void run() {
		try {
			bank.doTransfer(srcAccount, destAccount, amount);
		} catch (InterruptedException e) {}
	}

}