package com.lux.training.lab2.employees;

import com.lux.training.utils.Date;

/**
 * Created by dima on 07.06.2014.
 */
public class EmployeeMonthlyPaybale extends Person {
	double ratePerMonth; //мес€чна€ зарплата

    protected EmployeeMonthlyPaybale(String name, String surName, String position, String department, Date birthday) {
        super(name, surName, position, department, birthday);
        ratePerMonth = 3000.00;
    }

    public void getSalary(){
    	System.out.println("Monthly payable employee" + this.ratePerMonth);
    }
    
    @Override
    public void pay() {
        System.out.println("Monthly payable employee");

    }

/*    
	@Override
	public void payAtIndex(int index) {
		// TODO Auto-generated method stub
        System.out.println("Salary = " + this.ratePerMonth);
		
	}
	
*/

}
