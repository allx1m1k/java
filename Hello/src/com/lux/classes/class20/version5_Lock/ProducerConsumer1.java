package com.lux.classes.class20.version5_Lock;

import java.io.File;
import java.util.Map;
import java.util.TreeMap;

public class ProducerConsumer1 {
	
	private static Buffer buffer = new BoundedBuffer(1000000);

	public static void main(String[] args) throws InterruptedException {
		
		long startTime = System.currentTimeMillis();		
		
		Producer producer =  new Producer(buffer,  (new File("/demo/textdata")).listFiles());
		Thread thread1 = new Thread(producer);
		thread1.start();
		
		Consumer consumer =  new Consumer(buffer);
		Thread thread2 = new Thread(consumer);
		thread2.start();
		
		thread1.join();
		thread2.join();

		Map<String, Integer> results = new TreeMap<>(consumer.getDict());
		System.out.println("Result dictionary contains " + results.size() + " words");
		System.out.println("Total time: " + (System.currentTimeMillis() - startTime) + "ms");
	}
		
	
}
