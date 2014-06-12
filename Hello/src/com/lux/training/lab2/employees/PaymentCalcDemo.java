package com.lux.training.lab2.employees;

import com.lux.training.utils.Date;
import com.lux.training.utils.Utils;

import java.util.Arrays;


/**
 * Created by dima on 10.06.2014.
 */
public class PaymentCalcDemo {

    public static void main(String[] args) {

        Date date = new Date(1, 6, 1976);

        //orchestra.addInstrument(new Drum("n2","green"));
        Payroll payroll = new Payroll(4); //создадим платежную ведомость

        payroll.addEmployee(new EmployeeSalePaybale("Serge", "Kryloff", "Manager", "Sales dept", new Date (14, 6, 1986 )));
        payroll.addEmployee(new EmployeeMonthlyPaybale("Ivan", "Ivanov", "Engineer", "IT dept", date));
        payroll.addEmployee(new EmployeeExtPaybale("Pete", "Petrov", "Manager", "IT dept", new Date(date)));
        payroll.addEmployee(new EmployeeHourlyPaybale("Sidor", "Sidorov", "Accountant", "IT dept", new Date (15, 6, 2010 )));

        // рассчитаем ЗП в ведомости
        payroll.pay();

        // отсортируем сотрудников в ведомости
        Utils.sort(payroll.getMembers(), 0, payroll.getPayrollRows()-1);

        // сформируем строки платежной ведомомсти
        for (int i = 0; i < payroll.getPayrollRows(); i++) {
            payroll.getFioAtIndex(i); //ФИО
            payroll.getRoleAtIndex(i); //позиция и департамент
            payroll.getPaymentTypeAtIndex(i); //тип оплаты
            payroll.getPaymentAtIndex(i); //финаносвые подробности выплаты
            System.out.println("");
        }

    }

}
