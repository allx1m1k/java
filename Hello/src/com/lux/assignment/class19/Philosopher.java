package com.lux.assignment.class19;

/**
 * Created by dima on 8/21/2014.
 */
public class Philosopher implements Runnable {

    private String name;
    // status = 0 is thinking
    // status = 1 is eating
    private int status;
    //forks for eating
    private Fork[] forks;
    private Fork leftFork;
    private Fork rightFork;

    public Philosopher() {

    }
    /**
     * Номер философа
     * @param aName
     */
    public Philosopher(String aName) {
        this.name = aName;
        this.status = 0;
        System.out.println("Hi! I'm "+name);
        if (status == 0) {
            System.out.println("Currently " + name + " is thinking");
        } else System.out.println("Currently " + name + " is eating");

    }

    /**
     * Method force Philosopher to eat with two Forks
     * @param lFork left Fork
     * @param rFork right Fork
     * @throws InterruptedException
     */
    public void doEat(Fork lFork, Fork rFork) throws InterruptedException {
        this.leftFork = lFork;
        this.rightFork = rFork;
        this.status = 1;
        //set status in usage
        lFork.setStatus(1);
        rFork.setStatus(1);
        //print to console
        System.out.println("Philosopher " + name + " is eating with left fork = " + this.leftFork.getNumber() + " and " + this.rightFork.getNumber());

        //Thread.sleep(500);
    }

    public void doThink() throws InterruptedException {
        System.out.println("F" + name + " is thinking");
    }

    /**
     * Create association between array of Forks and this Philosopher
     * @param aForks
     */
    public void setForks(Fork[] aForks) {
        this.forks = aForks;
    }

    /**
     * Get name of Philosopher
     * @return name
     */
    public String getName(){
        return this.name;
    }


    @Override
    public void run() {
        System.out.println("Thread " + this.getName() + " starting...");
        try {
            //if thinking try doEat
            if (this.status == 0) {
                //fork is on table
                if (forks[0].getStatus() == 0) {
                    System.out.println("Fork N0 is on table");
                    doEat(forks[0],forks[1]);
                } else {
                    System.out.println("Fork N0 is in usage");
                    System.out.println("Philosopher " + name + " is thinking");
                }
            }
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

/*
        for (int  i = 0; i < 5; i++) {
            //check free smallest Fork - left Fork
            if (forks[i].getStatus() == 0) {
                System.out.println("Fork N" + i + " is on table");
                //take left Fork
                forks[i].get();
                this.leftFork = forks[i];
            }
        }
*/

}
