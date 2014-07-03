package com.lux.classes;

import java.util.Scanner;

public class ThrowDemo {
	
	public static int readInput() throws com.lux.classes.WrongUserInputExeption {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number from 1 to 3:");
		int number = s.nextInt();
		if ((number < 1) || (number > 3)) {
			throw new WrongUserInputExeption();
		}
		return number;	
	}

	public static void main(String[] args)   {
		
		try {
			int i = readInput();		
		} catch (WrongUserInputExeption e) {
			e.printStackTrace();
		}
	}

}

/*	Thread.currentThread().setUncaughtExceptionHandler(
new Thread.UncaughtExceptionHandler() { 

	@Override 
	public void uncaughtException(Thread t, Throwable e) { 
		System.out.println("In this thread "+t.getName()+" an exception was thrown "+e); 
	} 
});	
*/