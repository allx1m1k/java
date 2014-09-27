package com.lux.classes.class7.orchestr_example;

/**
 * Created with IntelliJ IDEA.
 * User: Dmitriy
 * Date: 05.06.14
 * Time: 19:18
 * To change this template use File | Settings | File Templates.
 */
public class Singer extends People {

    private String tembr;

    public Singer(String firstName, String lastName, boolean sex, String tembr) {
        super(firstName, lastName, sex);
        this.tembr = tembr;
    }

    @Override
    public void play() {
        System.out.println("Starting laud song");
    }
}
