package com.lux.classes.class7.orchestr_example;

/**
 * Created with IntelliJ IDEA.
 * User: Dmitriy
 * Date: 05.06.14
 * Time: 19:16
 * To change this template use File | Settings | File Templates.
 */
public class Dancer extends People {

    public Dancer(String firstName, String lastName, boolean sex) {
        super(firstName, lastName, sex);
    }

    @Override
    public void play() {
        System.out.println("Starting cool dance");
    }
}
