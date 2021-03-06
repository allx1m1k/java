package com.lux.assignment.class19;


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

    public static volatile boolean stopRequested;

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
    public  int checkRightFork() {
        if (this.number == 0) {
            return 4;
        } else return this.number;
    }

    private void think() {
        System.out.println("Philosopher N" + this.number + " " + this.name + " is thinking!");
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
            //this will safely interrupt the Thread
            //see http://stackoverflow.com/questions/1087475/when-does-javas-thread-sleep-throw-interruptedexception
        }
        //notifyAll();
    }

    public void eat(){
        System.out.println("Philosopher N" + this.number + " " + this.name + " is eating!");
        //System.out.println("Philosopher " + name + " started eating after " + waitTime + " ms waiting");
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Philosopher " + name + " has finished eating");
        eatCount++;
    }

    public String getName(){
        return this.name;
    }

    public int getEatCount() {
        return this.eatCount;
    }

    @Override
    public void run() {
        //while Thread not interrupted
        while (!stopRequested) {
            think();
                synchronized (leftFork){
                    //System.out.println("Philosopher " + this.name + " takes left Fork N " + this.leftFork.getNumber());
                    //this is the place to make a link between this particular Philosopher and evaluated left Fork
                    synchronized (rightFork) {
                    eat();
                    //System.out.println("Philosopher " + this.name + " takes right Fork N " + this.rightFork.getNumber());
                }
            }
        }
        System.out.println("Philosopher " + name + " stopped");
    }
}
