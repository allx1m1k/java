package com.lux.assignment;

import java.util.Arrays;

/**
 * Реализовать метод двоичного поиска с помощью рекурсивного метода
 * @author dima
 *
 */


public class MyBinarySearchRecursive {

/**
 * 	
 * @param values
 * @param lowIndex
 * @param highIndex
 * @param a
 * @return
 */
	public static int recBinSearch(int[] values, int lowIndex, int highIndex, int currentIndex, int a) {
		//приведем array в Strung для вывод эелементов массива
		String toPrint = Arrays.toString(values);
				
		//если искомое значение равно элементу в массиве с индексом currentIndex то вернем этот индекс
		if (currentIndex <=0) {
			return currentIndex;
		}
		//если искомое значение равно тому которое в текущем элементе то распечатаем результат и вернем значение
		if (a == values[currentIndex]) 
		{ 
			//System.out.println("Index of value " + a + " in array of " + toPrint + " is " + currentIndex); //выведем массив)
			return currentIndex; 
		}
		//если искомое значение меньше элемента в массиве с индексом currentIndex то 
		if (a < values[currentIndex]) {
			highIndex--;//уменьшим верхнюю границу на 1
		}
		else  { 
			lowIndex++; //иначе увеличим нижнюю границу на 1
		}			
		currentIndex = (lowIndex + highIndex) / 2 ; //счетчик		
		//System.out.println("lowIndex is " + lowIndex + " highIndex is " + highIndex + " currentIndex is " + currentIndex);
		
		System.out.println("Index of value " + a + " in array of " + toPrint + " is " + currentIndex); //выведем массив)		
		
		return recBinSearch(values, lowIndex, highIndex, currentIndex, a);	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] values ={4, 7, 28, 0, 140, -5}; //массив
		int a = 0; //что ищем
		
		int lowIndex = 0; //индекс первого элемента
		int highIndex = values.length - 1; //индекс последнего эл-та
		int i = (lowIndex + highIndex) / 2 ; //счетчик		
		Arrays.sort(values); //упорядочим массив
		
		recBinSearch(values, lowIndex, highIndex, i, a);
		
		
	}

}
