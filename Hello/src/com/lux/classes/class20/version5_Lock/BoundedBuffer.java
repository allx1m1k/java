package com.lux.classes.class20.version5_Lock;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BoundedBuffer implements Buffer {

	private Queue<String> buffer = new LinkedList<>();
	private int capacity;

	private Lock lock = new ReentrantLock();
	private Condition notFull = lock.newCondition();
	private Condition notEmpty = lock.newCondition();

	public BoundedBuffer(int capacity) {
		this.capacity = capacity;
	}

	public Queue<String> getBuffer() {
		return buffer;
	}

	@Override
	public void put(String line) throws InterruptedException {
		lock.lock();
		try {
			while (buffer.size() == capacity) {
				notFull.await();
			}
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
			notFull.signal();
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
