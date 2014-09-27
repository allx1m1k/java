package com.lux.training.lab2.employees;

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

    //метод определения кол-ва строк в платежной ведомомсти
    public int getPayrollRows(){
        return cnt;
    }

    //метод получения массива Персон
    public Person[] getMembers() {
        return members;
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
    	if (members[index] instanceof EmployeeExtPaybale) { 
    		System.out.println("Payment type: comission and base salary");
    	}
    	if (members[index] instanceof EmployeeHourlyPaybale) {
    		System.out.println("Payment type: hourly rate");
    	}
    	if (members[index] instanceof EmployeeMonthlyPaybale) {
            System.out.println("Payment type: monthly salary");
        }
    	if (members[index] instanceof EmployeeSalePaybale) {
    		System.out.println("Payment type: comission");
    	}
    }

    //метод формирования строки с фин.информацией и ипечати в консоль фин.данных
    public void getPaymentAtIndex(int index){
        if (members[index] instanceof EmployeeExtPaybale) {
            //System.out.println("Payment type: comission and base salary");
            System.out.println("Sales amount: " + members[index].getSales());
            System.out.println("Commission: " + members[index].getCommissionRate());
            System.out.println("Base salary: " + members[index].getRatePerMonth());
            System.out.println("Payment: " + members[index].getPayment());
        }
        if (members[index] instanceof EmployeeHourlyPaybale) {
            //System.out.println("Salary: " + members[index].getSalary());
            System.out.println("Working hours: " + members[index].getPeriodHours());
            System.out.println("Hourly rate: " + members[index].getRatePerHour());
            System.out.println("Payment: " + members[index].getPayment());
        }
        if (members[index] instanceof EmployeeMonthlyPaybale) {
            //System.out.println("Payment type: monthly salary");
            System.out.println("Salary: " + members[index].getRatePerMonth());
            System.out.println("Payment: " + members[index].getPayment());
        }
        if (members[index] instanceof EmployeeSalePaybale) {
            //System.out.println("Payment type: comission");
            System.out.println("Sales amount: " + members[index].getSales());
            System.out.println("Commission: " + members[index].getCommissionRate());
            System.out.println("Payment: " + members[index].getPayment());
        }
    }
    //рабочий метод платить
    public void pay(){
       for (Person employee: members) {
            employee.pay(); //за счет динамического полиморфизма обращаемся к конкретному экземпляру через ссылку супер-типа
       }
    }

}
