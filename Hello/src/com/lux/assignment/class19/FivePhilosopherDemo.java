package com.lux.assignment.class19;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by dima on 8/21/2014.
 */
public class FivePhilosopherDemo {

    public static void main(String[] args) {
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
    }
}
