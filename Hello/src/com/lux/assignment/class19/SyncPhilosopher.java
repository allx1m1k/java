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


    public synchronized void eat(){
        System.out.println("Philosopher N" + this.number + " " + this.name + " is eating!");
        eatCount++;
    }

    @Override
    public void run() {
        //while Thread not interrupted
        while (!interrupted()) {
            synchronized (this.leftFork){
                //this is the place to make a link between this particular Philosopher and evaluated left Fork
                System.out.println("Left Fork" + this.leftFork.getNumber());
                synchronized (this.rightFork) {
                    eat();
                    try {
                        sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

    }
}
