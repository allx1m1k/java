/**
 * @author allx1m1k
 * 
 *����� � �������/���������� ��������� �� ��������� ������� ����� �����
 *	
 */
package com.lux.assignment;

import java.util.Arrays;




public class DelArrayDoubles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] values = {1, 0, 7, 1, -1, 5, 7, 7}; //�������� ������
		//delDoubles(values); //����� ������������ ������ ��� �������� �������
		System.out.println(Arrays.toString(values));
		//System.out.println(isDouble(values, 0, 1));
		showDoubles(values);
		
	}
	
	//����������� ����� ����������� ������ � ������� � ���������� ����������� ������� 
	public static int[] showDoubles(int[] massiv){
		
		for(int i = 0; i < massiv.length; i++){ //���������� ����� i-�� ������� ������� �� ������� �����
			for (int j = 0; j < massiv.length; j++){
				//if (isDouble(massiv, i, j) == true) 
					System.out.println("�������� ��� ������� ����� " + massiv[i] + " �������� � ������� �������� " + massiv[j] + " " + isDouble(massiv, i, massiv[j], j));
				
			}
		}		
		return massiv;
		
	}
	/**
	 * 	 
	 * @param massiv - ���c�� � ������� ���� �����
	 * @param indexToCheck - ������ ��������� �������� �������� ����� ��������� �� �����
	 * @param element - � ��� ���������
	 * @param elementIndex - ������ ��������� � ������� ���������
	 * @return
	 */
	public static boolean isDouble(int[] massiv, int indexToCheck, int element, int elementIndex) {
			
		if (element != massiv[indexToCheck] & indexToCheck != elementIndex)  
			return false;
		else 
			return true;
			
	}

}
