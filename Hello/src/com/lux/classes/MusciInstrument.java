package com.lux.classes;

/**
 * Created by dima on 6/5/2014.
 */
public abstract class MusciInstrument implements Playable {
    private String name;
    private String color;

    public MusciInstrument(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

}
