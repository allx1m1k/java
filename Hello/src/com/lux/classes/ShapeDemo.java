package com.lux.classes;

public class ShapeDemo {


    public static void main(String[] args) {
		// TODO Auto-generated method stub

	    //создадим объект Rectangle
        //ьудет вызван конструктор по умолчанию дл€ супер-класса и инициализирован атрибут color дл€ данного обэъкта
        Rectangle1 rec1 = new Rectangle1();
	
	//переменной супер класса можно присвоить ссыку на объект любого ее подкласса,
	//при этом будут доступны только те методы которые доступны супер классу
	//переменной супер-класса можно присвоить ссылку на любой ее нижесто€щий класс в иерархии, но не обратно!

        Shape shape1 = new Rectangle1(); //в переменной shape1 находитс€ ссылка на объект типа Rectangle
        //ссылка класса shape поэтому можем добратьс€ только к ее атрибутам, а не к атрибутамм Rectangle
        //т.е. shape1.getWidth(); - не сработает
        //System.out.println(shape1.getWidth()); - метод Rectangle
        //зато сработают те методы которые определены в Shape
        //см. лекцию Class6
        System.out.println(shape1.getColor());

        //объект типа Rectangle1 нарисует себа
        rec1.draw();
        //запросим значение по умолчанию дл€ экзепл€ра Rectangle
        System.out.println(rec1.getColor());

        Shape shape2 = new Line1();
        System.out.println(shape2.getColor());
	}

}
