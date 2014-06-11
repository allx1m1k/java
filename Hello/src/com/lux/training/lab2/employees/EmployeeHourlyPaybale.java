package com.lux.training.lab2.employees;

import com.lux.training.utils.Date;

/**
 * Created by dima on 07.06.2014.
 */
public class EmployeeHourlyPaybale extends Person {
    private double ratePerMonth; //месячная ставка зарплаты
    private double ratePerHour; //часовая ставка зарплаты
    private int periodHours; //кол-во часов к оплате
    private double payment; //к оплате

    protected EmployeeHourlyPaybale(String name, String surName, String position, String department, Date birthday) {
        super(name, surName, position, department, birthday);
        this.ratePerHour = 10.0;
        this.periodHours = 120;
        this.payment = 0;
        //this.payment = ratePerHour * periodHours;
    }

    public double getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(double ratePerHour) {
        this.ratePerHour = ratePerHour;
    }

    public void setPeriodHours(int periodHours) {
        this.periodHours = periodHours;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    @Override
    public double getRatePerMonth() {
        return ratePerMonth;
    }

    @Override
    public double getPayment() {
        return payment;
    }

    @Override
    public int getPeriodHours() {
        return periodHours;
    }

    @Override
    public void pay() {

        //System.out.println("Hourly payable employee");
        payment = ratePerHour * periodHours;
    }

}
