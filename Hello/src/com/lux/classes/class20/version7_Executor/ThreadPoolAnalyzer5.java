package com.lux.classes.class20.version7_Executor;

import java.io.File;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolAnalyzer5 {
	private static final int POOL_SIZE = 4;

	private static ThreadPoolExecutor executor;
	private static ConcurrentHashMap<String, Integer> tmpdict;
	private static int taskCount;

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		long startTime = System.currentTimeMillis();		

		executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(POOL_SIZE);

		tmpdict = new ConcurrentHashMap<>(); 
		loadText();
		System.out.println("Total tasks: " + taskCount);
		
		executor.shutdown();
		executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);

		Map<String, Integer> dict = new TreeMap<>(tmpdict);

		System.out.println("Result dictionary contains " + dict.size() + " words");
		System.out.println("Total time: " + (System.currentTimeMillis() - startTime) + "ms");

	}

	private static void loadText() {
		for (File file : (new File("/demo/textdata")).listFiles()) {
			executor.execute(new ProducerConsumerTask(tmpdict, file));
			taskCount++;
		}
	}



}
