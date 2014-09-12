package com.lux.classes.class20.version4;

public class Controller implements Runnable {

	private int counter;
	private Buffer buffer;

	public Controller(int producersCount, Buffer buffer) {
		this.buffer = buffer;
		counter = producersCount;
	}

	@Override
	public void run() {
		synchronized (this) {
			try {
				while(counter > 0) {
					this.wait();
					//System.out.println(counter);
				}				
				buffer.put(null);
			} catch (InterruptedException e) {}
		}
	}

	public synchronized void downCounter() {
		--counter;
		this.notifyAll();
	}

}
