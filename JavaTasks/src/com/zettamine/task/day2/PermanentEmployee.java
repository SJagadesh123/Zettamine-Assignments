package com.zettamine.task.day2;

public class PermanentEmployee extends Employee {

	private double basicPay;
	
	public PermanentEmployee(int employeeId, String employeeName, double basicPay) {
		super(employeeId, employeeName);
		this.basicPay = basicPay;
	}
	
	@Override
	public void calculateSalary() {

		double pf = basicPay * 0.12;
		this.setSalary(basicPay - pf);
	}


	

}
