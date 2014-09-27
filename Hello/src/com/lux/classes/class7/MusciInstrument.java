package com.lux.classes.class7;

/**
 * Created by dima on 6/5/2014.
 */
public abstract class MusciInstrument implements Playable, Comparable {
    private String name;
    private String color;

    public MusciInstrument(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public int compareTo(Object o1) {
        return this.color.compareTo(((MusciInstrument) o1).getColor() ); //без generics - поэтому явный кастинг к нашему типу
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }


}
