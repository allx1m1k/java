package com.lux.classes.class6;

public class ShapeDemo {


    public static void main(String[] args) {
		// TODO Auto-generated method stub

	    //создадим объект Rectangle
        //Будет вызван конструктор по умолчанию для супер-класса и инициализирован атрибут color для данного обэъкта
        Rectangle1 rec1 = new Rectangle1();
	
	//переменной супер класса можно присвоить ссыку на объект любого ее подкласса,
	//при этом будут доступны только те методы которые доступны супер классу
	//переменной супер-класса можно присвоить ссылку на любой ее нижестоящий класс в иерархии, но не обратно!

        Shape shape1 = new Rectangle1(); //в переменной shape1 находится ссылка на объект типа Rectangle
        //ссылка класса shape поэтому можем добраться только к ее атрибутам, а не к атрибутамм Rectangle
        //т.е. shape1.getWidth(); - не сработает, т.к. в Shape нет такого метода
        //System.out.println(shape1.getWidth()); - метод Rectangle
        //зато сработают те методы которые определены в Shape
        //см. лекцию Class6
        System.out.println(shape1.getColor());

        //объект типа Rectangle1 нарисует себа
        rec1.draw();
        //запросим значение по умолчанию для экзепляра Rectangle
        System.out.println(rec1.getColor());
        System.out.println("Area of rec1 is " + rec1.getArea());

        Shape shape2 = new Line1();
        System.out.println("Цвет линии1 shape111233777 is " + shape2.getColor());

        //объект типа Line1 нарисует себа
        shape2.draw();
        rec1.draw();
        System.out.println("Площадь Rectangle1 rec1 is " + rec1.getArea());

        //Arrays.sort(shapes); //сортировка наших форм, для которых имплементирован интерфейс Comparable
        //метод sort ничего не знает о типах в shapes но за счет динамического полиморфзма (в конкретном типе должен быть реализован метод sort,
        // иначе получим ClassCastExc) и приведения объектов к интерфейсу Comparable мы можем сортировать любые объекты: Rectangle1, Line1, ...
	}

}
