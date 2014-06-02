package com.lux.assignment;

/**
*КЉласс для работы с датой 
*@author dima
*
**/

public class Date1 {
	private int day;
	private int month;
	private int year;
	
	//конструктор по-умолчанию, инициализирующий экземпляр класса значением 01.01.1900;
	public Date1() {
		this.day = 1;
		this.month = 1;
		this.year = 1900;
	}
	
	
	//конструктор, инициализирующий экземпляр класса заданным значением даты (значение задается
	//в виде дня, месяца и года);
	public Date1(int aDay, int aMonth, int aYear) {
		this.day = aDay;
		this.month = aMonth;
		this.year = aYear;
	}
	
	//конструктор, инициализирующий экземпляр класса заданным значениям даты (значение задается
	//другим объектом класса Date)
	public Date1(Date1 aDate) {
		this.day = aDate.getDay();
		this.month = aDate.getMonth();
		this.year = aDate.getYear();
	}
//метод для доступа к дню
	public int getDay(){
		return day;
	}

	//метод для доступа к месяцу
	public int getMonth(){
		return month;
	}
	
	//метод для доступа к году
	public int getYear(){
		return year;
	}

	//метод для установки значения дня
	public void setDay(int d){
		this.day = d;
	}
	
	//метод для установки значения месяца
	public void setMonth(int m){
		this.month = m;
	}

	//метод для установки значения года
	public void setYear(int y){
		this.year = y;
	}
	
	//метод setDate для задания значения даты;
	public void setDate(int aDay, int aMonth, int aYear){
			this.day = aDay;
			this.month = aMonth;
			this.year = aYear;
	}
	
	//метод printDate возвращающий значение даты в виде строки формата dd.mm.yyyy (например:
	//03.02.2004);
	public void printDate() {
	String dateToPrint = new String();
	String dayToPrint = new String();
	String monthToPrint = new String();
	//отформатируем значения менее 10 (1 .. 9) в (01 ..09)
	if (this.getDay() < 10) {
		dayToPrint = "0" + this.getDay();
		}
		else { 
			dayToPrint = Integer.toString(this.getDay());
			}
	if (this.getMonth() < 10) {
		monthToPrint = "0" + this.getMonth();
		}
		else {
			monthToPrint = Integer.toString(this.getMonth());
			}
	//подготовим отформатированную строку
	dateToPrint = dayToPrint + "." + monthToPrint  + "." + Integer.toString(this.getYear());
	System.out.println(dateToPrint);
	}
	
	
	//методы incDay – увеличивает дату на заданное число дней и decDay – уменьшает дату на
	//заданное число дней;
	public void incDay(int d) {
	
		this.day += d;
	}

	public void decDay(int d) {
	
		this.day -= d;
	}
	
	//статический метод monthsCount возвращающий число месяцев прошедших между двумя
	//датами;
	public static int compareDates(Date1 d1, Date1 d2) {
	
		return d1.getMonth() - d2.getMonth();
	
	}
}