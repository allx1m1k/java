package com.lux.classes.class19.example1;

import com.lux.classes.class19.example1.Calculator;

public class RunnableDemo {
	
	public static void main(String[] args) {

		for (int i=1; i<=10; i++){			
			Calculator calculator=new Calculator(i);
			Thread thread=new Thread(calculator);
			thread.start();
		}
		System.out.println("Main thread finished");
	}
}
