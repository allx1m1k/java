package com.lux.assignment.class19;

import com.lux.classes.class19.example4.SafeTask;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by dima on 8/21/2014.
 */
public class FivePhilosopherDemo {

    public static void main(String[] args) {
        //создадим массив вилок
        Fork[] forks = new Fork[5];
        for (int i = 0; i< 5; i++) {
            forks[i] = new Fork(i, 0);
        }

        //создадим философа
        Philosopher philosopher1 = new Philosopher("Socrat");
        Thread p1Thread = new Thread(philosopher1, philosopher1.getName());
        philosopher1.setForks(forks);
        p1Thread.start();
        //создадим философа
        Philosopher philosopher2 = new Philosopher("Pluton");
        Thread p2Thread = new Thread(philosopher2, philosopher2.getName());
        philosopher2.setForks(forks);
        p2Thread.start();
/*
        try {

            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
*/
    }
}
/*
        //создадим коллекцию философов
        List<Philosopher> philosophers = new ArrayList<>();
        //поместим философов в список
        philosophers.add(new Philosopher("Platon"));
        philosophers.add(new Philosopher("Aristotel"));
        philosophers.add(new Philosopher("Lukreciy"));
        philosophers.add(new Philosopher("Socrat"));
        philosophers.add(new Philosopher("Zarathrustra"));
        //создадим связанную коллекцию вилок
        List<Fork> forks = new LinkedList<>();
        forks.add(new Fork(0));
        forks.add(new Fork(0));
        forks.add(new Fork(0));
        forks.add(new Fork(0));
        forks.add(new Fork(0));
*/

