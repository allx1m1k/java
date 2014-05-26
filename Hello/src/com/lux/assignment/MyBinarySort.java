package com.lux.assignment;

import java.util.Arrays;

public class MyBinarySort {


	/**
	 * Метод быстрого поиска
	 * @param massiv
	 * @param middle
	 * 
	 * @return
	 */
	public static int[] fastSearch(int[] massiv) {
		//int lowIndex = 0; //индекс первого элемента
		int p = (0 + massiv.length) / 2; //опорный элемент
		
		
		// будем двигать указатель от начала по одному элементу до опорного элемента пока
		for (int i = 0 ; i <= p; i++) {
			//будем двигать указатель с конца до опорного элемента 
			for (int j = massiv.length - 1; j >= p; j--) {
				//повторяем пока указатели не стали равны друг другу
				if (i == j) {
					return massiv;
				}
				//проверим элементы в левой и правой части массива
				if (massiv[i] >= massiv[j]) {
					//сохраним для обмена значение элеента из первого цикла
					int temp = massiv[i];
					//присвоим i-тому элементу значение элемента j.
					massiv[i] = massiv[j];
					massiv[j] = temp;
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

		//Arrays.toString(values)
		System.out.println(Arrays.toString(fastSearch(values)));
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
