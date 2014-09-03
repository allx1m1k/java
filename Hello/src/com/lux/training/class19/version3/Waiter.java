package com.lux.training.class19.version3;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Semaphore;

public class Waiter {
	
	private Semaphore table;
	private List<Philosopher> queue; 
	
	public Waiter(int philosophersCount) {
		table = new Semaphore(philosophersCount/2, true);
	}
	
	public void askEat() {
		try {
			table.acquire();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public synchronized void finishEat(Philosopher philosopher) {
		Fork leftFork = philosopher.getLeftFork();
		Fork rightFork = philosopher.getRightFork();
		leftFork.setAvaliable(true);
		rightFork.setAvaliable(true);
		table.release();
	}

	public synchronized boolean canEat(Philosopher philosopher) {
		Fork leftFork = philosopher.getLeftFork();
		Fork rightFork = philosopher.getRightFork();
		if (leftFork.isAvaliable() & rightFork.isAvaliable()) {
			leftFork.setAvaliable(false);
			rightFork.setAvaliable(false);
			return true;
		}
		table.release();
		return false;
	}

}
