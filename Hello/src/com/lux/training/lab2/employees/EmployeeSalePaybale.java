package com.lux.training.lab2.employees;

import com.lux.training.utils.Date;

/**
 * Created by dima on 07.06.2014.
 */
public class EmployeeSalePaybale extends Person{
    private double ratePerMonth; //месячная ставка зарплаты
    private double ratePerHour; //часовая ставка зарплаты
    private int periodHours; //кол-во часов к оплате
    double sales; //сумма продаж
    private int periodPayment; //кол-во месяцев к оплате
    double commissionRate; //процент комиссии
    double commission; //сумма комиссии
    private double payment; //к оплате


    protected EmployeeSalePaybale(String name, String surName, String position, String department, Date birthday) {
        super(name, surName, position, department, birthday);
        this.sales = 10000.00;
        this.commissionRate = 12.0;
        this.commission = 0;
        this.payment = 0;
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
    public double getSales() {
        return sales;
    }

    @Override
    public double getCommissionRate() {
        return commissionRate;
    }

    @Override
    public void pay() {
        //System.out.println("By sales payable employee");
        //payment = getPeriodPayment() * getRatePerMonth(); //рассчитать базовую ЗП
        commission = sales * commissionRate /100; //рассчитать комиссионные
        payment += commission; //рассчитать ЗП + комиссонные
    }

}
