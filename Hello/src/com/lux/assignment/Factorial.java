package com.lux.assignment;

import java.util.Scanner;

public class Factorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int inputValue = in.nextInt();
		System.out.print("The factorial of " + inputValue + " is " + factorial(inputValue));
		
	}
	
	public static int factorial(int f){
		
		if(f==0) return 1; 
			if (f>0) return f*factorial(f-1);
			else {System.out.print("Negative argument in factorial function! "); return-1;}
	}

}