package com.lux.classes.class19.example3;

public class PrimeGenerator extends Thread{
 
	@Override
	public void run() {
		long number=1L;
		
		while (true) {
			if (isPrime(number)) {
				System.out.println(number);
			}
			
			if (isInterrupted()) {
				System.out.println("Prime Generator has been interrupted");
				return;
			}
			number++;
		}
	}

	private boolean isPrime(long number) {
		if (number <=2) {
			return true;
		}
		for (long i=2; i<number; i++){
			if ((number % i)==0) {
				return false;
			}
		}
		return true;
	}

}
