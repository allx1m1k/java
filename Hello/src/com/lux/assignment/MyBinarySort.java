package com.lux.assignment;

import java.util.Arrays;

public class MyBinarySort {


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int[] values ={4, 7, 28, 0, 140, -5, 12, 9, 11, 0, -9, 1, 99, 100, 54, 36, 38 };
		
		Arrays.sort(values); //упорядочим массив
		/* System.out.println(Arrays.binarySearch(values, 9)); //выводим индекс элемента который ищем
		 * 
		 */
		
		int a = 7; //что ищем 
		int lowIndex = 0; //индекс первого элемента
		int highIndex = values.length - 1; //индекс последнего эл-та
		int i = (lowIndex + highIndex) / 2 ; //счетчик
		
		//установим счетчик в исходное положение 		
		if (a < values[i]) { //сравним искомое число с значением элемента в центре массива --> длина деленная на два
			highIndex = i; //если искомое число меньше - опустим верхнюю границу
		} 
		else {
			lowIndex = i; //если искомое число больше - подымем нижнюю границу
		}
		
		
		
		
		/**
		while (a != values[i]) {
			//	System.arraycopy (values, 2, newArrayOfIntegers, 0, 4); аргументы Object src, srcPos, Object dest, destPos, length		
			//[-5, 4, 7, 9, 11, 12, 28]
			//System.arraycopy (values, lowIndex, values, i, highIndex); //скопируем сам в себя
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
	**/
	}

}
