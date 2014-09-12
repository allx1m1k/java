package com.lux.classes.class20.version6_Executor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

public class AnalyzeTask implements Callable<Map<String, Integer>> {

	private Map<String, Integer> dict;
	private List<String> text;
	
	
	public AnalyzeTask(List<String> text) {
		this.text = text;
		this.dict = new HashMap<>();
	}

	@Override
	public Map<String, Integer> call() throws Exception {
		for (String line : text) {
			analyze(line);
		}
		return dict;
	}
	
	private void analyze(String line) {
		String[] words = line.split("[\\s\\p{Punct}XVI[0-9]]+");
		for (String word : words) {
			Integer count = dict.get(word);
			if (count == null) count = 0;
			dict.put(word, ++count);
		}
	}

}
