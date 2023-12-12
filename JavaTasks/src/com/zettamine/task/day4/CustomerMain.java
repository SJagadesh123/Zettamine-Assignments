package com.zettamine.task.day4;

import java.util.Scanner;

public class CustomerMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter A/C number : ");
		int accNo = sc.nextInt();
		System.out.print("Enter customer id : ");
		int custId = sc.nextInt();
		boolean flag = false;
		String custName = null;
		sc.nextLine();
		while(!flag)
		{
			System.out.print("Enter customer name : ");
			custName = sc.nextLine();
			if(!custName.matches("[a-zA-Z\\s]+"))
			{
				System.out.println("Invalid name... Please enter valid name");
			}
			else
			{
				flag = true;
			}
		}//while
		String email = null;
		while(flag)
		{
			System.out.print("Enter customer email : ");
			email = sc.nextLine();
			if(email.matches("[^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$]"))
			{
				System.out.println("Enter the valid email....");
			}
			else
			{
				flag = false;
			}
		}//while
		
		System.out.print("Enter balance : ");
		double balance = sc.nextDouble();
		System.out.print("Enter minimum balance : ");
		double minimumBalance = sc.nextDouble();
		
		Customer customer = new Customer(custId, custName, email);
		Account account = new SavingsAccount(accNo, customer, balance, minimumBalance);
		
		System.out.print("Enter the amount to withdraw : ");
		double withdrawAmount = sc.nextDouble();
		if(account.withDraw(withdrawAmount))
		{
			System.out.printf("Rs. %.2f debited | Balance : %.2f", withdrawAmount, account.balance);
		}
		else
		{
			System.out.println("Insufficient Balance......");
		}
		
		sc.close();
	}

}
