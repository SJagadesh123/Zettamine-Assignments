package com.zettamine.task.day1;

import java.util.Scanner;

public class StringConcatination {

	public static void main(String[] args) throws InvalidNameException {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Inmate's name : ");
		String inmateName = sc.nextLine();
		for(int i = 0 ; i < inmateName.length(); i++)
		{
			char ch = inmateName.charAt(i);
			if(Character.isDigit(ch))
			{
				throw new InvalidNameException("Invalid Name");
			}
		}
		
		System.out.print("Inmate's fathers name : ");
		String inmateFatherName = sc.nextLine();
		
		for(int i = 0 ; i < inmateFatherName.length(); i++)
		{
			char ch = inmateFatherName.charAt(i);
			if(Character.isDigit(ch))
			{
				throw new InvalidNameException("Invalid Name");
			}
		}
		
		String fullName = inmateName.concat(" ").concat(inmateFatherName);
		System.out.println(fullName.toUpperCase());
		
	}

}
