package com.lux.assignment.class10;

/**
 * Created by dima on 09.07.2014.
 */
public class BoyNameNotFoundException extends Exception {
    public BoyNameNotFoundException() {
        super("Boy name not found in the list");
    }

    public BoyNameNotFoundException(String arg0) {
        super(arg0);
    }
}
