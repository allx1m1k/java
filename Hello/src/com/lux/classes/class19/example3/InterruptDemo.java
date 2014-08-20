package com.lux.classes.class19.example3;

public class InterruptDemo {
 
	public static void main(String[] args) {
		
		Thread task=new PrimeGenerator();
		task.start();
		
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		task.interrupt();
	}

}
