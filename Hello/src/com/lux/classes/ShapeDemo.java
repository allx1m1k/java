package com.lux.classes;

public class ShapeDemo {


    public static void main(String[] args) {
		// TODO Auto-generated method stub

	    //�������� ������ Rectangle
        //����� ������ ����������� �� ��������� ��� �����-������ � ��������������� ������� color ��� ������� �������
        Rectangle1 rec1 = new Rectangle1();
	
	//���������� ����� ������ ����� ��������� ����� �� ������ ������ �� ���������,
	//��� ���� ����� �������� ������ �� ������ ������� �������� ����� ������
	//���������� �����-������ ����� ��������� ������ �� ����� �� ����������� ����� � ��������, �� �� �������!

        Shape shape1 = new Rectangle1(); //� ���������� shape1 ��������� ������ �� ������ ���� Rectangle
        //������ ������ shape ������� ����� ��������� ������ � �� ���������, � �� � ���������� Rectangle
        //�.�. shape1.getWidth(); - �� ���������
        //System.out.println(shape1.getWidth()); - ����� Rectangle
        //���� ��������� �� ������ ������� ���������� � Shape
        //��. ������ Class6
        System.out.println(shape1.getColor());

        //������ ���� Rectangle1 �������� ����
        rec1.draw();
        //�������� �������� �� ��������� ��� ��������� Rectangle
        System.out.println(rec1.getColor());

        Shape shape2 = new Line1();
        System.out.println(shape2.getColor());
	}

}
