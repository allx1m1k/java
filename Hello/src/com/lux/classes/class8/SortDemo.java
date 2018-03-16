package com.lux.classes.class8;

import java.io.Console;
import java.util.Arrays;

public class SortDemo {

	public static void swap(int[] array, int i, int j) {
		int tmp = array[i];
		array[i] = array[j];
		array[j] = tmp;

	}

	public static void bubleSort(int[] array) {
		for (int j = array.length-1; j>=1; j--) {
			for (int i = 0; i < j; i++) {
				if (array[i] > array[i+1]) swap(array, i, i+1);
			}
		}
	}

	public static void quickSort(int[] array) {
		int start = 0;
		int end = array.length-1;
		doQuickSort(array, start, end);
	}

	public static void doQuickSort(int[] array, int start, int end) {

		int p = array[(start + end)/2];
		int i = start;
		int j = end;

		while (i<j) {
			while (array[i] < p) i++;
			while (array[j] > p) j--;
			if (i<=j) {
			 swap(array, i, j);
				i++;
				j--;
			}
		}

		if (start<j) doQuickSort(array, start, j);
		if (end>i) doQuickSort(array, i, end);
	}


	public static void main(String[] args) {
		Console con = System.console();

		int length = 1000;

		int[] array0 =  new int[length];

		for (int i = 0; i<array0.length; i++) {
			 array0[i] = (int) (Math.random()*1000);
		}

		int[] array = Arrays.copyOf(array0, length);
		long timeStart = System.nanoTime();
		//bubleSort(array);
		long timeEnd = System.nanoTime();


		System.out.printf("Время затраченное методом пузырьковой сортировки: %,d \n", timeEnd-timeStart);

		array = Arrays.copyOf(array0, length);
		timeStart = System.nanoTime();
		quickSort(array);
		timeEnd = System.nanoTime();
        System.out.printf("Время затраченное методом быстрой сортировки: %,d \n", timeEnd-timeStart);

		array = Arrays.copyOf(array0, length);
		timeStart = System.nanoTime();
		Arrays.sort(array);
		timeEnd = System.nanoTime();
        System.out.printf("Время затраченное методом быстрой сортировки (стандартный): %,d \n", timeEnd-timeStart);

        System.out.println(Arrays.toString(array));


		//System.out.println(Arrays.toString(array));   
	}

}
