/**
 * @author dpeltik
 * 
 *Найти индекс введенного пользователем числа в заданном упорядоченном массиве целых чисел, используя метод двоичного
 *поиска. Если число не найдено, то вывести индекс позиции в которую этот элемент мог бы быть добавлен с сохранением
 *порядка сортировки.
 *	
 */
package com.lux.assignment;

import java.util.Arrays;

public class MyBinarySearch {

	
	/*
	 Как будем решать: будем хранить lowIndex и highIndex
	 На первой итерации lowIndex = 0 и highIndex = values.length
	  
	 * */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] values ={4, 7, 28, -5, 12, 9, 11,};
		
		Arrays.sort(values); //упорядочим массив
		
		System.out.println(Arrays.toString(values)); //выводим массив
		/* System.out.println(Arrays.binarySearch(values, 9)); //выводим индекс элемента который ищем
		 * 
		 */
		
		int a = 9; //что ищем 
		int lowIndex = 0; //индекс первого элемента
		int highIndex = values.length - 1; //индекс последнего эл-та
		int i = (lowIndex + highIndex) / 2 ; //счетчик
		
				
		while (a != values[i]) {
			if (a <= values[i]) { //сравним искомое число с значением элемента в центре массива --> длина деленная на два
				highIndex = i; //если искомое число меньше - опустим верхнюю границу
				
			} 
			else {
				lowIndex = i; //если искомое число больше - подымем нижнюю границу
			}			//	System.arraycopy (values, 2, newArrayOfIntegers, 0, 4); аргументы Object src, srcPos, Object dest, destPos, length		
			//[-5, 4, 7, 9, 11, 12, 28]
			System.arraycopy (values, lowIndex, values, i, highIndex); //скопируем сам в себя
			System.out.println(Arrays.toString(values)); //выведем результат
			i = (lowIndex + highIndex) / 2 ; //делим пополам 
			}
							
		System.out.println(i);	
	}	
}
