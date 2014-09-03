package com.lux.training.class19.version2;

import java.util.concurrent.TimeUnit;

public class PhilosophersTest1 {

	
	private final static String[] PHILOSOPHERS_NAMES = {"KANT", "NIETZSCHE", "SOCRATES", "PLATO", "HEGEL"};
	private final static int PHILOSOPHERS_COUNT = 5;
	
	public static void main(String[] args) throws InterruptedException {

		Fork[] forks = new Fork[PHILOSOPHERS_COUNT];
		for (int i = 0; i < PHILOSOPHERS_COUNT; i++) {
			forks[i] = new Fork(i+1);
		}
		
		Philosopher[] philosophers = new Philosopher[PHILOSOPHERS_COUNT];
		Thread[] threads = new Thread[PHILOSOPHERS_COUNT];
		for (int i = 0; i < PHILOSOPHERS_COUNT; i++) {
			philosophers[i] = new Philosopher(PHILOSOPHERS_NAMES[i], forks[i], (i < PHILOSOPHERS_COUNT - 1) ? forks[i+1] : forks[0]); 
			threads[i] = new Thread(philosophers[i]);
			threads[i].start();
			System.out.println(philosophers[i]);
		}
		
		TimeUnit.SECONDS.sleep(10);
		
		Philosopher.stopRequested = true;
		
		for (Thread thread : threads) {
			thread.join();
		}
		
		System.out.println("----------------------------------------------------------------");
		for (Philosopher philosopher : philosophers) {
			philosopher.printResults();
		}
	}

}
