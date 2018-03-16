package com.lux.classes.class2;

import java.util.Arrays;

public class Class2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrayOfIntegers; //объявление переменной без указания количества

		arrayOfIntegers = new int[7]; //создание, выделение памяти создание все эелементы нулевые изменить размер нельзя
		//изменять размеры массива можно только в коллекциях - динамические массывы

		int[] newArrayOfIntegers = new int[7];

		arrayOfIntegers[0] = 8; //заполнение занчениями
		arrayOfIntegers[1] = 11;

	/*	double[] numbers = new double[5]; // объявление и инициализация/создание
		for (int i = 0; i < 5 */

		int [] values = {1, 33, -6, 0, 22, 66, 8};

		System.arraycopy (values, 2, arrayOfIntegers, 3, 4); //копируем 4 элемента массива values в массив arrayOfIntegers
		System.arraycopy (values, 2, newArrayOfIntegers, 0, 4); //аргументы Object src, srcPos, Object dest, destPos, length

		System.out.println(Arrays.toString(arrayOfIntegers)); //
		System.out.println("newArrayOfIntegers " + Arrays.toString(newArrayOfIntegers)); //

		Arrays.sort(values);

		System.out.println(Arrays.toString(values));


	}
}
