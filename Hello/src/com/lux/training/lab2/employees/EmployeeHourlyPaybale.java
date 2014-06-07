package com.lux.training.lab2.employees;

import com.lux.training.utils.Date;

/**
 * Created by dima on 07.06.2014.
 */
public class EmployeeHourlyPaybale extends Person {

    protected EmployeeHourlyPaybale(String name, String surName, Date birthday) {
        super(name, surName, birthday);
    }

    @Override
    public void pay() {
        System.out.println("Hourly payable employee");
    }
}
