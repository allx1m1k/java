package com.lux.classes;

import com.lux.assignment.class5.Date1;

/**
 * Created by dima on 02.07.2014.
 */
final class Class8Final {
    private Date1 birthday;

    /**
     * конструктор инициализирующий атрибут birthday нашего класса в виде экземпляра класса Date1
      */
    public Class8Final() {
        this.birthday = new Date1(31,12,1970);
    }

    /**
     * метод возвращающий ссыдку на атрибут birthday нашего класса
     * @return Date1
     */
    public Date1 getDate() {
        return new Date1(birthday); //возвращаем ссылку на объект Date1 через копирующий конструктор  - класс immutable
        //return birthday; //возвращаем ссылку на объект Date1 кот. является атрибутом в данном классе - класс не immutable
    }

    public Date1 setNewDate(Date1 aDate) {
        this.birthday = aDate;
        return birthday;
    }


    public static void main(String[] args) {
        Class8Final d1 = new Class8Final(); //
        System.out.println(d1.getDate()); //вернет ссылку на объект Date1 которая хранится в атрибуте birthday
        d1.getDate().printDate(); //выведем в консоль что хранится в атрибуте birthday
        d1.getDate().setDate(1,1,1971); //строка демонстрирующая что после применения копирующего констр-ра в методе getDate(),
        //кажущиеся изменение setDate на самом деле наш объект d1 не изменили - применен копирующий конструктор и класс
        //стал immutable
        d1.getDate().printDate();
        Class8Final d2 = new Class8Final(); //
    }
}
