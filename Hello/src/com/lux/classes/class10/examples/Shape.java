package com.lux.classes.class10.examples;

public abstract class Shape {

	private String color;
	private Point coord;

	public Shape() {
		this.color = "black";
		this.coord = new Point(0,0);
	}

	public Shape(String color, Point point) {
		this.color = color;
		this.coord = point;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Point getPoint() {
		return coord;
	}

	public void setPoint(Point point) {
		this.coord = point;
	}

	public abstract void draw();

}
