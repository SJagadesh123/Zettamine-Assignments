package com.zettamine.task.day2;

import java.util.Scanner;

public class BankCustomerMain {

	static Scanner sc; 
	static
	{
		sc = new Scanner(System.in);
	}
	
	public static void main(String[] args) {

		BankCustomer customer = null;
		
		boolean flag = false;
		while(!flag)
		{
			System.out.println("1.Create Account");
			System.out.println("2.Deposit");
			System.out.println("3.WithDraw");
			System.out.println("4.Details");
			System.out.println("5.Exit");
			System.out.print("Enter your choice : ");
			int choice = sc.nextInt();
			sc.nextLine();
			switch(choice)
			{
				case 1:
				{
					if(customer == null)
					{
						customer = createAccount();
						System.out.println("Account Opened!!!!!");
						System.out.println("Balance : " + customer.getBalance());
					}
					else
					{
						System.out.println("Account is already opened with us..");
					}
				}break;
				case 2:
				{
					if(customer == null)
					{
						System.out.println("You dont have an account");
						System.out.println("Please open an account with us..");
					}
					else
					{
						System.out.print("Enter the amount to be deposited : ");
						double amount = sc.nextDouble();
						deposit(customer, amount);
					}
					
				}break;
				case 3:
				{
					if(customer == null)
					{
						System.out.println("You dont have an account");
						System.out.println("Please open an account with us..");
					}
					else
					{
						System.out.print("Enter the amount to be deposited : ");
						double amount = sc.nextDouble();
						withdraw(customer , amount);
					}
				}break;
				case 4:
				{
					details(customer);
				}break;
				case 5:
				{
					System.out.println("Thank you");
					flag = true;
				}break;
				default:
				{
					System.out.println("Enter the valid option");
				}
			}
		}
		
		sc.close();
	}


	private static void details(BankCustomer customer) {
		
		System.out.println("Name : " + customer.getName());
		System.out.println("Account Number : " + customer.getAccountNo());
		System.out.println("Balance : " + customer.getBalance());
		
	}


	private static BankCustomer createAccount() {
		
		System.out.print("Enter your name : ");
		String name = sc.nextLine();
		System.out.println("Enter Account number : ");
		int accNo = sc.nextInt();
		System.out.println("Enter initial deposit : ");
		double balance = sc.nextDouble();
		
		return new BankCustomer(name, accNo, balance);
	}
	
	private static void withdraw(BankCustomer customer, double amount) {
		if(amount > customer.getBalance())
		{
			System.out.println("Insufficient Balance");
		}
		else
		{
			customer.setBalance(customer.getBalance()-amount);
			System.out.println("Withdrawn succesfully..");
			System.out.println("Balance : " + customer.getBalance());
		}
		
	}
	
	private static void deposit(BankCustomer customer, double amount) {
		customer.setBalance(customer.getBalance()+amount);
		System.out.println("Deposited succesfully..");
		System.out.println("Balance : " + customer.getBalance());
		
	}

}
