package com.lux.training.lab2.employees;

import com.lux.training.utils.Date;

public class ComissionEmployee extends Employee {
	private double comission;
	private double salesAmount;

    public ComissionEmployee(String lastname, String firstname, PositionInfo position, Date birthday, double comission, double salesAmount) {
        super(lastname, firstname, position, birthday);
        this.comission = comission;
        this.salesAmount = salesAmount;
    }

    public double getComission() {
		return comission;
	}
	public void setComission(double comission) {
		this.comission = comission;
	}
	public double getSalesAmount() {
		return salesAmount;
	}
	public void setSalesAmount(double salesAmount) {
		this.salesAmount = salesAmount;
	}
	@Override
	public double calcPayment() {
		// TODO Auto-generated method stub
		return salesAmount * comission/100; //рассчитаем выплату
	}
	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "comission";
	}
    @Override
    public String toString() {
        System.out.println("Sales amount: " + this.getSalesAmount());
        System.out.println("Commission: " + this.getComission());
        System.out.println("Payment: " + this.calcPayment());
        return "";
    }
}
