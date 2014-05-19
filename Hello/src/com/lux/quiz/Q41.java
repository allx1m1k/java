package com.lux.quiz;

public class Q41 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = new int[5];
		byte b =4; char c = 'c'; long longVar = 10;
		arr[0] = b; // line 3
		arr[1] = c; //тут проходит неявное приведение типа т.к. char это фактически unsigned int
					// int и char неявно приводится могут
					// int[] и char[] - массивы int и массивы char - это несовместимы типы данных
		//arr[3] = longVar; //тут не проходит строгая статическая типизация - в Java запрещены неявные приведения типов которые приводят к потери точности 
		System.out.println(arr[0] + arr[1] + arr[2]); // line 7
	}

}


