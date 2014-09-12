package com.lux.classes.class20.version4;

import java.io.File;
import java.util.*;

public class ProducerConsumer3 {
	
	private static final int CONSUMERS_COUNT = 10;
	private static final int PRODUCERS_COUNT = 4;
	private static Buffer buffer = new BoundedBuffer(100000);
	private static List<Thread> threads = new ArrayList<>();
    private static HashMap<String, Integer> resultMap = new HashMap<>();

	public static void main(String[] args) throws InterruptedException {
		
		long startTime = System.currentTimeMillis();
			
		Controller controller = new Controller(PRODUCERS_COUNT, buffer);
		Thread thread = new Thread(controller);
		thread.start();
		
		//File textdir = new File("/demo/textdata");
        //путь к папке с файлами
        File textdir = new File("D:\\eclipse\\newworkspace\\Hello\\bin\\com\\lux\\classes\\textdata");
		producersRun(PRODUCERS_COUNT, textdir.listFiles(), controller);

		Consumer[] consumers = consumersRun(CONSUMERS_COUNT);
		
		waitResults();
		System.out.println("Producers count: " + PRODUCERS_COUNT);
		System.out.println("Consumers count: " + CONSUMERS_COUNT);
		System.out.println("Result dictionary contains " + resultMap.size() + " words");
		System.out.println("Total time: " + (System.currentTimeMillis() - startTime) + "ms");
	}
		
	private static void producersRun(int count, File[] listFiles, Controller controller) {
		Producer[] producers = new Producer[count];
		int step = count==1 ? 0 : listFiles.length/count;
		for (int i = 0; i < count; i++) {
			if (i < count-1) {
				producers[i] =  new Producer(buffer, Arrays.copyOfRange(listFiles, i*step, (i+1)*step), controller);
			} else {
				producers[i] =  new Producer(buffer,Arrays.copyOfRange(listFiles, i*step, listFiles.length), controller);
			}
			
			Thread thread = new Thread(producers[i]);
			thread.start();
			threads.add(thread);
		}		
	}

	private static Consumer[] consumersRun(int count) {
		Consumer[] consumers = new Consumer[count];
		for (int i = 0; i < count; i++) {
			consumers[i] =  new Consumer(buffer, resultMap);
			Thread thread = new Thread(consumers[i]);
			thread.start();
			threads.add(thread);
		}
		
		return consumers;
	}

	private static void waitResults() {
		for (Thread thread : threads) {
			try {
				thread.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
