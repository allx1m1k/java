package com.oopwebinar;

/**
 * Created by dima on 13.08.2015.
 */
public class Owner {
    //это класс представляет тип связи как  агрегация т.к. может жить без других классов
    private final String name;


    public Owner(String name) {
        this.name = name;
    }
}
