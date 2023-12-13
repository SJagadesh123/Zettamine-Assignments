package com.zettamine.task.day6.assignment8;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo1 {

	public static void main(String[] args) {

		Set<String> name = new TreeSet<String>(
				new Comparator<String>() {
					public int compare(String s1, String s2)
					{	
						int len = s1.length()-s2.length();
						if(len != 0)
						{
							return len;
						}
						
						return s1.compareTo(s2);
						
					}
				});
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter no of students : ");
		int n = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < n; i++)
		{
			System.out.print("enter student-" + (i+1) + " name : ");
			String stuName = sc.nextLine();
			
			name.add(stuName);
		}
		
		int i = 1;
		for(String studentName : name)
		{
			
			System.out.println(i++ + "." + studentName);
		}
		
		sc.close();
	}

}
