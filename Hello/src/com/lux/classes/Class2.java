package com.lux.classes;

import java.util.Arrays;

public class Class2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[] arrayOfIntegers; //���������� ���������� ��� �������� ���-��
	
	arrayOfIntegers = new int[7]; //��������, ��������� ������ �������� ��� ��������� ������� �������� ������ ������
	//�������� ������� ������� ����� ������ � ���������� - ������������ �������
	
	arrayOfIntegers[0] = 8; //���������� ����������
	arrayOfIntegers[1] = 11;
	
/*	double[] numbers = new double[5]; //���������� � �������������/��������
	for (int i = 0; i < 5 */
	
	int [] values = {1, 33, -6, 0, 22, 66, 8};
	
	System.arraycopy (values, 2, arrayOfIntegers, 3, 4);
	
	
	System.out.println(Arrays.toString(arrayOfIntegers)); //����������
	
	Arrays.sort(values);
	
	System.out.println(Arrays.toString(values));
	
	
	}
}
