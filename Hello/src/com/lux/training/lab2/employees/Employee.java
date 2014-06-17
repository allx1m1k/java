package com.lux.training.lab2.employees;

import com.lux.training.utils.Date;

/**
 *
 */
public abstract class Employee {
	private String lastname;
	private String firstname;
	private PositionInfo position; //пример композиции
    private Date birthday;

    public Employee(String lastname, String firstname, PositionInfo position, Date birthday) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.position = position;
        this.birthday = birthday;
    }

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
	//переопределеяем строковое представдение Сотрудника чтобы выводилось текстовое представление
    //в подклассах будет super.toString + то что наш интересует
    public String toString(){
		System.out.println("First name: " + this.getFirstname());
		System.out.println("Last name: " + this.getLastname());
		return "";
	}
	
	public abstract double calcPayment(); //этот метод абстрактный, т.к. его реализация различна для разных типов
	
	public abstract String getType();

}
