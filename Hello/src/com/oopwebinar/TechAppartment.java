package com.oopwebinar;

/**
 * Created by dima on 13.08.2015.
 */
public class TechAppartment {
    private int number;

    public TechAppartment(int number) {
        //this.owners = owners;
        //super(number) --> используем когда наследуемся от абстрактного класса extends
        this.number = number;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "number " + number + "\n";
        //return super.toString();
    }
}
