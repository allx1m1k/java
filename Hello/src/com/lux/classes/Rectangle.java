package com.lux.classes;

public class Rectangle {

		//���� ������
		private int height;
		private int width;
		//
		public static String testConstant = "My Test Rectangle";
		
		static {
			testConstant = "mmm";
		}
		
		//����������� ��� ����������
		public Rectangle() {
			
		}
		//����������� � �����������
		public Rectangle(int height, int width) {
			this.height = height;
			this.width = width;
		}
	//���������� �����������
		public Rectangle(Rectangle rectangle) {
			this.height = rectangle.height;
			this.width = rectangle.width;
		}
		
		
		//������ ������
		int getArea() {
			return height * width;
		    }

	public int getHeight () {
		return height;
	}
	
	
	public int getWidth () {
		return width;
	}
		

	public void setWidth(int w) {
		this.width = w;
	}
	
	
	public void setHeight(int height) {
		
		// height = height; ���������� ������� ��������� ��� height - ��� ��������� ���������� � ��� �� ������
		this.height = height; //
	}
	
	
	//����������� �����
	
	public static int sumArea(Rectangle r1, Rectangle r2) {
		return r1.getArea() + r2.getArea(); 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
