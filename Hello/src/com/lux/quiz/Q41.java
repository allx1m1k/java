package com.lux.quiz;

public class Q41 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = new int[5];
		byte b =4; char c = 'c'; long longVar = 10;
		arr[0] = b; // line 3
		arr[1] = c; //��� �������� ������� ���������� ���� �.�. char ��� ���������� unsigned int
					// int � char ������ ���������� �����
					// int[] � char[] - ������� int � ������� char - ��� ������������ ���� ������
		//arr[3] = longVar; //��� �� �������� ������� ����������� ��������� - � Java ��������� ������� ���������� ����� ������� �������� � ������ �������� 
		System.out.println(arr[0] + arr[1] + arr[2]); // line 7
	}

}


