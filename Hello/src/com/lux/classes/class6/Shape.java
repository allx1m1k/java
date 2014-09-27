package com.lux.classes.class6;

//класс объявлен абстрактным т.к. у него есть метод draw который с помощью динамического полиморфизма перегружен
//т.е. в каждом классе-наследнике от Shape метод draw ведет себе по разному
public abstract class Shape {

	//атрибут фигуры - цвет
    private String color;
	
	//конструктор по умолчанию
    //у каждого экземпляра наследника от класса Shape будет инициализирован атрибут color и его значение будет red
    public Shape() {
		this.color = "red";
	}
    //конструктор
	public Shape(String color) {
		this.color = color;
	}
	
	public String getColor(){
		return this.color;
	}
	

	public void setColor(String c){
		this.color = c;
	}

    //метод будет переодпределен в дочерних классах
    public abstract void draw();
/*
    public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
*/
}
