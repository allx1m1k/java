package com.lux.training.lab2.employees;

public class PositionInfo {
	private String name;
	private String dapartmentName;
	
	public String toString(){
		System.out.println("Position: " + getPositionName());	
		System.out.println("Department: " + getDapartmentName());
		return "";
		
	}
	
	
	public String getPositionName() {
		return name;
	}
	
	public void setPositionName(String name) {
		this.name = name;
	}
	
	public String getDapartmentName() {
		return dapartmentName;
	}

	public void setDapartmentName(String dapartmentName) {
		this.dapartmentName = dapartmentName;
	}

}
