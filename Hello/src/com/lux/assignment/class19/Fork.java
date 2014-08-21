package com.lux.assignment.class19;

/**
 * Created by dima on 8/21/2014.
 */
public class Fork {
    // status = 0 on table
    // status = 0 in usage
    private int status;
    private int number;

    public Fork(int status) {
        this.status = status;
        if (status == 0) {
            System.out.println("New Fork on table");
        } else System.out.println("New Fork in usage");
    }

    /**
     *
     */
    public synchronized void put() {

    }

    /**
     *
     */
    public synchronized void get() {

    }
}
