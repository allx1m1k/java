package com.lux.classes;

import java.util.IllegalFormatCodePointException;

/**
 * Created by dima on 7/31/2014.
 */
public class Calculator {
    private Service service; //наш Кальк использует сторонний сервис который инжектится ему через конструктор, см. ниже конструктор Calc

    public Calculator() {
    }

    //инжектим сторонние севис
    public Calculator(Service service) {
        this.service = service;
    }


    public double add(double val1, double val2) {
        return val1 + val2;
    }

    public double divide(double val1, double val2) {
        if (val2 == 0) throw new IllegalArgumentException("Devide by 0");
        return val1/val2;
    }
}
