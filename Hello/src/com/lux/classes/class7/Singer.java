package com.lux.classes.class7;

/**
 * Created by dima on 6/5/2014.
 */
public class Singer extends People {
    public Singer(String firstName, String lastName, boolean sex) {
        super(firstName, lastName, sex);
    }

    @Override
    public void play() {
        System.out.println("I'm singer: la-la-la-la-LALALALA");
    }
}
