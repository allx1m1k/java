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
		return workHours * hourlyRate;
	}
	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "hourly rate";
	}
    @Override
    public String toString() {
        System.out.println("Working hours: " + this.getWorkHours());
        System.out.println("Hourly rate: " + this.getHourlyRate());
        System.out.println("Payment: " + this.calcPayment());
        return "";
    }



}
