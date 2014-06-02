package com.lux.classes;

public class Rectangle1 extends Shape {
	//� rectangle1 ��������� ��� ����� Shape
	//
	//������ �������� ������ ���� ������ ������������
	//super - ��������� � ������� ��� ����������� �����-������ 
	//this - ����� ���� ������ ������ ��������
	//this(w, h) - ����� ������������ ������ ������ , ������ ���� ���������
	private int width;
	private int height;
	
	public Rectangle1(){
		width = 1;
		height = 1;
	}
	
	public Rectangle1(String color, int w, int h){
		super(color);//� ������� ��������� ����� super �������� ����������� � ���������� ������������� ������
		//setColor(color) ����� ����� ��������
		this.width = w;
		this.height = h;
	}

	
	
	public int getHeight () {
		return height;
	}
	
	
	public int getWidth () {
		return width;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
