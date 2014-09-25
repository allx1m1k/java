package com.lux.assignment.class1;

import java.util.Arrays;

public class MyQuickSort {


	/**
	 * ����� �������� ������
	 * @param massiv
	 * @param middle
	 * 
	 * @return
	 */
	public static int[] fastSearch(int[] massiv, int p) {
		//int lowIndex = 0; //������ ������� ��������
		
		// ����� ������� ��������� �� ������ �� ������ �������� �� �������� �������� ����
		for (int i = 0 ; i <= p; i++) {
			//����� ������� ��������� � ����� �� �������� �������� 
			for (int j = massiv.length - 1 ; j >= p ; j--) {
				//��������� ���� ��������� �� ����� ����� ���� �����
				if (i == j) {
					return massiv;
				}
				else {
				//�������� �������� � ����� � ������ ����� �������				
					if (massiv[i] >= massiv[j]) {
						//�������� ��� ������ �������� ������� �� ������� �����
						int temp = massiv[i];
						//�������� i-���� �������� �������� �������� j.
						massiv[i] = massiv[j];
						massiv[j] = temp;
						//������� ������� �������
						p = (i + j) / 2;						
						//���������� ������� �����
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
		
		//Arrays.sort(values); //���������� ������
		int lowIndex = 0; //������ ������� ��������
		int highIndex = values.length - 1; //������ ���������� ��-��
		int p = (lowIndex + highIndex) / 2 ; //������� �������
		//

		System.out.println("Unsorted array is " + Arrays.toString(values));
		System.out.println("Sorted array is " + Arrays.toString(fastSearch(values, p)));

	}

}
