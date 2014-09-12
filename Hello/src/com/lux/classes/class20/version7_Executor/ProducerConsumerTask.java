package com.lux.classes.class20.version7_Executor;

import java.io.File;
import java.util.concurrent.ConcurrentHashMap;

public class ProducerConsumerTask implements Runnable {
	
	private Buffer buffer = new UnboundedBuffer();
	private ConcurrentHashMap<String, Integer> dict;
	private File file;

	public ProducerConsumerTask(ConcurrentHashMap<String, Integer> dict, File file) {
		this.dict = dict;
		this.file = file;
	}

	@Override
	public void run() {
		Producer producer =  new Producer(buffer,  file);
		Thread thread1 = new Thread(producer);
		thread1.start();
		
		Consumer consumer =  new Consumer(buffer, dict);
		Thread thread2 = new Thread(consumer);
		thread2.start();
		
		
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
		
	
}
