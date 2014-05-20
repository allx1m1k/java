/**
 * @author dpeltik
 * 
 *����� ������ ���������� ������������� ����� � �������� ������������� ������� ����� �����, ��������� ����� ���������
 *������. ���� ����� �� �������, �� ������� ������ ������� � ������� ���� ������� ��� �� ���� �������� � �����������
 *������� ����������.
 *	
 */
package com.lux.assignment;

import java.util.Arrays;

public class MyBinarySearch {

	
	/*
	 ��� ����� ������: ����� ������� lowIndex � highIndex
	 �� ������ �������� lowIndex = 0 � highIndex = values.length
	  
	 * */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] values ={4, 7, 28, -5, 12, 9, 11,};
		
		Arrays.sort(values); //���������� ������
		
		System.out.println(Arrays.toString(values)); //������� ������
		/* System.out.println(Arrays.binarySearch(values, 9)); //������� ������ �������� ������� ����
		 * 
		 */
		
		int a = 9; //��� ���� 
		int lowIndex = 0; //������ ������� ��������
		int highIndex = values.length - 1; //������ ���������� ��-��
		int i = (lowIndex + highIndex) / 2 ; //�������
		
				
		while (a != values[i]) {
			if (a <= values[i]) { //������� ������� ����� � ��������� �������� � ������ ������� --> ����� �������� �� ���
				highIndex = i; //���� ������� ����� ������ - ������� ������� �������
				
			} 
			else {
				lowIndex = i; //���� ������� ����� ������ - ������� ������ �������
			}			//	System.arraycopy (values, 2, newArrayOfIntegers, 0, 4); ��������� Object src, srcPos, Object dest, destPos, length		
			//[-5, 4, 7, 9, 11, 12, 28]
			System.arraycopy (values, lowIndex, values, i, highIndex); //��������� ��� � ����
			System.out.println(Arrays.toString(values)); //������� ���������
			i = (lowIndex + highIndex) / 2 ; //����� ������� 
			}
							
		System.out.println(i);	
	}	
}