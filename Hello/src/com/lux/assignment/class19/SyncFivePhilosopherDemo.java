package com.lux.assignment.class19;

/**
 * Created by dima on 27.08.2014.
 */
public class SyncFivePhilosopherDemo {

    public static void main(String[] args) {
        System.out.println("Hello My Friend");

        //arrays of Forks
        SyncFork[] forks = new SyncFork[5];
        for (int i = 0; i< 5; i++) {
            forks[i] = new SyncFork(i);
        }

        //create philosopher
        SyncPhilosopher philosopher0 = new SyncPhilosopher("Goraciy", 0, forks[0], forks[4]);
        Thread p0Thread = new Thread(philosopher0, philosopher0.getName());

        //create philosopher
        SyncPhilosopher philosopher1 = new SyncPhilosopher("Newton", 1, forks[0], forks[1]);
        Thread p1Thread = new Thread(philosopher1, philosopher1.getName());

        p0Thread.start();
        p1Thread.start();

        try {
            Thread.currentThread().sleep(5000);
            p0Thread.interrupt();
            p1Thread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
            //Thread.currentThread().interrupt();
        }

        System.out.println(philosopher0.getName() + " has eaten " + philosopher0.getEatCount() + " times");
        System.out.println(philosopher1.getName() + " has eaten " + philosopher1.getEatCount() + " times");
    }
}
