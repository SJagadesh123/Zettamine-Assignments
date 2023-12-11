package com.zettamine.task.day2;

import java.util.Scanner;

public class StudentDetails {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		System.out.print("Enter student Id : ");
		int id = sc.nextInt();
		System.out.print("Enter student name : ");
		String name = sc.next();
		System.out.print("Enter student address : ");
		String address = sc.next();
		String collegeName = null;
		while(!flag)
		{
			System.out.print("Whether the student is from NIT(Yes/No) : ");
			String response = sc.next();
			if(response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("no"))
			{
				if(response.equalsIgnoreCase("yes"))
				{
					collegeName = "NIT";
				}
				else
				{
					System.out.println("Enter the college name : ");
					collegeName = sc.next();
				}
				
				flag = true;
			}
			else
			{
				System.out.println("Wrong Input");
			}
		}
		
		Student student = new Student(id, name, address, collegeName);
		System.out.println("Student id : " + student.getStudentId());
		System.out.println("Student name : " + student.getStudentName());
		System.out.println("Address : " + student.getStudentAddress());
		System.out.println("College name : " + student.getCollegeName());
		
	}

}
