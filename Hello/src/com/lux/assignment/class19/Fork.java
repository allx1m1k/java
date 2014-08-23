package com.lux.assignment.class19;

/**
 * Created by dima on 8/21/2014.
 */
public class Fork {
    // status = 0 on table
    // status = 1 in usage
    private int status;
    private int number;

    public Fork(int num, int status) {
        this.status = status;
        this.number = num;
        if (status == 0) {
            System.out.println("New Fork N" + number +" on table");
        } else System.out.println("New Fork N" + number +" in usage");
    }

    /**
     *
     */
    public synchronized void put() {
        this.status = 1;
        System.out.println("Fork N" + number +" in usage");
    }

    /**
     *
     */
    public synchronized void get() {
        this.status = 0;
        System.out.println("Fork N" + number +" on table");
    }

    /**
     * Method to get the fork status
     * @return status
     */
    public int getStatus() {
        return this.status;
    }

    /**
     * Method to get number of fork
     * @return number
     */
    public int getNumber() {
        return this.number;
    }

    public void setStatus(int aStatus) {
        this.status = aStatus;
    }
}
