package com.lux.classes.class20.version6_Executor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadPoolAnalyzer {

	private static final int BATCH_SIZE = 20000;
	private static final int POOL_SIZE = 4;

	private static ThreadPoolExecutor executor;
	private static List<Future <Map<String, Integer>>> results;
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {

		long startTime = System.currentTimeMillis();		
		
		executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(POOL_SIZE); 
		//executor = (ThreadPoolExecutor) Executors.newCachedThreadPool();
		results = new ArrayList<>();
		
		//for (File file : (new File("/demo/textdata")).listFiles()) {
        for (File file : (new File("D:\\eclipse\\newworkspace\\Hello\\bin\\com\\lux\\classes\\textdata")).listFiles()) {
			loadFile(file);
		}
		
		Map<String, Integer> dict = new TreeMap<>();
		for (Future <Map<String, Integer>> result : results) {
			dict.putAll(result.get());
		}
		System.out.println("Total tasks: " + results.size());
		
		System.out.println("Result dictionary contains " + dict.size() + " words");
		System.out.println("Total time: " + (System.currentTimeMillis() - startTime) + "ms");
		
		executor.shutdown();
	}
	
	private static void loadFile(File file) {
		try (BufferedReader reader = new BufferedReader(new FileReader(file)) ) {
			List<String> batch = new ArrayList<>();
			String line = reader.readLine();
			while (line != null) {
				batch.add(line);
				if (batch.size() == BATCH_SIZE) {
					Future <Map<String, Integer>> future = executor.submit(new AnalyzeTask(batch));
					System.out.println("Active: " + executor.getActiveCount() 
							+ "\t Completed: " + executor.getCompletedTaskCount());
					results.add(future);
					batch = new ArrayList<>();
				}
				line = reader.readLine();
			}
			
			if (batch.size() > 0) {
				Future <Map<String, Integer>> future = executor.submit(new AnalyzeTask(batch));
				results.add(future);
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
