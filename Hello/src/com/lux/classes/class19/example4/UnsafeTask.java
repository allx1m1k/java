package com.lux.classes.class19.example4;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class UnsafeTask implements Runnable{

	private static Date startDate;
	
	
	@Override
	public void run() {
		
		startDate=new Date();
		System.out.println("Starting thread: " + Thread.currentThread().getId() + "\t Start date: " + startDate);
		
		try {
			TimeUnit.SECONDS.sleep(10);
		} catch (InterruptedException e) {}
		
		System.out.println("Thread finished: " + Thread.currentThread().getId() + "\t Start date: " + startDate);
	}

}
