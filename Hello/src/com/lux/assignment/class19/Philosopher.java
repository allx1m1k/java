package com.lux.assignment.class19;

/**
 * Created by dima on 8/21/2014.
 */
public class Philosopher  {

    private String name;
    // status = 0 is thinking
    // status = 1 is eating
    private int status;

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
            System.out.println("Currently i'm thinking");
        } else System.out.println("New Fork in usage");

    }

    public void doEat(Fork leftFork, Fork rightFork) throws InterruptedException {
        System.out.println("F" + name + " is eating");
    }

    public void doThink() throws InterruptedException {
        System.out.println("F" + name + " is thinking");
    }

}
