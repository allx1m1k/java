package com.lux.classes.class4;

public class RectangleDemo {


	public static void changeHeight(Rectangle i) {
		i.setHeight(200);
	}
/**
 * основная точка входа
 * @param args
 */
	public static void main(String[] args) {
		 // TODO Auto-generated method stub
         // переменная rect1 хранит ссылку на объект Rectangle
         Rectangle rect1 = new Rectangle();
		 rect1.setHeight(2);
		 rect1.setWidth(5);

		 //  переменная rect2 хранит ссылку на другой объект Rectangle
		 Rectangle rect2 = new Rectangle(15,15);

		 System.out.println("Площадь Rect1 " + rect1.getArea()); //в консоли 10
		 //обращение к статтческим полям
		 System.out.println(Rectangle.testConstant); //в консоли mmm

		 //обращение к статическим полям через ссылки на объект - моветон,
         //т.к. обращаесмя через имя объекта а не класса
		 System.out.println(rect1.testConstant); //в консоли mmm
		 System.out.println(Rectangle.sumArea(rect1, rect2)); //в консоли 235

		 //создаем новый объект R и помещаем ссылку на него в переменную
         Rectangle rect3 = new Rectangle();

		 //через методы-сеттеры изменяем размеры 2го созданного R
         rect2.setHeight(3);
		 rect2.setWidth(9);
		 System.out.println("Rect2 " + rect2.getArea()); //27

         //потерять один из объектов с площадью 10 - обе переменные ссылаются теперь
         //на один и тот же объект с площадью 27!
         //сборщик мусора удалит из кучи первый созданный объект с площадью 10
         //Другими словами:
         //присвоить ссылке на первый объект ссылку на второй объект,
         //теперь разные ссылки смотрят на один и тот же объект
         //Тут имеет место аналогия: два одинаковых пульта управления от одного ТВ
         rect1 = rect2;

         //мы думаем что меням характеристику первого объекта (h:2, w:5),
         //а на самом деле нет, т.к. переменная rect1 уже содержит ссылку на
         //второй объект R (h:3, w:9)
         rect1.setWidth(100);

		 //в результате, следующими вызовами мы получаем одинаковую площадь
         //т.к. наши разные переменные содержат одну и ту же ссылку
         //на объект с размерами (h:3, w:100)
         System.out.println(rect1.getArea()); //300
		 System.out.println(rect2.getArea()); //300
	/**
	 * почему оба 300, потому что переменные объектного значения хранят ссылку
	 * ни rect1 ни rect2 не хранит значения полей квадрата, а хранят ссылки на область в памяти
	 * rect1 = rect2; тут rect1 стал ссылаться на объект rect2 и объект, на который сслался rect1
     * уже потерян в программе -  сборщик мусора удалит этот созданным первым объект в программе
	 *  
	 */
	
	    //передадим ссылку на объект
        //в результате выполнения этого статического метода новые размеры
        //единственного объекта станут h:200, w: 100
	    changeHeight(rect1);
	    System.out.println("Rect1 height " + rect1.getHeight());

        //убеждаемся в этом:
	    System.out.println("Площади одинаковы, т.к. обе переменные ссылаются на один R"); //
	    System.out.println(rect1.getArea()); //20000
        System.out.println(rect2.getArea()); //20000

	//rect1.setHeight(35);
	
	}

}
