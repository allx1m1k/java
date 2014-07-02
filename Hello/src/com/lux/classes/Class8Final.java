package com.lux.classes;

import java.util.Date;

/**
 * Created by dima on 02.07.2014.
 */
final class Class8Final {
    private Date birthday;

    public Class8Final() {
        this.birthday = new Date(1970);
    }
    public Date getDate() {
        return birthday;
    }

    public Date setNewDate(Date aDate) {
        this.birthday = aDate;
        return birthday;
    }


    public static void main(String[] args) {
        Class8Final d1 = new Class8Final(); //
        System.out.println(d1.getDate()); //вернет ссылку на объект Date
        Class8Final d2 = new Class8Final(); //
    }
}
