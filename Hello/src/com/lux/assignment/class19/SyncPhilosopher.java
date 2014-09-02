package com.lux.assignment.class19;

import com.sun.corba.se.impl.orbutil.concurrent.Sync;

import static java.lang.Thread.interrupted;
import static java.lang.Thread.sleep;

/**
 * Created by dima on 8/27/2014.
 */
public class SyncPhilosopher implements Runnable {

    private String name;
    private int number;
    private SyncFork leftFork;
    private SyncFork rightFork;
    private int eatCount;

    public SyncPhilosopher(String aName, int aNumber, SyncFork lFork, SyncFork rFork) {
        this.name = aName;
        this.number = aNumber;
        //it will match Forks with the Philosopher, but don't block (lock) them
        this.leftFork = lFork;
        this.rightFork = rFork;
        System.out.println("Hi! I'm "+name);
    }

    /**
     * Evaluate number of left Fork
     * @return
     */
    public synchronized int checkLeftFork() {
        if (this.number == 0) {
            return 0;
        } else return (this.number - 1);
    }

    /**
     * Evaluate number of right Fork
     * @return
     */
    public synchronized int checkRightFork() {
        if (this.number == 0) {
            return 4;
        } else return this.number;
    }

    private synchronized void think() {
        System.out.println("Philosopher N" + this.number + " " + this.name + " is thinking!");
        try {
            Thread.currentThread().sleep(100);
        } catch (InterruptedException e) {
            //e.printStackTrace();
            //this will safely interrupt the Thread
            //see http://stackoverflow.com/questions/1087475/when-does-javas-thread-sleep-throw-interruptedexception
        }
        //notifyAll();
    }

    public synchronized void eat(){
        System.out.println("Philosopher N" + this.number + " " + this.name + " is eating!");
        try {
            Thread.currentThread().sleep(100);
        } catch (InterruptedException e) {
            //e.printStackTrace();
            //this will safely interrupt the Thread
            //see http://stackoverflow.com/questions/1087475/when-does-javas-thread-sleep-throw-interruptedexception
        }
        notify();
        eatCount++;
    }

    public String getName(){
        return this.name;
    }

    public synchronized int getEatCount() {
        return this.eatCount;
    }

    @Override
    public void run() {
        //while Thread not interrupted
        while (!interrupted()) {
            synchronized (this.leftFork){
                System.out.println("Philosopher " + this.name + " takes left Fork N " + this.leftFork.getNumber());
                //this is the place to make a link between this particular Philosopher and evaluated left Fork
                synchronized (this.rightFork) {
                    System.out.println("Philosopher " + this.name + " takes right Fork N " + this.rightFork.getNumber());
                    eat();
                }
            }
            think();
        Thread.currentThread().interrupt();
        }
    }
}
