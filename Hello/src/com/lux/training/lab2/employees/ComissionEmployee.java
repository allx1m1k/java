package com.lux.training.lab2.employees;

import com.lux.training.utils.Date;

public class ComissionEmployee extends Employee {
	private double commission;
	private double salesAmount;

    public ComissionEmployee(String lastname, String firstname, PositionInfo position, Date birthday, double commission, double salesAmount) {
        super(lastname, firstname, position, birthday);
        this.commission = commission;
        this.salesAmount = salesAmount;
    }

    public double getCommission() {
		return commission;
	}
	public void setCommission(double commission) {
		this.commission = commission;
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
		return salesAmount * commission /100; //рассчитаем выплату
	}
	@Override
	public String getType() {
		return "commission";
	}
    @Override
    public String toString() {
        super.toString(); //вызываем метод супер-класса для печати общей информации
        //распечатаем строки только для объектов типа ComissionEmployee
        if (this.getType() == "commission") {
            System.out.println("Payment type: " + this.getType());
            System.out.println("Sales amount: " + this.getSalesAmount());
            System.out.println("Commission: " + this.getCommission());
            System.out.println("Payment: " + this.calcPayment());
        }
        return "";
    }
}
