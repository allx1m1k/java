/**
 * @author allx1m1k
 * 
 *����� ������ ���������� ������������� ����� � �������� ������������� ������� ����� �����, ��������� ����� ���������
 *������. ���� ����� �� �������, �� ������� ������ ������� � ������� ���� ������� ��� �� ���� �������� � �����������
 *������� ����������.
 *	
 */
package com.lux.assignment.class2;

import java.util.Arrays;

public class MyBinarySearch {

	
	/*
	 ��� ����� ������: ����� ������� lowIndex � highIndex
	 �� ������ �������� lowIndex = 0 � highIndex = values.length
	  
	 * */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] values ={4, 7, 28, 0, 140, -5, 12, 9, 11, 0, -9, 1, 99, 100, 54, 36, 38 };
		
		Arrays.sort(values); //���������� ������
		/* System.out.println(Arrays.binarySearch(values, 9)); //������� ������ �������� ������� ����
		 * 
		 */
		
		int a = 7; //��� ���� 
		int lowIndex = 0; //������ ������� ��������
		int highIndex = values.length - 1; //������ ���������� ��-��
		int i = (lowIndex + highIndex) / 2 ; //�������
		
		//��������� ������� � �������� ��������� 		
		if (a < values[i]) { //������� ������� ����� � ��������� �������� � ������ ������� --> ����� �������� �� ���
			highIndex = i; //���� ������� ����� ������ - ������� ������� �������
		} 
		else {
			lowIndex = i; //���� ������� ����� ������ - ������� ������ �������
		}
		
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
	}	
}
