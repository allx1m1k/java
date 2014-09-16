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
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class ThreadPoolAnalyzer2 {
	private static final int BATCH_SIZE = 40000;
	private static final int POOL_SIZE = 5;

	private static ThreadPoolExecutor executor;
	private static List<Future <Map<String, Integer>>> results;

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		long startTime = System.currentTimeMillis();		

		executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(POOL_SIZE); 
		//executor = (ThreadPoolExecutor) Executors.newCachedThreadPool();
		results = new ArrayList<>();


		loadText();
		System.out.println("Load time: " + (System.currentTimeMillis() - startTime) + "ms");

		Map<String, Integer> dict = new TreeMap<>();
		for (Future <Map<String, Integer>> result : results) {
			dict.putAll(result.get());
			//result.get();
		}
		System.out.println("Total tasks: " + results.size());

		System.out.println("Result dictionary contains " + dict.size() + " words");
		System.out.println("Total time: " + (System.currentTimeMillis() - startTime) + "ms");

		executor.shutdown();
	}

	private static void loadText() {
		List<String> batch = new ArrayList<>();
		//for (File file : (new File("/demo/textdata")).listFiles()) {
        for (File file : (new File("D:\\eclipse\\newworkspace\\Hello\\bin\\com\\lux\\classes\\textdata")).listFiles()) {
			try (BufferedReader reader = new BufferedReader(new FileReader(file)) ) {
				String line = reader.readLine();
				while (line != null) {
					batch.add(line);
					if (batch.size() == BATCH_SIZE) {
						Future <Map<String, Integer>> future = executor.submit(new AnalyzeTask(batch));
						System.out.println("Active: " + executor.getActiveCount() 
								+ "\t Completed: " + executor.getCompletedTaskCount());
						//+ "\t Completed: " + executor.get);
						results.add(future);
						batch = new ArrayList<>();
					}
					line = reader.readLine();
				}

			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}

		if (batch.size() > 0) {
			Future <Map<String, Integer>> future = executor.submit(new AnalyzeTask(batch));
			results.add(future);
		}
	}


}
