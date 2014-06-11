package com.lux.training.lab2.employees;

import com.lux.training.utils.Date;

/**
 * Created by dima on 07.06.2014.
 */
public class EmployeeExtPaybale extends Person {
    double ratePerMonth; //месячная ставка зарплаты
    private double ratePerHour; //часовая ставка зарплаты
    private int periodHours; //кол-во часов к оплате
    double sales; //сумма продаж
    double commissionRate; //процент комиссии
    double commission; //сумма комиссии
    double payment; //к оплате
    int periodPayment; //кол-во месяцев к оплате

    protected EmployeeExtPaybale(String name, String surName, String position, String department, Date birthday) {
        super(name, surName, position, department, birthday);
        this.ratePerMonth = 5000.00;
        this.periodPayment = 1;
        this.sales = 20000.00;
        this.commissionRate = 10.0;
        this.commission = 0;
        this.payment = 0;
    }

    public int getPeriodPayment() {
        return periodPayment;
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
    public int getPeriodHours() {
        return periodHours;
    }

    @Override
    public double getRatePerHour() {
        return ratePerHour;
    }

    @Override
    public double getSales() { return sales; }

    @Override
    public double getCommissionRate() {
        return commissionRate;
    }

    @Override
    public void pay() {
        //System.out.println("Extended payable employee");
        payment = getPeriodPayment() * getRatePerMonth(); //рассчитать базовую ЗП
        commission = sales * commissionRate /100; //рассчитать комиссионные
        payment += commission; //рассчитать ЗП + комиссонные
    }

}
