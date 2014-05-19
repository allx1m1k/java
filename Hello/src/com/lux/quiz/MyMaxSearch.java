package com.lux.quiz;

import java.util.Arrays;
import java.util.Scanner;
import java.math.*;

public class MyMaxSearch {
	
	//создать массив случайных чисел
	//найти максимальный элемент массива
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int inputValue = in.nextInt();
		int [] myArr = new int[inputValue]; //создание
		
		for (int i = 0; i < myArr.length; i++) {
			myArr [i] = (int) (Math.random()*100); //заполняемслучайным
		}
			
		System.out.print(Arrays.toString(myArr)); //выводим изначальной массив
		
		
		int max = myArr[0]; //тут храним первое значение
		
		for (int j = 1; j < myArr.length; j++) {
			if (max <= myArr[j]) {
				max = myArr[j];
			}
				
				
		}
		
		System.out.print(max); //выводим max
		
		/*	System.out.print("The factorial of " + inputValue + " is " + factorial(inputValue));
		else System.out.print("The input value is below zero");*/
	}
	
	public static int factorial(int f){
		
		if(f==0) return 1; 
			if (f>0) return f*factorial(f-1);
			else {System.out.print("Negative argument in factorial function! "); return-1;}
	}

}
