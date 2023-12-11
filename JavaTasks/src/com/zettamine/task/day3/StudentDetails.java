package com.zettamine.task.day3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentDetails {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		
		List<Student> student = new ArrayList<Student>();
		
		boolean flag = false;
		
		
		while(!flag)
		{
			addStudent(student);
			int i = 1;
			while(i>0)
			{
				System.out.print("Do you want to enter another student(Y/N) : ");
				String choice = sc.next();
				
			
				if(choice.matches("^[yYnN]"))
				{
					if(choice.equalsIgnoreCase("n"))
					{
						flag = true;
					}
					i = 0;
				}
				else
				{
					System.out.println("Enter valid input......");
				}
			}
			
			
			
		}
		
		displayStudent(student);
		
		sc.close();
	}


	public static void addStudent(List<Student> student)
	{
		System.out.println("Enter the student name and Email : ");
		String name = sc.next();
		int i = 1;
		while(i>0)
		{
			String email = sc.next();
			if(email.matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$"))
			{
				student.add(new Student(name, email));
				i = 0;
			}
			else
			{
				System.out.println("Enter the valid email");
				System.out.print("Re enter the Email : ");
			}
		}
		
	}
	
	private static void displayStudent(List<Student> student) {

		System.out.println("~".repeat(100));
		System.out.println("  STUD_ID  | STUDENT_NAME         | STUDENT_EMAIL       |   COLLEGE_NAME");
		System.out.println("~".repeat(100));
		
		for(Student s : student)
		{
			System.out.println(s);
			System.out.println("~".repeat(100));

		}

	}
}
