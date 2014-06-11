package com.lux.training.lab2.employees;

import com.lux.training.utils.Date;


/**
 * Created by dima on 10.06.2014.
 */
public class PaymentCalcDemo {

    public static void main(String[] args) {

        Date date = new Date(1, 6, 1976);

        //orchestra.addInstrument(new Drum("n2","green"));
        Payroll payroll = new Payroll(4); //создадим платежную ведомость

        payroll.addEmployee(new EmployeeMonthlyPaybale("Ivan", "Ivanov", "Engineer", "IT dept", date));
        payroll.addEmployee(new EmployeeExtPaybale("Pete", "Petrov", "Manager", "IT dept", new Date(date)));
        payroll.addEmployee(new EmployeeHourlyPaybale("Sidor", "Sidorov", "Accountant", "IT dept", new Date (15, 6, 2010 )));
        payroll.addEmployee(new EmployeeSalePaybale("Serge", "Kryloff", "Manager", "Sales dept", new Date (14, 6, 1986 )));
        payroll.pay(); // рассчитаем ЗП

        payroll.getFioAtIndex(0);
        payroll.getRoleAtIndex(0);
        payroll.getPaymentTypeAtIndex(0);
        payroll.getPaymentAtIndex(0);

        System.out.println("");

        payroll.getFioAtIndex(1);
        payroll.getRoleAtIndex(1);
        payroll.getPaymentTypeAtIndex(1);
        payroll.getPaymentAtIndex(1);

        System.out.println("");

        payroll.getFioAtIndex(2);
        payroll.getRoleAtIndex(2);
        payroll.getPaymentTypeAtIndex(2);
        payroll.getPaymentAtIndex(2);

        System.out.println("");

        payroll.getFioAtIndex(3);
        payroll.getRoleAtIndex(3);
        payroll.getPaymentTypeAtIndex(3);
        payroll.getPaymentAtIndex(3);

        //System.out.println(payroll[2"Day of Birth")
    }
}
