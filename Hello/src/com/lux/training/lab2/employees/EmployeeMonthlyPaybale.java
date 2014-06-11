package com.lux.training.lab2.employees;

import com.lux.training.utils.Date;

/**
 * Created by dima on 07.06.2014.
 */
public class EmployeeMonthlyPaybale extends Person {
    private double ratePerMonth; //мес€чна€ ставка зарплаты
    private double ratePerHour; //часова€ ставка зарплаты
    private int periodHours; //кол-во часов к оплате
    private int periodPayment; //кол-во мес€цев к оплате
    private double payment; //к оплате

    protected EmployeeMonthlyPaybale(String name, String surName, String position, String department, Date birthday) {
        super(name, surName, position, department, birthday);
        this.ratePerMonth = 3000.00;
        this.periodPayment = 3;
        this.payment = 0;
        //this.payment = ratePerMonth * periodPayment;
    }


    public int getPeriodPayment() {
        return periodPayment;
    }

    public void setRatePerMonth(double ratePerMonth) {
        this.ratePerMonth = ratePerMonth;
    }

    public void setPeriodPayment(int periodPayment) {
        this.periodPayment = periodPayment;
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
        //System.out.println("Monthly payable employee");
        //payment = ratePerMonth * periodPayment == null;
        payment = getPeriodPayment() * getRatePerMonth();//рассчитать «ѕ

    }
}
