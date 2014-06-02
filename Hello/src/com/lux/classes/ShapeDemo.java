package com.lux.classes;

public class ShapeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Rectangle1 rec1 = new Rectangle1();
	
	//переменной супер класса можно присвоить ссыку на объект любого ее подкласса,
	//при этом будут доступны тольк теиметоды которые доступны супер классу
	//переменной супер-класса можно присвоить ссылку на любой ее нижестоящий класс в иерархии, но не обратно!
	
	Shape shape1 = new Rectangle1(); //ссылка класса shape поэтому можем добраться только к ее атрибутам, а не к атрибутамм Rectangle
	//т.е. shape1.getWidth(); - не сработает
	
	//
	
	}

}
