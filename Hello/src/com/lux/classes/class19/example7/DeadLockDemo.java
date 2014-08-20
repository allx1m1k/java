package com.lux.classes.class19.example7;

public class DeadLockDemo {

	public static void main(String[] args) {
		Bank bank = new Bank();
		
		Account acc1 =  new Account(100, 1);
		Account acc2 =  new Account(200, 2);
		
		Thread thread1 = new Thread(new TransferThread(bank, acc1, acc2, 30), "First transfer");
		Thread thread2 = new Thread(new TransferThread(bank, acc2, acc1, 50), "Second transfer");
		thread1.start();
		thread2.start();
	}

}
