package com.lux.classes;

public class Rectangle1 extends Shape implements Measurable, Comparable {
	//� rectangle1 �������� ��� ����� Shape �.�. ���� ����� ����������� �� Shape
	//
	//������ �������� ������ ���� ������ ������������
	//super - ��������� � ������� ��� ����������� �����-������ 
	//this - ����� ���� ������ ������ ��������, �.�. ���� super ���� this � ������ ������
	//this(w, h) - ����� ������������ ������ ������ , ���������� ������ ���� ���������
	private int width;
	private int height;
	
	//�����������
    public Rectangle1(){
		width = 10;
		height = 11;
	}
	
	//�����������
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
	
    public void draw(){
        System.out.println("I'm Rectangle");
    }

    @Override
    public int getArea() {
        return getHeight() * getWidth();
    }

    @Override
    public int compareTo(Object o) {
        return this.getHeight() - ((Rectangle) o).getHeight();
    }
}
