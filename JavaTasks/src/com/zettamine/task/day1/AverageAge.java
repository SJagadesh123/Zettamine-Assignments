package com.zettamine.task.day1;

import java.util.Scanner;

public class AverageAge {

	public static void main(String[] args) throws InvalidAgeException, InvalidEmployeeCount {

		Scanner sc = new Scanner(System.in);
		int noOfEmp = 0;
		double total = 0;
		
			System.out.print("Enter total no of employee : ");
			 noOfEmp = sc.nextInt();
			if(noOfEmp < 2) throw new InvalidEmployeeCount("Please enter valid employee count...");
		
		
		int[] age = new int[noOfEmp];
		
		
			System.out.println("Enter the age of each employee : ");
			
			for(int i = 0; i < noOfEmp ; i++)
			{
				age[i] = sc.nextInt();
			}
			
			for(int i = 0; i < noOfEmp ; i++)
			{
				if(age[i]<28 || age[i]>40)
				{
					throw new InvalidAgeException("Invalid Age Encountered");
				}
			}
			
		double avgAge = calculateAverageAge(age);
		System.out.printf("The average age is :  %.2f",avgAge);
		
		sc.close();
	}

	private static double calculateAverageAge(int[] age) {
		double total = 0;
		for(int i =0; i < age.length; i++)
		{
			total = total + age[i];
		}
		
		return total/age.length;
		
	}
	
	

}
