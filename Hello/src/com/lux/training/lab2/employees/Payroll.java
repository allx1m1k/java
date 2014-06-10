package com.lux.training.lab2.employees;

import com.lux.classes.Playable;

/**
 * Created by dima on 10.06.2014.
 */
public class Payroll {
    //чтобы хранить список сотрудников в платежной ведомости
    private Person[] members;
    //счетчик кол-ва отрудников в ведомости
    private int cnt;

    //конструктор передаем кол-во сотрудников в ведомомсти
    public Payroll(int numCount){
        members = new Person[numCount];
        cnt = 0;
    }
    //метод добавления персоны
    public void addEmployee(Person empl){

        //numbers[cnt++] = instrument;
        members[cnt++] = empl;
    }

    //метод платить
    public void pay(){
        for (Person employee: members) {
            employee.pay(); //за счет динамического полиморфизма обращаемся к конкретному экземпляру через ссылку супер-типа 
        }
    }
}
