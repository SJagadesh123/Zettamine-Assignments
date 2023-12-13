package com.zettamine.task.day6.assignment6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.zettamine.task.day6.assignment2.Contact;

public class StudentReport {

	public static void main(String[] args) {

		ArrayList<Student> studentList = new ArrayList<Student>();
		
		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		while(!flag)
		{
			System.out.println("Enter Student’s Name, Location, Email and Mobile : ");
			String name = sc.next();
			String loc = sc.next();
			String email = null;
			int i = 1;
			while(i>0)
			{
				
				email = sc.next();
				if(email.matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$"))
				{
					
					i = 0;
				}
				else
				{
					System.out.println("Invalid email.....");
				}
			}//inner while
			long mobile = sc.nextLong();
			
			System.out.println("Do you want to add more students[Y/N] : ");
			if(sc.next().equalsIgnoreCase("n"))
			{
				flag = true;
			}
			
			studentList.add(new Student(name, loc, email, mobile));
		}//while
		
		Map<String, Integer> map1 = getReport(studentList);
		
		Set<String> keys = map1.keySet();
		Iterator<String> itr = keys.iterator();
		System.out.println("Location     Count");
		while(itr.hasNext())
		{
			String key = itr.next();
			System.out.println(key + "     " + map1.get(key));
		}
		sc.close();
		
	}

	public static HashMap<String, Integer> getReport(ArrayList<Student> studentList)
	{
		HashMap<String, Integer> map1 = new HashMap<String, Integer>();
		
		for(Student student : studentList)
		{
			Integer count = map1.get(student.getLocation());
			if(count == null)
			{
				map1.put(student.getLocation(), 1);
			}
			else
			{
				map1.put(student.getLocation(), ++count);
			}
		}
		
		return map1;
		
	}
}
