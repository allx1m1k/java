package com.lux.classes.class19;

/**
 * Created by dima on 8/18/2014.
 */
public class CalculatorMultiThread implements  Runnable {
    private int number;

    public CalculatorMultiThread (int num) {
        this.number = num;
    }

    @Override
    public void run() {
        for (int i=1; i<=10; i++) {
            System.out.printf("%s: %d * %d = %d\n", Thread.currentThread().getName(), number, i, i* number);
        }
    }
}
