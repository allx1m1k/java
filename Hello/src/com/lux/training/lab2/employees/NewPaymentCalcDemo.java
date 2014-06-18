package com.lux.training.lab2.employees;

import com.lux.training.utils.Date;

/**
 * Created by dima on 18.06.2014.
 */
public class NewPaymentCalcDemo {
    public static void main(String[] args) {

        Employee[] payroll;
        double cash;
        payroll = new Employee[]{new ComissionEmployee("Ivanov", "Ivan", new PositionInfo("Engineer", "IT Dept"), new Date(14, 06, 1976), 12, 10000)};

        for (Employee person : payroll){
            person.calcPayment();
            person.toString();
        }


    }
}
