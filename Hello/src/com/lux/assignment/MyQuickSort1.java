package com.lux.assignment;

import java.util.Arrays;

public class MyQuickSort1 {
	/**
	 * Метод быстрого поиска
	 * @param massiv
	 * @param middle
	 * http://www.youtube.com/watch?v=9CBRBSWTl-E
	 * @return
	 */
	public static int[] fastSearch1(int[] massiv, int p, int i, int j) {
		//int lowIndex = 0; //индекс первого элемента
		int temp = 0;
		//int i = 0;
		//int j = massiv.length - 1;

		
		while ((p - i) > 2) {
		do {
//			System.out.println("Index of left side is " + i + " Value from left side is " + massiv[i] + " Is comparing to " + massiv[p]);
			i = i + 1;
		} while (massiv[i] < massiv[p]);
		
		do {
//			System.out.println("Index of right side is " + j + " Value from right side is " + massiv[j] + " Is comparing to " + massiv[p]);
			j = j - 1;
		} while (massiv[p] < massiv[j]);
		
		if (i <= j) {
			temp = massiv[i];
			massiv[i] = massiv[j];
			massiv[j] = temp;
			//i = 0; 
			//j = massiv.length - 1;
		}
		return fastSearch1(massiv, p, i, j);
			//i++; j--;
			//return fastSearch1(massiv, p, i+ 1, j - 1);
	}
		return massiv;
}

		
/*
		// будем двигать указатель от начала по одному элементу до опорного элемента пока
		for (int i = 0 ; i <= p; i++) {
			//если сравниваемый элемент больше опорного - переход на следующую итерацию цикла
			if (massiv[i] > massiv[p]) {
				//сохраним для обмена значение элеента из цикла
				temp = massiv[i];
				break;
			}
			//будем двигать указатель с конца до опорного элемента 
			for (int j = massiv.length - 1 ; j >= p ; j--) {
				//повторяем пока указатели не стали равны друг другу
				if (i == j) {
					return massiv;
				}
				if ((i < p) & (p < j)) {
					//элемент меньше опорного элемента
					if (massiv[j] < massiv[p]) {
						//присвоим i-тому элементу значение элемента j.
						massiv[i] = massiv[j];
						massiv[j] = temp;
						//изменим опорный элемент
						//p = (i + j) / 2;						
						//рекурсивно вызовем метод
						//return fastSearch(massiv, p);
						
					}		
				}
			}
		}
*/
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int[] values ={4, 7, 28, 140, -5, 12, 9, 11, 0, -9, 1, 99, 100, 54, 36, 38 };
		
		//Arrays.sort(values); //упорядочим массив
		int lowIndex = 0; //индекс первого элемента
		int highIndex = values.length - 1; //индекс последнего эл-та
		int p = (lowIndex + highIndex) / 2 ; //опорный элемент
		//

		System.out.println("Unsorted array is " + Arrays.toString(values));
		System.out.println("Sorted array is " + Arrays.toString(fastSearch1(values, p, lowIndex, highIndex)));

	}

}
