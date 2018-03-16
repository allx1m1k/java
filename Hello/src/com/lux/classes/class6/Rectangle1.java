package com.lux.classes.class6;

public class Rectangle1 extends Shape implements Measurable, Comparable {
	//в rectangle1 появились все члены Shape т.к. этот класс наследуется от Shape
	//к примеру, появился атрибут color
	//первой строчкой всегда идут вызовы конструктора
	//super - обращение к методам или конструктору супер-класса
	//this - может быть только первой строчкой, т.е. либо super либо this в первой строке
	//this(w, h) - вызов констуктора нашего класса, конструктор должен быть определен
	private int width;
	private int height;
	
	//конструктор
    public Rectangle1(){
		width = 10;
		height = 11;
	}
	
	//конструктор
    public Rectangle1(String color, int w, int h){                                        
		super(color);//с помощью ключевого слова super вызываем Конструктор с параметром родительского класса
		//setColor(color) также будет работать
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
        return this.getHeight() - ((Rectangle1) o).getHeight();
    }
}
