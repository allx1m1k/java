package com.lux.training.lab2.employees;

/**
 * Created by dima on 07.06.2014.
 */
public interface Paybale {
    //рабочий метод public void pay(int index)
    //public void payAtIndex(int index);
    public void pay();
    //public double getSalary();

    public double getPayment();

    public double getRatePerMonth();

    public double getRatePerHour();

    public int getPeriodHours();
}
