package com.lux.classes.class19.example7;

public class BankSafe {
		
	public void doTransfer(Account srcAccount, Account destAccount, double amount) throws InterruptedException {

		Object lock1;
		Object lock2;
		if (srcAccount.getNumber() < destAccount.getNumber()) {
			lock1 = srcAccount;
			lock2 = destAccount;
		} else {
			lock2 = srcAccount;
			lock1 = destAccount;			
		}
		
		System.out.println(" transfering from " + srcAccount.getNumber() + " to " +destAccount.getNumber());
		synchronized (lock1) {
			Thread.sleep(100);
			synchronized (lock2) {
				srcAccount.subtractAmount(amount);
				destAccount.addAmount(amount);
			}
		}
		System.out.println(" transfer  from " + srcAccount.getNumber() + " to " +destAccount + " finished");
	}
}
