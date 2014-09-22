package com.lux.classes.class16.junit_examples;

/**
 * Created by Dmitriy on 05.03.14.
 */
public class Calculator {

    private Service service;

    public Calculator(Service service) {
        this.service = service;
    }

    public double add(double value1, double value2) {
        return value1 + value2;
    }

    public double diff(double value1, double value2) {
        service.doSomething();
        service.doSomethingWithArg("test");
        return value1 - value2;
    }

    public double diff2(double value1) {
        double value2 = service.getSomeValue();
        return value1 - value2;
    }

    public double divide(double value1, double value2) {
        throw new UnsupportedOperationException();
    }

    public double multiply(double value1, double value2) {
        service.doSomething();
        return value1 * value2;
    }
}
