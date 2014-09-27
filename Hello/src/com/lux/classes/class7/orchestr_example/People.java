package com.lux.classes.class7.orchestr_example;

/**
 * Created with IntelliJ IDEA.
 * User: Dmitriy
 * Date: 05.06.14
 * Time: 19:13
 * To change this template use File | Settings | File Templates.
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }
}
