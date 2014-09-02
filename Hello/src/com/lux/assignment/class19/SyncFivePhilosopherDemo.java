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

        //create philosopher
        SyncPhilosopher philosopher2 = new SyncPhilosopher("Pluton", 2, forks[1], forks[2]);
        Thread p2Thread = new Thread(philosopher2, philosopher2.getName());

        //create philosopher
        SyncPhilosopher philosopher3 = new SyncPhilosopher("Vezuviy", 3, forks[2], forks[3]);
        Thread p3Thread = new Thread(philosopher3, philosopher3.getName());

        //create philosopher
        SyncPhilosopher philosopher4 = new SyncPhilosopher("Kazbek", 4, forks[3], forks[4]);
        Thread p4Thread = new Thread(philosopher4, philosopher4.getName());


        p0Thread.start();
        p1Thread.start();
        p2Thread.start();
        p3Thread.start();
        p4Thread.start();


        try {
            Thread.currentThread().sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            //Thread.currentThread().interrupt();
        }
        p0Thread.interrupt();
        p1Thread.interrupt();
        p2Thread.interrupt();
        p3Thread.interrupt();
        p4Thread.interrupt();

        System.out.println(philosopher0.getName() + " has eaten " + philosopher0.getEatCount() + " times");
        System.out.println(philosopher1.getName() + " has eaten " + philosopher1.getEatCount() + " times");
        System.out.println(philosopher2.getName() + " has eaten " + philosopher2.getEatCount() + " times");
        System.out.println(philosopher3.getName() + " has eaten " + philosopher3.getEatCount() + " times");
        System.out.println(philosopher4.getName() + " has eaten " + philosopher4.getEatCount() + " times");
    }
}
