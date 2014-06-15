package com.lux.training.lab2.employees;

public abstract class Employee {
	private String lastname;
	private String firstname;
	private PositionInfo position;
	
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public PositionInfo getPosition() {
		return position;
	}
	public void setPosition(PositionInfo position) {
		this.position = position;
	}
	public String toString(){
		System.out.println("First name: " + this.getFirstname());
		System.out.println("Last name: " + this.getLastname());
		return "";
	}
	
	public abstract double calcPayment(); //этот метод абстрактный, т.к. его реализация различна для разных типов
	
	public abstract String getType();

}
