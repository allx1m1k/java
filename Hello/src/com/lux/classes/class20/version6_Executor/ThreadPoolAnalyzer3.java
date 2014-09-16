package com.lux.classes.class20.version6_Executor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadPoolAnalyzer3 {
	private static final int BATCH_SIZE = 40000;
	private static final int POOL_SIZE = 4;

	private static ThreadPoolExecutor executor;
	private static CompletionService<Map<String, Integer>> completition;
	private static int taskCount;

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		long startTime = System.currentTimeMillis();		

		executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(POOL_SIZE);
		completition = new ExecutorCompletionService<>(executor);
		//executor = (ThreadPoolExecutor) Executors.newCachedThreadPool();


		loadText();
		System.out.println("Load time: " + (System.currentTimeMillis() - startTime) + "ms");
		System.out.println("Total tasks: " + taskCount);
		
		Map<String, Integer> dict = new TreeMap<>();
		for (int i = 0; i < taskCount; i++ ) {
			Future<Map<String, Integer>> result = completition.take();
			dict.putAll(result.get());			
		}

		System.out.println("Result dictionary contains " + dict.size() + " words");
		System.out.println("Total time: " + (System.currentTimeMillis() - startTime) + "ms");

		executor.shutdown();
	}

	private static void loadText() {
		List<String> batch = new ArrayList<>();
		for (File file : (new File("D:\\eclipse\\newworkspace\\Hello\\bin\\com\\lux\\classes\\textdata")).listFiles()) {
			try (BufferedReader reader = new BufferedReader(new FileReader(file)) ) {
				String line = reader.readLine();
				while (line != null) {
					batch.add(line);
					if (batch.size() == BATCH_SIZE) {
						completition.submit(new AnalyzeTask(batch));
						taskCount++;
						System.out.println("Active: " + executor.getActiveCount() 
								+ "\t Completed: " + executor.getCompletedTaskCount());
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
			completition.submit(new AnalyzeTask(batch));
			taskCount++;
		}
	}



}
