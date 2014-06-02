package com.lux.classes;

public class Shape {

	private String color;
	
	public Shape() {
		
		this.color = "red";
	}
	
	public Shape(String color) {
		
		this.color = color;
	}
	
	public String getColor(){
		return this.color;
	}
	

	public void setColor(String c){
		this.color = c;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
