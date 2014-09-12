package com.lux.classes.class20.version5_Lock;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ProducerConsumer2 {
	
	private static final int CONSUMERS_COUNT = 4;
	private static Buffer buffer =  new UnboundedBuffer(); 
	private static List<Thread> threads = new ArrayList<>();

	public static void main(String[] args) throws InterruptedException {
		
		long startTime = System.currentTimeMillis();
			
		producerRun(new File("/demo/textdata"));

		Consumer[] consumers = consumersRun(CONSUMERS_COUNT);
		
		Map<String, Integer> results = getResults(consumers);
		System.out.println("Producers count: 1");
		System.out.println("Producers count: " + CONSUMERS_COUNT);
		System.out.println("Result dictionary contains " + results.size() + " words");
		System.out.println("Total time: " + (System.currentTimeMillis() - startTime) + "ms");
	}
		
	private static void producerRun(File textdir) {
		Producer producer =  new Producer(buffer, textdir.listFiles());
		Thread thread = new Thread(producer);
		thread.start();
		threads.add(thread);
	}

	private static Consumer[] consumersRun(int count) {
		Consumer[] consumers = new Consumer[count];
		for (int i = 0; i < count; i++) {
			consumers[i] =  new Consumer(buffer);
			Thread thread = new Thread(consumers[i]);
			thread.start();
			threads.add(thread);
		}
		
		return consumers;
	}
	
	private static Map<String, Integer> getResults(Consumer[] consumers) {
		for (Thread thread : threads) {
			try {
				thread.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		Map<String, Integer> results = new TreeMap<>();
		for (Consumer consumer : consumers) {
			results.putAll(consumer.getDict());
		}
		
		return results;
	}

}
