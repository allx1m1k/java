package com.lux.training.lab2.employees;

import com.lux.training.utils.Date;

/**
 * Created by dima on 07.06.2014.
 */
public class EmployeeExtPaybale extends Person {
    double ratePerMonth; //месячная ставка зарплаты
    double sales; //сумма продаж
    double salesRate; //процент комиссии
    double commission; //сумма комиссии
    double payment; //к оплате
    int periodPayment; //кол-во месяцев к оплате

    protected EmployeeExtPaybale(String name, String surName, String position, String department, Date birthday) {
        super(name, surName, position, department, birthday);
    }

    @Override
    public void pay() {
        System.out.println("Extended payable employee");
    }

    @Override
    public double getPayment() {
        return 0;
    }
}
