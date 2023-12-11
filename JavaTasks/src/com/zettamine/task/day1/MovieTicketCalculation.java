package com.zettamine.task.day1;

import java.util.Scanner;

public class MovieTicketCalculation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double discount = 0;
		double refresh = 0;
		System.out.print("Enter no  of tickets : ");
		int noOfTkts = sc.nextInt();
		if(noOfTkts < 5 || noOfTkts > 40)
		{
			System.out.println("Minimum of 5 and Maximum of 40 Tickets");
			System.exit(0);
		}
		else
		{
			if(noOfTkts>=20)
			{
				discount = 0.1;
			}
		}
		double amount = 0;
		
		boolean flag = false;
		while(!flag)
		{
			System.out.print("Do you want refreshment (y/n) : ");
			String ref = sc.next();
			if(ref.matches("[YyNn]"))
			{
				if(ref.equalsIgnoreCase("y"))
				{
					refresh = 50;
				}
				flag = true;
			}
			else
			{
				System.out.println("enter the valid input");
			}
		}
		while(flag)
		{
			System.out.print("Do you have coupon (y/n) : ");
			String ref = sc.next();
			if(ref.matches("[YyNn]"))
			{
				if(ref.equalsIgnoreCase("y"))
				{
					discount = discount + 0.02;
				}
				flag = false;
			}
			else
			{
				System.out.println("enter the valid input");
			}
		}
		
		while(!flag)
		{
			System.out.println("Enter the circle : ");
			String ref = sc.next();
			if(ref.matches("[KkQq]"))
			{
				if(ref.equalsIgnoreCase("k"))
				{
					amount = amount + 75;
				}
				else
				{
					amount = amount + 150;
				}
				flag = true;
			}
			else
			{
				System.out.println("enter the valid input");
			}
		}
		
		double total = noOfTkts*amount;
		double totalDiscount = total - (discount*total);
		double totalCost = totalDiscount + (noOfTkts*refresh);
		
		System.out.printf("Ticket cost : %.2f",totalCost);
		
	}

}
