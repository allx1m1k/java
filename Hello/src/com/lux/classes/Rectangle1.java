package com.lux.classes;

public class Rectangle1 extends Shape {
	//в rectangle1 появилист все члены Shape
	//
	//пераой строчкой всегда идут вызову конструктора
	//super - обращение к методам или констуктору супер-класса 
	//this - может быть только первой строчкой
	//this(w, h) - вызво конструктора нашего класса , должен ьыть определен
	private int width;
	private int height;
	
	public Rectangle1(){
		width = 1;
		height = 1;
	}
	
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
