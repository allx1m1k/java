package com.lux.classes.class7;

//import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by dima on 6/5/2014.
 */
public class Drum extends MusciInstrument {

    public Drum(String name, String color) {
        super(name, color);
    }

    @Override
    public void play() {
        System.out.println("I'm drum");

    }
}
