package com.lux.training.lab2.employees;

import com.lux.training.utils.Date;

/**
 *
 */
public abstract class Employee implements NewPayable {
	private String lastname;
	private String firstname;
	private PositionInfo position; //������ ����������
    private Date birthday;

    public Employee(String lastname, String firstname, PositionInfo position, Date birthday) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.position = position;
        this.birthday = birthday;
    }

    public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public PositionInfo getPosition() {
		return position;
	}
	public void setPosition(PositionInfo position) {
		this.position = position;
	}
	//��������� � ����������� ������ ����� toString() ��� ������ ����� ���� �� ���������� �� �������� �� ���� ��� ������
	//��������������� ��������� ������������� ���������� ����� ���������� ��������� �������������
    //� ���������� ����� super.toString + �������������� ����� � ������� ���� ��� ��� ����������: ��� ������, �����
    public String toString(){
		System.out.println("First name: " + this.getFirstname());
		System.out.println("Last name: " + this.getLastname());
        System.out.println("Position: " + position.getPositionName() + " in " + " department " + position.getDapartmentName());
        return "";
	}
	
	public abstract double calcPayment(); //���� ����� �����������, �.�. ��� ���������� �������� ��� ������ �����
	
	public abstract String getType();

}
