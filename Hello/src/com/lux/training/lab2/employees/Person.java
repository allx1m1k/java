package com.lux.training.lab2.employees;

import com.lux.training.utils.Date;

/**
 * Created by dima on 07.06.2014.
 */
public abstract class Person implements Paybale {
    private String name;
    private String surName;
    private String position;
    private String department;
    private Date birthday;

    public Person(String name, String surName, String position, String department, Date birthday) {
        this.name = name;
        this.surName = surName;
        this.position = position;
        this.department = department;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public String getPosition() {
        return position;
    }

    public String getDepartment(){
        return department;
    }

    public Date getBirthday() {
        return birthday;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
