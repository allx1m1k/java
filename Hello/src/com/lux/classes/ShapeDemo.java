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
        //�.�. shape1.getWidth(); - �� ���������, �.�. � Shape ��� ������ ������
        //System.out.println(shape1.getWidth()); - ����� Rectangle
        //���� ��������� �� ������ ������� ���������� � Shape
        //��. ������ Class6
        System.out.println(shape1.getColor());

        //������ ���� Rectangle1 �������� ����
        rec1.draw();
        //�������� �������� �� ��������� ��� ��������� Rectangle
        System.out.println(rec1.getColor());
        System.out.println("Area of rec1 is " + rec1.getArea());

        Shape shape2 = new Line1();
        System.out.println("���� �����1 shape111233777 is " + shape2.getColor());

        //������ ���� Line1 �������� ����
        shape2.draw();
        rec1.draw();
	}

}
