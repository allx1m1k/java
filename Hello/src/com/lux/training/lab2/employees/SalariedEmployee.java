package com.lux.training.lab2.employees;

public class SalariedEmployee extends Employee {
	private double salary;

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
