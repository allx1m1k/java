package com.lux.classes;

/**
 * Created by dima on 8/18/2014.
 */
public class RunnableDemo {

    public static void main(String[] args) {
        for (int i =1; i<=10; i++) {
            CalculatorMultiThread calc = new CalculatorMultiThread(i);
            Thread thread = new Thread(calc);
            thread.start();;
            //thread.join(); - не многопоточная прога. пока не закончится тот поток на которомвызвали метод, не запускается новыц
        }

    }
}
