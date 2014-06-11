package com.lux.training.lab2.employees;

/**
 * Created by dima on 07.06.2014.
 */
public interface Paybale {

    public void pay(); //метод расчета ЗП, для каждого отдельного типа реализует свою логику

    //набор методов для печати в ведомости, позволяют формировать различные строки: базовая ЗП, кол-во отработанных месяцев/часов, ставки за месяц/час, и т.д.
    public double getPayment();
    public double getSales();
    public double getRatePerMonth();
    public double getRatePerHour();
    public double getCommissionRate();
    public int getPeriodHours();

}
