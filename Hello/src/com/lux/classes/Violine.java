package com.lux.classes;

/**
 * Created by dima on 6/5/2014.
 */
public class Violine extends MusciInstrument{

    public Violine(String name, String color) {
        super(name, color);
    }

    @Override
    public void play() {
        System.out.println("I'm violine and I can play");
    }


}
