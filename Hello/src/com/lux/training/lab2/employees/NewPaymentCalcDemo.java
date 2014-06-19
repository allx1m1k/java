package com.lux.training.lab2.employees;

import com.lux.training.utils.Date;

/**
 * Created by dima on 18.06.2014.
 */
public class NewPaymentCalcDemo {
    public static void main(String[] args) {

        Employee[] payroll;
        double cash;
        payroll = new Employee[]{
                new ComissionEmployee("Ivanov", "Ivan", new PositionInfo("Engineer", "IT Dept"), new Date(14, 06, 1976), 12, 10000),
                new HourlyEmployee("Petrov", "Petr", new PositionInfo("Tester", "IT Dept"), new Date(18, 06, 1981), 120, 10.00),
                new SalaryMixedEmployee("Sidorov", "Sidor", new PositionInfo("Manager", "Fin Dept"), new Date(18, 12, 1981), 10, 20000, 5000),
                new SalariedEmployee("Rabinovich", "Izya", new PositionInfo("Bookkeeper", "Fin Dept"), new Date(25, 8, 1956), 3000.00)
        };

        for (Employee person : payroll){
            person.calcPayment();
            person.toString();
            System.out.println("");
        }


    }
}
