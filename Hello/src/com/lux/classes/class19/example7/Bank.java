package com.lux.classes.class19.example7;


public class Bank {
	
	public void doTransfer(Account srcAccount, Account destAccount, double amount) throws InterruptedException {

		System.out.println(" transfering from " + srcAccount.getNumber() + " to " +destAccount.getNumber());
		synchronized (srcAccount) {
			Thread.sleep(100);
			synchronized (destAccount) {
				srcAccount.subtractAmount(amount);
				destAccount.addAmount(amount);
			}
		}
		System.out.println(" transfer  from " + srcAccount.getNumber() + " to " +destAccount + " finished");
	}

}
