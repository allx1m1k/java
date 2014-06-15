package com.lux.training.lab2.employees;

public class HourlyEmployee extends Employee {
	private int workHours;
	private double hourlyRate;
	
	
	
	public int getWorkHours() {
		return workHours;
	}
	public void setWorkHours(int workHours) {
		this.workHours = workHours;
	}
	public double getHourlyRate() {
		return hourlyRate;
	}
	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	@Override
	public double calcPayment() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "hourly rate";
	}
	
	

}
