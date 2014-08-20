package com.lux.classes.class19.example4;

import java.util.concurrent.TimeUnit;

public class UnsafeMain {

	public static void main(String[] args) {
			
		for (int i=0; i<3; i++){
			Thread thread=new Thread(new UnsafeTask());
			thread.start();
			try {
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
