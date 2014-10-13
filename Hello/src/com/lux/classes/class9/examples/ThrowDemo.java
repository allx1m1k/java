package com.lux.classes.class9.examples;

import java.util.Scanner;

/**
 * В данном примере показан пользовательский Exception когда вместо ожидаемых данных,
 * пользователь вводить ошибочные.
 */
public class ThrowDemo {
	
	public static int readInput() throws WrongUserInputExeption {
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