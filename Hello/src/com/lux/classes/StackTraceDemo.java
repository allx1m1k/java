package com.lux.classes;

/**
 * Created by dima on 6/19/2014.
 */
public class StackTraceDemo {

    public static void methodA(){
        methodB();
    }

    private static void methodB() {
        methodC();

    }
    private static int methodC() {
        return 10/0;
    }

    public static void main(String[] args) {
        StackTraceDemo.methodA();
    }
}
