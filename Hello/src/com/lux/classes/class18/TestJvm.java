package com.lux.classes.class18;


/**
 * Created by dima on 8/7/2014.
 */

class Super {
    Super() {printThree();}
    void printThree(){
        System.out.println("three");}
}

public class TestJvm extends Super {
    int three = (int) Math.PI;

    void printThree() {
        System.out.println(three);
    }

    public static void main(String[] args) {
        while (true) {
            TestJvm t = new TestJvm();
            t.printThree();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}


        /*
        у класса TestJVM нет конструктора, п.у. будет вызван конструктор по умолчанию будет вызван конст-р супер класса
        в конструторе супер класса запускается метод printtheree

        за счет динамического полиморфизма java в конструкторе супер класса
         Super() {printThree();} - перенаправляет к методу класса Test но там переменная three не инициализирована проэтомку 0
         */


