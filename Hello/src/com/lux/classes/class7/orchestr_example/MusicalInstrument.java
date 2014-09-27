package com.lux.classes.class7.orchestr_example;

/**
 * Created with IntelliJ IDEA.
 * User: Dmitriy
 * Date: 05.06.14
 * Time: 18:54
 * To change this template use File | Settings | File Templates.
 */
public abstract class MusicalInstrument implements Playable {

    private String name;
    private String color;

    public MusicalInstrument(String color, String name) {
        this.color = color;
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
