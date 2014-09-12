package com.lux.classes.class20.version6_Executor;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;

public class AnalyzeTask2 implements Callable<ConcurrentHashMap<String, Integer>> {

	private ConcurrentHashMap<String, Integer> dict;
	private List<String> text;

	public AnalyzeTask2(List<String> text, ConcurrentHashMap<String, Integer> dict) {
		this.text = text;
		this.dict = dict;
	}

	@Override
	public ConcurrentHashMap<String, Integer> call() throws Exception {
		for (String line : text) {
			analyze(line);
		}
		return dict;
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
