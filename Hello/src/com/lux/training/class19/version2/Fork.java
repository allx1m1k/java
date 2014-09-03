package com.lux.training.class19.version2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Fork {
	
	int number;
	private Lock lock = new ReentrantLock();

	public Fork(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}
	
	public void lock() {
		 lock.lock();
	}
	
	public void unlock() {
		lock.unlock();
	}
	
	public boolean tryLock() {
		 return lock.tryLock();
	}
	
	@Override
	public String toString() {
		return Integer.toString(number);
	}


}
