package com.lux.training.lab2.employees;

public class ComissionEmployee extends Employee {
	private double comission;
	private double salesAmount;
	
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
		return 0;
	}
	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "comission";
	}
	
	
	

}
