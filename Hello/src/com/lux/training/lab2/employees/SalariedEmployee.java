package com.lux.training.lab2.employees;

import com.lux.training.utils.Date;

public class SalariedEmployee extends Employee {
	private double salary;

    public SalariedEmployee(String lastname, String firstname, PositionInfo position, Date birthday, double salary) {
        super(lastname, firstname, position, birthday);
        this.salary = salary;
    }

    public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public double calcPayment() {
		// TODO Auto-generated method stub
		return salary;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "monthly salary";
	}
	
	

}
