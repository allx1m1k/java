package com.lux.training.lab2.employees;

import com.lux.training.utils.Date;

/**
 * Created by dima on 07.06.2014.
 */
public abstract class Person implements Paybale {
    private String name;
    private String surName;
    private Date birthday;
    private enum Dept {Finance, IT, Organizational};
    private enum Position {Head, Manager, Senior, Junior};



}
