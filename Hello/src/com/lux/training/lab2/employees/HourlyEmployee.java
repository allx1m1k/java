package com.lux.training.lab2.employees;

import com.lux.training.utils.Date;

public class HourlyEmployee extends Employee {
	private int workHours;
	private double hourlyRate;

    public HourlyEmployee(String lastname, String firstname, PositionInfo position, Date birthday, int workHours, double hourlyRate) {
        super(lastname, firstname, position, birthday);
        this.workHours = workHours;
        this.hourlyRate = hourlyRate;
    }

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
        super.toString(); //вызываем метод супер-класса для печати общей информации
        System.out.println("Payment type: " + this.getType());
        System.out.println("Working hours: " + this.getWorkHours());
        System.out.println("Hourly rate: " + this.getHourlyRate());
        System.out.println("Payment: " + this.calcPayment());
        return "";
    }



}
