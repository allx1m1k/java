package com.lux.classes;

public class Rectangle {

		//Поля класса
		private int height;
		private int width;
		//
		public static String testConstant = "My Test Rectangle";
		
		static {
			testConstant = "mmm";
		}
		
		//конструктор без параметров
		public Rectangle() {
			
		}
		//конструктор с параметрами
		public Rectangle(int height, int width) {
			this.height = height;
			this.width = width;
		}
	//Копирующий конструктор
		public Rectangle(Rectangle rectangle) {
			this.height = rectangle.height;
			this.width = rectangle.width;
		}
		
		
		//Методы класса
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
		
		// height = height; перекрытие области видимости тут height - это локальная переменная с тем же именем
		this.height = height; //
	}
	
	
	//статический метод
	
	public static int sumArea(Rectangle r1, Rectangle r2) {
		return r1.getArea() + r2.getArea(); 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
