package com.lux.classes;

import java.util.Arrays;

public class StandartFibonachi {
	public static long[] myCache; //��� 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int order = 7; //������� ����� ��������� 
		
		myCache = new long[order + 1]; //�������������� ��� ��� ���������� ����� �. ��������� ���� �������
		//�.�. ������ �������� ���������� � ����
		
		//System.out.println(fibonacci1(order));

		//System.out.println(fibRecursive(order));
		System.out.println(fibRecursiveCache(order));
	}

	
	
	public static int fibRecursive(int order) {
		long startTime = System.nanoTime(); //���������� ������� ����� � ����-���
		if (order == 0) {
			return 0;
		}
		
		if (order == 1) {
			return 1;
		}
		long time1 = System.nanoTime(); 
		
		System.out.println("Recursive  time is" + (time1 - startTime) );
		
		return fibRecursive(order -1 ) +  fibRecursive(order -2);
		
	}
	
	public static int fibonacci1(int n){
		long startTime = System.nanoTime(); //���������� ������� ����� � ����-���
		int next=1, p1=1,p2=1;
		
		if (n<0) {
			 System.out.println("dddd");
			 return -1;
		}
		if(n<3) return 1; 
		for (int i = 1; i<=n-2 ; i++) {
			next=p1+p2;
			p2=p1;
			p1=next;
		}
		long time1 = System.nanoTime(); 
		System.out.println("Iteration time is" + (time1 - startTime) );
		return next;
	}
	
	
	public static long fibRecursiveCache(int order) {
		//System.out.println(Arrays.toString(myCache));
		if (order == 0) {
			return 0;
		}
		if (order == 1) {
			return 1;
		}
		//���� ���� ��� ������� ������� �. ������������ ������� ���� � �������
		//�� �� ������� ��� ������� ������� ����� ���������� ����������
		// ���� �������� ���� ������, �� ���������� ����� �. ���������� �������
		if (myCache[order] == 0) {
			myCache[order] = fibRecursiveCache(order -1 ) +  fibRecursiveCache(order -2);
		}
		//������ ������� ���� 
		return myCache[order];		
		
		//return fibRecursiveCache(order -1 ) +  fibRecursiveCache(order -2);
		
	}
	
}


