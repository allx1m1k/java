package com.oopwebinar;

/**
 * Created by dima on 13.08.2015.
 */
public class Floor {
    //этот класс представляет тип свзяи как композит
    private int number;
    private LivingAppartment[] appartments;

    public Floor (int n) {
        this.number = n;
    }



    public LivingAppartment getFreeApp(){
        //todo
        return null;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
