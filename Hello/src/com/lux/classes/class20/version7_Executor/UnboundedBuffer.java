package com.lux.classes.class20.version7_Executor;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class UnboundedBuffer implements Buffer {

	private Queue<String> buffer = new LinkedList<>();

	private Lock lock = new ReentrantLock();
	private Condition notEmpty = lock.newCondition();


	public Queue<String> getBuffer() {
		return buffer;
	}

	@Override
	public void put(String line) throws InterruptedException {
		lock.lock();
		try {
			buffer.offer(line);
			notEmpty.signal();
		} finally {
			lock.unlock();
		}
	}

	@Override
	public String get() throws InterruptedException {
		lock.lock();
		try {
			while (buffer.isEmpty()) {
				notEmpty.await();
			}
			return buffer.poll();
		} finally {
			lock.unlock();
		}
	}

	@Override
	public int size() {
		return buffer.size();
	}	
}
