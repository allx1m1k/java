package com.lux.classes.class7.orchestr_example;

/**
 * Created with IntelliJ IDEA.
 * User: Dmitriy
 * Date: 05.06.14
 * Time: 18:54
 * To change this template use File | Settings | File Templates.
 */
public class Violine extends MusicalInstrument {

    public Violine(String color) {
        super(color, "Violine");
    }

    @Override
    public void play() {
        System.out.println("I'm violine and I do piiiiiiiiiiiii");
    }
}
