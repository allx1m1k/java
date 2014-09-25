package com.lux.assignment.class1;

import java.util.Arrays;

public class MyQuickSort {


	/**
	 * Метод быстрого поиска
	 * @param massiv
	 * @param middle
	 * 
	 * @return
	 */
	public static int[] fastSearch(int[] massiv, int p) {
		//int lowIndex = 0; //индекс первого элемента
		
		// будем двигать указатель от начала по одному элементу до опорного элемента пока
		for (int i = 0 ; i <= p; i++) {
			//будем двигать указатель с конца до опорного элемента 
			for (int j = massiv.length - 1 ; j >= p ; j--) {
				//повторяем пока указатели не стали равны друг другу
				if (i == j) {
					return massiv;
				}
				else {
				//проверим элементы в левой и правой части массива				
					if (massiv[i] >= massiv[j]) {
						//сохраним для обмена значение элеента из первого цикла
						int temp = massiv[i];
						//присвоим i-тому элементу значение элемента j.
						massiv[i] = massiv[j];
						massiv[j] = temp;
						//изменим опорный элемент
						p = (i + j) / 2;						
						//рекурсивно вызовем метод
						return fastSearch(massiv, p);
					}
				}
			}
	
		}
		
	return massiv;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int[] values ={4, 7, 28, 140, -5, 12, 9, 11, 0, -9, 1, 99, 100, 54, 36, 38 };
		
		//Arrays.sort(values); //упорядочим массив
		int lowIndex = 0; //индекс первого элемента
		int highIndex = values.length - 1; //индекс последнего эл-та
		int p = (lowIndex + highIndex) / 2 ; //опорный элемент
		//

		System.out.println("Unsorted array is " + Arrays.toString(values));
		System.out.println("Sorted array is " + Arrays.toString(fastSearch(values, p)));

	}

}
