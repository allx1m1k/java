package com.lux.training.lab2.employees;

import com.lux.training.utils.Date;

/**
 * Created by dima on 16.06.2014.
 */
public class SalaryMixedEmployee extends ComissionEmployee {
    private double baseSalary;

    public SalaryMixedEmployee(String lastname, String firstname, PositionInfo position, Date birthday, double comission, double salesAmount, double baseSalary) {
        super(lastname, firstname, position, birthday, comission, salesAmount);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public String getType() {
        return super.getType() + " " + " and base salary"; //сформируем строку типа оплаты из строки супер-класса с добавлением доп.информации
    }

    @Override
    public double calcPayment() {
        return super.calcPayment() + this.getBaseSalary() ;
    }

    @Override
    public String toString() {
        System.out.println("Sales amount: " + this.getSalesAmount());
        System.out.println("Commission: " + this.getCommission());
        System.out.println("Base salary: " + this.getBaseSalary());
        System.out.println("Payment: " + this.calcPayment());
        return "";
        //return super.toString();
    }
}
