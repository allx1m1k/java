package com.lux.classes.class19.example6;

public class StopThreadDemo {

	private static boolean stopRequested;
	
	public static void main(String[] args) throws InterruptedException {
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				int i = 0;
				while (!stopRequested) {
					i++;
					//System.out.println("test");
				}
				System.out.println("thread stopped");
				
			}			
		});
		thread.start();
		Thread.sleep(1000);
		stopRequested = true;
	}
	


}

