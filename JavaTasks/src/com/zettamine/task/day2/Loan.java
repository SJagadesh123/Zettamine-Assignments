package com.zettamine.task.day2;

public class Loan {

	public double calculateLoanAmount(Employee emp)
	{
		if(emp instanceof PermanentEmployee)
		{
			return emp.getSalary()*0.15;
		}
		else if(emp instanceof TemporaryEmployee)
		{
		return emp.getSalary()*0.1;
		}
		return 0;
	}
}
