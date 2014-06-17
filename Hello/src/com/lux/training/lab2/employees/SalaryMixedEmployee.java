package com.lux.training.lab2.employees;

/**
 * Created by dima on 16.06.2014.
 */
public class SalaryMixedEmployee extends ComissionEmployee {
    private double baseSalary;

    @Override
    public String getType() {
        return super.getType() + " " + " and base salary"; //сформируем строку типа оплаты из строки супер-класса с добавлением доп.информации
    }
}
