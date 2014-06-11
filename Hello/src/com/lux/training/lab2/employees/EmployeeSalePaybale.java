package com.lux.training.lab2.employees;

import com.lux.training.utils.Date;

/**
 * Created by dima on 07.06.2014.
 */
public class EmployeeSalePaybale extends Person{
    private double ratePerMonth; //месячная ставка зарплаты
    private double ratePerHour; //часовая ставка зарплаты
    private int periodHours; //кол-во часов к оплате
    private double payment; //к оплате


    protected EmployeeSalePaybale(String name, String surName, String position, String department, Date birthday) {
        super(name, surName, position, department, birthday);
    }

    @Override
    public double getPayment() {
        return payment;
    }


    @Override
    public double getRatePerMonth() {
        return ratePerMonth;
    }

    @Override
    public double getRatePerHour() {
        return ratePerHour;
    }

    @Override
    public int getPeriodHours() {
        return periodHours;
    }

    @Override
    public void pay() {
        System.out.println("By sales payable employee");
    }

}
