package com.lux.classes.class20.version4;

import java.util.LinkedList;
import java.util.Queue;

public class UnboundedBuffer implements Buffer {
	
	private Queue<String> buffer = new LinkedList<>();
	
	
	public Queue<String> getBuffer() {
		return buffer;
	}

	@Override
	public synchronized void put(String line) throws InterruptedException {
		buffer.offer(line);
		this.notifyAll();
	}
	
	@Override
	public synchronized String get() throws InterruptedException {
		while (buffer.isEmpty()) {
			this.wait();
		}
		return buffer.poll();
	}

	@Override
	public int size() {
		return buffer.size();
	}	
}
