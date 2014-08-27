package com.lux.assignment.class19;

/**
 * Created by dima on 8/27/2014.
 */
public class SyncPhilosopher implements Runnable {

    private String name;
    private int number;
    private Fork leftFork;
    private Fork rightFork;

    public SyncPhilosopher(String aName, int aNumber, Fork lFork, Fork rFork) {
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

    @Override
    public void run() {

    }
}
