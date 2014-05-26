package com.lux.classes;

public class Rectangle {

		//ѕол€ класса
		int height;
		int width;
		//ћетоды класса
		int getArea() {
			return height * width;
		    }

	void setHeight(int height) {
		
		// height = height; перекрытие области видимости тут height - это локальна€ переменна€ с тем же именем
		this.height = height; //
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
