package com.lux.assignment.class5;

/**
*ʊ���� ��� ������ � ����� 
*@author dima
*
**/

public class Date1 implements Comparable {
	private int day;
	private int month;
	private int year;
	
	//����������� ��-���������, ���������������� ��������� ������ ��������� 01.01.1900;
	public Date1() {
		this.day = 1;
		this.month = 1;
		this.year = 1900;
	}
	
	
	//�����������, ���������������� ��������� ������ �������� ��������� ���� (�������� ��������
	//� ���� ���, ������ � ����);
	public Date1(int aDay, int aMonth, int aYear) {
		this.day = aDay;
		this.month = aMonth;
		this.year = aYear;
	}
	
	//�����������, ���������������� ��������� ������ �������� ��������� ���� (�������� ��������
	//������ �������� ������ Date)
	public Date1(Date1 aDate) {
		this.day = aDate.getDay();
		this.month = aDate.getMonth();
		this.year = aDate.getYear();
	}
//����� ��� ������� � ���
	public int getDay(){
		return day;
	}

	//����� ��� ������� � ������
	public int getMonth(){
		return month;
	}
	
	//����� ��� ������� � ����
	public int getYear(){
		return year;
	}

	//����� ��� ��������� �������� ���
	public void setDay(int d){
		this.day = d;
	}
	
	//����� ��� ��������� �������� ������
	public void setMonth(int m){
		this.month = m;
	}

	//����� ��� ��������� �������� ����
	public void setYear(int y){
		this.year = y;
	}
	
	//����� setDate ��� ������� �������� ����;
	public void setDate(int aDay, int aMonth, int aYear){
			this.day = aDay;
			this.month = aMonth;
			this.year = aYear;
	}
	

	public void printDate() {
	String dateToPrint = new String();
	String dayToPrint = new String();
	String monthToPrint = new String();
	//������������� �������� ����� 10 (1 .. 9) � (01 ..09)
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
	//���������� ����������������� ������
	dateToPrint = dayToPrint + "." + monthToPrint  + "." + Integer.toString(this.getYear());
    //(day<10)?"0" + day : day ��������� ��������
	System.out.println(dateToPrint);
	}


    //����� printDate ������������ �������� ���� � ���� ������ ������� dd.mm.yyyy (��������:
    //03.02.2004);
    public String  printDate1() {
        String dateToPrint = new String();
        String dayToPrint = new String();
        String monthToPrint = new String();
        //������������� �������� ����� 10 (1 .. 9) � (01 ..09)
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
        //���������� ����������������� ������
        dateToPrint = dayToPrint + "." + monthToPrint  + "." + Integer.toString(this.getYear());
        //(day<10)?"0" + day : day ��������� ��������
        return dateToPrint;
    }


	//������ incDay � ����������� ���� �� �������� ����� ���� � decDay � ��������� ���� ��
	//�������� ����� ����;
	public void incDay(int d) {
	
		this.day += d;
	}

	public void decDay(int d) {
	
		this.day -= d;
	}
	
	//����������� ����� monthsCount ������������ ����� ������� ��������� ����� �����
	//������;
	public static int compareDates(Date1 d1, Date1 d2) {
	    //return d1.year*12 + d1.month - d2.year*12 - d2.month;
		return d1.getMonth() - d2.getMonth(); //������� � ������� ��� ����� �����
	
	}

    //���������������� ����� ��� ��������� ���� ��� �� ������ ���
    @Override
    public int compareTo(Object o) {
        //���������� ������� Day ������� � ������� Day ���������
        return this.getDay() - ((Date1) o).getDay();
    }
}