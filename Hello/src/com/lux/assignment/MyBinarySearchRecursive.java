package com.lux.assignment;

import java.util.Arrays;

/**
 * ����������� ����� ��������� ������ � ������� ������������ ������
 * @author dima
 *
 */


public class MyBinarySearchRecursive {

/**
 * ����������� �����
 * @param values
 * @param lowIndex
 * @param highIndex
 * @param a
 * @return
 */
	public static int recBinSearch(int[] values, int lowIndex, int highIndex, int currentIndex, int a) {
						
		//���� ������� �������� ����� �������� � ������� � �������� currentIndex �� ������ ���� ������
		/*if (currentIndex <=0) {
			return currentIndex;
		}
		*/
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
		//���������� �������� �����
		return recBinSearch(values, lowIndex, highIndex, currentIndex, a);	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] values ={4, 7, 28, 0, 140, -5, 138, -9, 44, 15, -99, 1, 1024}; //������
		//�������� array � Strung ��� ����� ���������� �������
		Arrays.sort(values); //���������� ������
		String toPrint = Arrays.toString(values);
		int a = 140; //��� ����
		int lowIndex = 0; //������ ������� ��������
		int highIndex = values.length - 1; //������ ���������� ��-��
		int i = (lowIndex + highIndex) / 2 ; //�������		
		
		System.out.println("Index of value " + a + " in array of " + toPrint + " is " + recBinSearch(values, lowIndex, highIndex, i, a));
		
		
	}

}
