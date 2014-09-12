package com.lux.classes.class20.version4;

import java.util.HashMap;
import java.util.Map;

public class Consumer implements Runnable {

	private Buffer buffer;
	private Map<String, Integer> dict;
	private static volatile boolean stopRequested;

	public Consumer(Buffer buffer, HashMap<String, Integer> resultMap) {
		this.buffer = buffer;
        this.dict = resultMap;
	}

	@Override
	public void run() {
		while (!stopRequested) {
			String line;
			try {
				line = buffer.get();
				if (line != null) {
					analyze(line);
				} else {
					stopRequested =  true;	
					buffer.put(null);
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
			Integer count = dict.get(word);
			if (count == null) count = 0;
			dict.put(word, ++count);
		}
	}

	public Map<String, Integer> getDict() {
		return dict;
	}

}
