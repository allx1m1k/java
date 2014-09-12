package com.lux.classes.class20.version7_Executor;

import java.util.concurrent.ConcurrentHashMap;

public class Consumer implements Runnable {

	private Buffer buffer;
	private ConcurrentHashMap<String, Integer> dict;
	//private static volatile boolean stopRequested;

	public Consumer(Buffer buffer, ConcurrentHashMap<String, Integer> dict) {
		this.buffer = buffer;
		this.dict = dict;
	}

	@Override
	public void run() {
		while (true) {
			String line;
			try {
				line = buffer.get();
				if (line != null) {
					analyze(line);
				} else {
					//stopRequested =  true;	
					//buffer.put(null);
					break;
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
				break;
			}

		}
	}

	private void analyze(String line) {
		String[] words = line.split("[\\s\\p{Punct}XVI[0-9]]+");
		for (String word : words) {
			add(word);
		}
	}
	
	private void add(String word) {
		Integer count = dict.putIfAbsent(word, 1);
		if (count != null) {
			if (!dict.replace(word, count, count + 1)) {
				synchronized (dict) {
					count = dict.get(word);
					dict.put(word, ++count);
				}
			}
		}
	}

}
