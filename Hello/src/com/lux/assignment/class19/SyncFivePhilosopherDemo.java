package com.lux.assignment.class19;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/**
 * Created by dima on 27.08.2014.
 * What aHack 11.09.2014
 */
public class SyncFivePhilosopherDemo {

    public static void main(String[] args) throws InterruptedException {
        String[] names;
        Thread[] threads = new Thread[5];
        SyncPhilosopher[] philosophers = new SyncPhilosopher[5];
        SyncFork[] forks = new SyncFork[5];

        //populating arrays of Forks
        for (int i = 0; i< 5; i++) {
            forks[i] = new SyncFork(i);
        }
        names = new String[] {"Dima","Petya", "Sasha", "Kolya", "Kazbek"};
        //populating Array of philosopher
        //populating Array of thread ans starting immediattly
        for (int i = 0; i < 5; i++) {
            philosophers[i] = new SyncPhilosopher(names[i], i, forks[i], (i < 5 - 1) ? forks[i+1] : forks[0]);
            threads[i] = new Thread(philosophers[i]);
            threads[i].start();
        }

        //let philosphers eat and think
        TimeUnit.SECONDS.sleep(10);

        SyncPhilosopher.stopRequested = true;

        for (Thread thread : threads) {
            thread.join();
        }


        System.out.println(philosophers[0].getName() + " has eaten " + philosophers[0].getEatCount() + " times");
        System.out.println(philosophers[1].getName() + " has eaten " + philosophers[1].getEatCount() + " times");
        System.out.println(philosophers[2].getName() + " has eaten " + philosophers[2].getEatCount() + " times");
        System.out.println(philosophers[3].getName() + " has eaten " + philosophers[3].getEatCount() + " times");
        System.out.println(philosophers[4].getName() + " has eaten " + philosophers[4].getEatCount() + " times");

/*
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

        //Thread.currentThread().interrupt();

        p0Thread.interrupt();
        p1Thread.interrupt();
        p2Thread.interrupt();
        p3Thread.interrupt();
        p4Thread.interrupt();



        try {
            Thread.currentThread().sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

*/
/*
        System.out.println(philosopher0.getName() + " has eaten " + philosopher0.getEatCount() + " times");
        System.out.println(philosopher1.getName() + " has eaten " + philosopher1.getEatCount() + " times");
        System.out.println(philosopher2.getName() + " has eaten " + philosopher2.getEatCount() + " times");
        System.out.println(philosopher3.getName() + " has eaten " + philosopher3.getEatCount() + " times");
        System.out.println(philosopher4.getName() + " has eaten " + philosopher4.getEatCount() + " times");
*/
        //System.out.println(Arrays.toString(philosophers));
        //System.out.println(philosophers[0].toString());

    }
}
