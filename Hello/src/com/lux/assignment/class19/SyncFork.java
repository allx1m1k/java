package com.lux.assignment.class19;

/**
 * Created by dima on 8/27/2014.
 */
public class SyncFork {
    // status = 0 on table
    // status = 1 in usage
    private int number;

    public SyncFork(int num) {
        this.number = num;
        System.out.println("New Fork N" + number +" on table");
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
