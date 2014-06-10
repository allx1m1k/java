package com.lux.training.lab2.employees;

import com.lux.training.utils.Date;


/**
 * Created by dima on 10.06.2014.
 */
public class PaymentCalcDemo {

    public static void main(String[] args) {

        Date date = new Date(1, 6, 1976);

        //orchestra.addInstrument(new Drum("n2","green"));
        Payroll payroll = new Payroll(3); //создадим платежную ведомость

        payroll.addEmployee(new EmployeeMonthlyPaybale("Ivan", "Ivanov", "Engineer", "IT dept", date));
        payroll.addEmployee(new EmployeeExtPaybale("Ivan", "Ivanov", "Engineer", "IT dept", date));
        payroll.addEmployee(new EmployeeHourlyPaybale("Ivan", "Ivanov", "Engineer", "IT dept", date));
        payroll.pay();


    }
}
