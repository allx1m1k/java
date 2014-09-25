package com.lux.classes.class4;

public class RectangleDemo {


	public static void changeHeight(Rectangle i) {
		i.setHeight(200);
	}
/**
 * Основная точнка вход	
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Rectangle rect1 = new Rectangle();
		 rect1.setHeight(2);
		 rect1.setWidth(5);
		 
		 Rectangle rect2 = new Rectangle(15,15);
		 
		 System.out.println("Rect1 " + rect1.getArea());
		 //обращение к статическим полям
		 System.out.println(Rectangle.testConstant);
		 
		 //обращение к статическим полям - моветон т.к. обращаемся через имя объекта, а не класса
		 System.out.println(rect1.testConstant);
		 System.out.println(Rectangle.sumArea(rect1, rect2));
		 
		 Rectangle rect3 = new Rectangle();
		 rect2.setHeight(3);
		 rect2.setWidth(9);
		 System.out.println("Rect2 " + rect2.getArea());
		 
		 rect1 = rect2; //потерять один из объектов и обе переменные ссылаются на один и тот же объект
		 rect1.setWidth(100); //присвоить ссылке на первый объект ссылку на второй объект, теперь разные ссылки смотрят на один объект
		 
		 System.out.println(rect1.getArea());
		 System.out.println(rect2.getArea());
	/**
	 * почему оба 300, потому что переменные объектного значения хранять ссылку
	 * ни rect1 ни rect2 не ранит значения полей квадрата, а хранят ссылки на область в памяти
	 *  rect1 = rect2; тут rect1 стал ссылаться на объект rect2 и rect1 уже потерян в программе
	 *  сборщик мусора удалит первый объект из памяти
	 *  
	 */
	
	//передадим ссылку на объект
	changeHeight(rect1);
	System.out.println("Rect1 height " + rect1.getHeight());
	
	rect1.setHeight(35);
	
	}

}
