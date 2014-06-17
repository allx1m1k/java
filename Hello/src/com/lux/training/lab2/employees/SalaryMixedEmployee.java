package com.lux.training.lab2.employees;

/**
 * Created by dima on 16.06.2014.
 */
public class SalaryMixedEmployee extends ComissionEmployee {
    private double baseSalary;

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
}
