package com.lux.classes.class19.example4;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class SafeTask implements Runnable {

	private static ThreadLocal<Date> startDate= new ThreadLocal<Date>() {
		protected Date initialValue(){
			return new Date();
		}
	};
	
	@Override
	public void run() {
		
		System.out.println("Starting thread: " + Thread.currentThread().getId() + "\t Start date: " + startDate.get());
		
		try {
			TimeUnit.SECONDS.sleep(10);
		} catch (InterruptedException e) {}
		
		System.out.println("Thread Finished: " + Thread.currentThread().getId() + "\t Start date: " + startDate.get());
	}

}
