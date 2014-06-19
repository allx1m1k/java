package com.lux.training.lab2.employees;

import com.lux.training.utils.Date;

public class SalariedEmployee extends Employee {
	private double salary;
    private int period;

    public SalariedEmployee(String lastname, String firstname, PositionInfo position, Date birthday, double salary) {
        super(lastname, firstname, position, birthday);
        this.salary = salary;
        this.period = 1; //инициализируем атрибут значением месяцев работы по умолчанию
    }

    public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    @Override
	public double calcPayment() {
		// TODO Auto-generated method stub
		return salary * period;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "monthly salary";
	}

    @Override
    public String toString() {
        super.toString(); //вызываем метод супер-класса для печати общей информации
        System.out.println("Payment type: " + this.getType());
        System.out.println("Salary: " + this.getSalary());
        System.out.println("Payment: " + this.calcPayment());
        return "";

    }
}
