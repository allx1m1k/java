package com.lux.classes.class7.orchestr_example;

/**
 * Created with IntelliJ IDEA.
 * User: Dmitriy
 * Date: 05.06.14
 * Time: 18:59
 * To change this template use File | Settings | File Templates.
 */
public class Drum extends MusicalInstrument {

    public Drum(String color) {
        super(color, "Drum");
    }

    @Override
    public void play() {
        System.out.println("I'm drum and I do bam-bam-bam");
    }
}
