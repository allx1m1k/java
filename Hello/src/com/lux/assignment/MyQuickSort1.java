package com.lux.assignment;

import java.util.Arrays;

public class MyQuickSort1 {
	/**
	 * ����� �������� ������
	 * http://www.youtube.com/watch?v=9CBRBSWTl-E
	 * @return
	 */
	public static int[] quickSort(int[] massiv, int start, int end) {
		if (start >= end) return massiv; //��������� ���������� ���� ������ � ����� ������� ������ ���� ����� ������� � ������ �������
		int i = start;
		int j = end;

        int middle = (i + j)/2;

        while (i < j) {
            while ((i < middle) && (massiv[i] <= massiv[middle])) i++; //���������� ������� � ������ ���� �� �������� �������� �������� ��������� � ������ �������
            while ((j > middle) && (massiv[j] >= massiv[middle])) j--; //���������� ������� � ������� ���� �� �������� �������� �������� ��������� � ������ �������

            if (i < j) {
                int temp = massiv[i];
                massiv[i] = massiv[j];
                massiv[j] = temp;
                if (i == middle) middle = j;
                else if (j == middle) middle = i;

            }
        }

        quickSort(massiv, start, middle);
        quickSort(massiv, middle + 1, end);

        return massiv;

    }

		


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int[] values ={78, 3, 4, 7, 28, 140, -5, 12, 9, 11, 0, -9, 1, 99, 100, 54, 36, 38 };

		int lowIndex = 0; //������ ������� ��������
		int highIndex = values.length - 1; //������ ���������� ��-��


		System.out.println("Unsorted array is " + Arrays.toString(values));
		System.out.println("Sorted array is " + Arrays.toString(quickSort(values, lowIndex, highIndex)));

	}

}
