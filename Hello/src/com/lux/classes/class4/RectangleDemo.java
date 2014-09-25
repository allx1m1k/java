package com.lux.classes.class4;

public class RectangleDemo {


	public static void changeHeight(Rectangle i) {
		i.setHeight(200);
	}
/**
 * �������� ������ ����	
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Rectangle rect1 = new Rectangle();
		 rect1.setHeight(2);
		 rect1.setWidth(5);
		 
		 Rectangle rect2 = new Rectangle(15,15);
		 
		 System.out.println("Rect1 " + rect1.getArea());
		 //��������� � ����������� �����
		 System.out.println(Rectangle.testConstant);
		 
		 //��������� � ����������� ����� - ������� �.�. ���������� ����� ��� �������, � �� ������
		 System.out.println(rect1.testConstant);
		 System.out.println(Rectangle.sumArea(rect1, rect2));
		 
		 Rectangle rect3 = new Rectangle();
		 rect2.setHeight(3);
		 rect2.setWidth(9);
		 System.out.println("Rect2 " + rect2.getArea());
		 
		 rect1 = rect2; //�������� ���� �� �������� � ��� ���������� ��������� �� ���� � ��� �� ������
		 rect1.setWidth(100); //��������� ������ �� ������ ������ ������ �� ������ ������, ������ ������ ������ ������� �� ���� ������
		 
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
	System.out.println("Rect1 height " + rect1.getHeight());
	
	rect1.setHeight(35);
	
	}

}
