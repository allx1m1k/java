package com.lux.classes.class4;

public class Rectangle {

		//Поля экземпляра
		private int height;
		private int width;
		//Поля класса
		public static String testConstant = "My Test Rectangle";
		//статический блок - выполняется при инициализации класса и при
        //прямом обращении к этому полю
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
		
		
		//Методы экземпляра
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
