package com.lux.classes.class7;

import com.lux.classes.class7.Playable;

/**
 * Created by dima on 6/5/2014.
 */
public abstract class People implements Playable {
    private String firstName;
    private String lastName;
    private boolean sex;

    public People(String firstName, String lastName, boolean sex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
    }

    //public abstract void play(); убираем сигнатруру метода т.к. он описан в интерфейсе Playbale
}
