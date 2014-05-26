package com.lux.classes;

public class RectangleDemo {


	public static void changeHeight(Rectangle i) {
		i.height = 200;
	}
	/**
 * �������� ������ ����	
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Rectangle rect1 = new Rectangle();
		 rect1.height = 2;
		 rect1.width = 5;
		 
		 System.out.println("Rect1 " + rect1.getArea());
		 
		 
		 Rectangle rect2 = new Rectangle();
		 rect2.height = 3;
		 rect2.width = 6;
		 System.out.println("Rect2 " + rect2.getArea());
		 
		 rect1 = rect2; //�������� ���� �� �������� � ��� ���������� ��������� �� ���� � ��� �� ������
		 rect1.width = 100; //��������� ������ �� ������ ������ ������ �� ������ ������, ������ ������ ������ ������� �� ���� ������
		 
		 System.out.println(rect1.getArea());
		 System.out.println(rect2.getArea());
	/**
	 * ������ ��� 300, ������ ��� ���������� ���������� �������� ������� ������
	 * �� rect1 �� rect2 �� ����� �������� ����� ��������, � ������ ������ �� ������� � ������
	 *  rect1 = rect2; ��� rect1 ���� ��������� �� ������ rect2 � rect1 ��� ������� � ���������
	 *  ������� ������ ������ ������ ������ �� ������
	 *  
	 */
	
	//��������� ������ �� ������
	changeHeight(rect1);
	System.out.println("Rect1 height " + rect1.height);
	
	rect1.setHeight(35);
	
	}

}
