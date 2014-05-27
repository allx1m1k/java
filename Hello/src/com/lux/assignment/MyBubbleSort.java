package com.lux.assignment;

import java.util.Arrays;

/**
 * Сортировка методом пузырька
 * @author dima
 *
 */
public class MyBubbleSort {

	
	/**
	 * Cтатический метод сортировки
	 * @param massiv
	 * @return
	 */
	public static int[] bubbleSort(int[] massiv){
		//временная переменная
		int temp = 0;
		//цикл по i-му элементу массива с которым будем сравнивать
		for (int index = 0 ; index <= massiv.length - 1; index++) {
			//цикл по i + 1 элементу массива который будем сравнивать с i-ым элементом
			for (int next = index + 1; next <= massiv.length - 1; next++) {
				//если i-ый элемент больше либо равен с i-ым + 1 (следующим) за ним, поменяем их местами
				if (massiv[index] >= massiv[next]) {
					temp = massiv[next];
					massiv[next] = massiv[index];
					massiv[index] = temp;
				}
			}	
		} 
		return massiv;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] values ={80, 0, -1, -80, -90, 1};
		//int[] values ={-99, 0, -8, 7, 4, 1, 5, 2, 18, 3, 99};

		System.out.println("Unsorted array is " + Arrays.toString(values));
		System.out.println("Sorted array is " + Arrays.toString(bubbleSort(values)));
		System.out.println("Length (quantity of elements) is " + values.length + " Numbers of index is " + (values.length -1));
	
	
	}

}
