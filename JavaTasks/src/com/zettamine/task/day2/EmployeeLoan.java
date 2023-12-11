package com.zettamine.task.day2;

import java.util.Scanner;

public class EmployeeLoan {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Employee emp = null;
		System.out.print("Enter the name : ");
		String name = sc.next();
		System.out.print("Enter the employee ID : ");
		int id = sc.nextInt();
		boolean flag = false;
		while(!flag)
		{
			System.out.print("Enter the employee type [P/T] : ");
			String type = sc.next();
			if(type.matches("[TtPp]"))
			{
				if(type.equalsIgnoreCase("p"))
				{
					System.out.print("Enter the basic pay : ");
					double basicPay = sc.nextDouble();
					emp = new PermanentEmployee(id, name, basicPay);
					emp.calculateSalary();
				}
				else
				{
					System.out.print("Enter the hours worked : ");
					int hoursWorked = sc.nextInt();
					System.out.print("Enter the hourly wage : ");
					int hourlyWage = sc.nextInt();
					
					emp = new TemporaryEmployee(id, name, hoursWorked, hourlyWage);
					emp.calculateSalary();
				}
				flag = true;
			}
			else
			{
				System.out.println("Enter the valid input");
			}
		}
		
		Loan loan = new Loan();
		System.out.println("Loan amount : " + loan.calculateLoanAmount(emp));
	}

}
