package com.lux.training.lab2.employees;

/**
 * В этот класс инкапсулировали информацию о позиции
 */
public class PositionInfo {
	private String name;
	private String dapartmentName;
	
	public String toString(){
		System.out.println("Position: " + this.getPositionName() + " in department " + this.getDapartmentName() );
		return "";
		
	}

    PositionInfo(String aName, String aDapartmentName){
        name = aName;
        dapartmentName = aDapartmentName;
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
