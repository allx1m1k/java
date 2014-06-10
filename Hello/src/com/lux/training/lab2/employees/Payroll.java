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

    //метод вывода ФИО
    public void getFioAtIndex(int index) {
    	System.out.println("First name: " + members[index].getName());
    	System.out.println("Last name: " + members[index].getSurName());
    }
    
    //метод вывода должности и отдела
    public void getRoleAtIndex(int index) {
    	System.out.println("Position: " + members[index].getPosition());
    	System.out.println("Department: " + members[index].getDepartment());
    }
    
    //метод определения и печати в консоль конкретного типа экземпляра
    public void getPaymentTypeAtIndex(int index){
    	//System.out.println("Position: " + members[index].getPosition());
    	System.out.println("Payment type: " + members[index].getClass());
    	
    	
    }
    
    //метод платить
    public void pay(){
        for (Person employee: members) {
            employee.pay(); //за счет динамического полиморфизма обращаемся к конкретному экземпляру через ссылку супер-типа 
        }
    }
    
    
}
