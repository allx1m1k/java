package com.lux.assignment;

import java.util.Arrays;

public class MyBinarySort {


	/**
	 * ����� �������� ������
	 * @param massiv
	 * @param middle
	 * 
	 * @return
	 */
	public static int[] fastSearch(int[] massiv) {
		//int lowIndex = 0; //������ ������� ��������
		int p = (0 + massiv.length) / 2; //������� �������
		
		
		// ����� ������� ��������� �� ������ �� ������ �������� �� �������� �������� ����
		for (int i = 0 ; i <= p; i++) {
			//����� ������� ��������� � ����� �� �������� �������� 
			for (int j = massiv.length - 1; j >= p; j--) {
				//��������� ���� ��������� �� ����� ����� ���� �����
				if (i == j) {
					return massiv;
				}
				//�������� �������� � ����� � ������ ����� �������
				if (massiv[i] >= massiv[j]) {
					//�������� ��� ������ �������� ������� �� ������� �����
					int temp = massiv[i];
					//�������� i-���� �������� �������� �������� j.
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
		
		//Arrays.sort(values); //���������� ������
		int lowIndex = 0; //������ ������� ��������
		int highIndex = values.length - 1; //������ ���������� ��-��
		int p = (lowIndex + highIndex) / 2 ; //������� �������
		//

		//Arrays.toString(values)
		System.out.println(Arrays.toString(fastSearch(values)));
		/**
		while (a != values[i]) {
			//	System.arraycopy (values, 2, newArrayOfIntegers, 0, 4); ��������� Object src, srcPos, Object dest, destPos, length		
			//[-5, 4, 7, 9, 11, 12, 28]
			//System.arraycopy (values, lowIndex, values, i, highIndex); //��������� ��� � ����
			if (a < values[i]) {
				highIndex--;//�������� ������� ������� �� 1
			}
			else  { 
				lowIndex++; 
			}
			i = (lowIndex + highIndex) / 2 ; //�������;		
		}
		System.out.println(Arrays.toString(values)); //������� ������
		System.out.println(i);	//������� ���������
	**/
	}

}
