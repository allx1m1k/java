package com.lux.assignment;

import java.util.Arrays;

/**
 * ����������� ����� ��������� ������ � ������� ������������ ������
 * @author dima
 *
 */


public class MyBinarySearchRecursive {

/**
 * 	
 * @param values
 * @param lowIndex
 * @param highIndex
 * @param a
 * @return
 */
	public static int recBinSearch(int[] values, int lowIndex, int highIndex, int currentIndex, int a) {
		//�������� array � Strung ��� ����� ���������� �������
		String toPrint = Arrays.toString(values);
				
		//���� ������� �������� ����� �������� � ������� � �������� currentIndex �� ������ ���� ������
		if (currentIndex <=0) {
			return currentIndex;
		}
		//���� ������� �������� ����� ���� ������� � ������� �������� �� ����������� ��������� � ������ ��������
		if (a == values[currentIndex]) 
		{ 
			//System.out.println("Index of value " + a + " in array of " + toPrint + " is " + currentIndex); //������� ������)
			return currentIndex; 
		}
		//���� ������� �������� ������ �������� � ������� � �������� currentIndex �� 
		if (a < values[currentIndex]) {
			highIndex--;//�������� ������� ������� �� 1
		}
		else  { 
			lowIndex++; //����� �������� ������ ������� �� 1
		}			
		currentIndex = (lowIndex + highIndex) / 2 ; //�������		
		//System.out.println("lowIndex is " + lowIndex + " highIndex is " + highIndex + " currentIndex is " + currentIndex);
		
		System.out.println("Index of value " + a + " in array of " + toPrint + " is " + currentIndex); //������� ������)		
		
		return recBinSearch(values, lowIndex, highIndex, currentIndex, a);	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] values ={4, 7, 28, 0, 140, -5}; //������
		int a = 0; //��� ����
		
		int lowIndex = 0; //������ ������� ��������
		int highIndex = values.length - 1; //������ ���������� ��-��
		int i = (lowIndex + highIndex) / 2 ; //�������		
		Arrays.sort(values); //���������� ������
		
		recBinSearch(values, lowIndex, highIndex, i, a);
		
		
	}

}
