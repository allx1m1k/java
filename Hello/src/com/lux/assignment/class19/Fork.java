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
     * Release the Fork
     * Put it on table
     */
    public synchronized void put() {
        this.status = 0;
        System.out.println("Release Fork N" + number +" on table");
    }

    /**
     * Get the Fork
     * Fork is in uasge
     */
    public synchronized void get() {
        this.status = 1;
        System.out.println("Taking Fork N" + number +" in usage");
    }

    public synchronized boolean isFree(){
        if (this.status > 0) {
            return false;
        } else return true;
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
