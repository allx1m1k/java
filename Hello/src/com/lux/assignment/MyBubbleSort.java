package com.lux.assignment;

import java.util.Arrays;

/**
 * ���������� ������� ��������
 * @author dima
 *
 */
public class MyBubbleSort {

	
	/**
	 * C���������� ����� ����������
	 * ������ �� �������� �� ������
	 * @param massiv
	 * @return
	 */
	public static int[] bubbleSort(int[] massiv){
		//��������� ����������
		int temp = 0;
		//���� �� i-�� �������� ������� � ������� ����� ����������
		for (int index = 0 ; index <= massiv.length - 1; index++) {
			//���� �� i + 1 �������� ������� ������� ����� ���������� � i-�� ���������
			for (int next = index + 1; next <= massiv.length - 2; next++) {
				//���� i-�� ������� ������ ���� ����� � i-�� + 1 (���������) �� ���, �������� �� �������
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
		//int[] values ={0, 8, 4, 1, 2};
		int[] values ={-99, 0, -8, 7, 4, 1, 5, 2, 18, 3, 99};

		System.out.println("Unsorted array is " + Arrays.toString(values));
		System.out.println("Sorted array is " + Arrays.toString(bubbleSort(values)));
		System.out.println("Length (quantity of elements) is " + values.length + " Numbers of index is " + (values.length -1));
	
	
	}

}
