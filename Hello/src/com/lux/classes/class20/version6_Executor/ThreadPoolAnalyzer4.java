package com.lux.classes.class20.version6_Executor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolAnalyzer4 {
	private static final int BATCH_SIZE = 40000;
	private static final int POOL_SIZE = 4;

	private static ThreadPoolExecutor executor;
	private static ConcurrentHashMap<String, Integer> tmpdict;
	private static int taskCount;

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		long startTime = System.currentTimeMillis();		

		executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(POOL_SIZE);
		//executor = (ThreadPoolExecutor) Executors.newCachedThreadPool();

		tmpdict = new ConcurrentHashMap<>(); 
		loadText();
		System.out.println("Load time: " + (System.currentTimeMillis() - startTime) + "ms");
		System.out.println("Total tasks: " + taskCount);
		
		executor.shutdown();
		executor.awaitTermination(100, TimeUnit.SECONDS);
		
		Map<String, Integer> dict = new TreeMap<>(tmpdict);
		
		System.out.println("Result dictionary contains " + dict.size() + " words");
		System.out.println("Total time: " + (System.currentTimeMillis() - startTime) + "ms");

		
	}

	private static void loadText() {
		List<String> batch = new ArrayList<>();
		for (File file : (new File("D:\\eclipse\\newworkspace\\Hello\\bin\\com\\lux\\classes\\textdata")).listFiles()) {
			try (BufferedReader reader = new BufferedReader(new FileReader(file)) ) {
				String line = reader.readLine();
				while (line != null) {
					batch.add(line);
					if (batch.size() == BATCH_SIZE) {
						executor.submit(new AnalyzeTask2(batch, tmpdict));
						taskCount++;
						/*System.out.println("Active: " + executor.getActiveCount() 
								+ "\t Completed: " + executor.getCompletedTaskCount());*/
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
			executor.submit(new AnalyzeTask2(batch, tmpdict));
			taskCount++;
		}
	}




}
