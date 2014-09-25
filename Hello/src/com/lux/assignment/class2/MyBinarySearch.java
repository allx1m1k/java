/**
 * @author allx1m1k
 * 
 *Ќайти индекс введенного пользователем числа в заданном упор€доченном массиве целых чисел, использу€ метод двоичного
 *поиска. ≈сли число не найдено, то вывести индекс позиции в которую этот элемент мог бы быть добавлен с сохранением
 *пор€дка сортировки.
 *	
 */
package com.lux.assignment.class2;

import java.util.Arrays;

public class MyBinarySearch {

	
	/*
	  ак будем решать: будем хранить lowIndex и highIndex
	 Ќа первой итерации lowIndex = 0 и highIndex = values.length
	  
	 * */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] values ={4, 7, 28, 0, 140, -5, 12, 9, 11, 0, -9, 1, 99, 100, 54, 36, 38 };
		
		Arrays.sort(values); //упор€дочим массив
		/* System.out.println(Arrays.binarySearch(values, 9)); //выводим индекс элемента который ищем
		 * 
		 */
		
		int a = 7; //что ищем 
		int lowIndex = 0; //индекс первого элемента
		int highIndex = values.length - 1; //индекс последнего эл-та
		int i = (lowIndex + highIndex) / 2 ; //счетчик
		
		//установим счетчик в исходное положение 		
		if (a < values[i]) { //сравним искомое число с значением элемента в центре массива --> длина деленна€ на два
			highIndex = i; //если искомое число меньше - опустим верхнюю границу
		} 
		else {
			lowIndex = i; //если искомое число больше - подымем нижнюю границу
		}
		
		while (a != values[i]) {
			//	System.arraycopy (values, 2, newArrayOfIntegers, 0, 4); аргументы Object src, srcPos, Object dest, destPos, length		
			//[-5, 4, 7, 9, 11, 12, 28]
			//System.arraycopy (values, lowIndex, values, i, highIndex); //скопируем сам в себ€
			if (a < values[i]) {
				highIndex--;//уменьшим верхнюю границу на 1
			}
			else  { 
				lowIndex++; 
			}
			i = (lowIndex + highIndex) / 2 ; //счетчик;		
		}
		System.out.println(Arrays.toString(values)); //выведем массив
		System.out.println(i);	//выведем результат
	}	
}
