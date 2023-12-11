package com.zettamine.task.day1;

import java.util.Scanner;

public class StringConcatination {

	public static void main(String[] args) throws InvalidNameException {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Inmate's name : ");
		String inmateName = sc.nextLine();

		if(inmateName.matches("([^a-z]+).([^A-Z]+)"))
		{
			throw new InvalidNameException();
		}
		System.out.print("Inmate's fathers name : ");
		String inmateFatherName = sc.nextLine();
		
		if(inmateName.matches("([^a-z]+).([^A-Z]+)"))
		{
			throw new InvalidNameException();
		}
		
		
		String fullName = inmateName.concat(" ").concat(inmateFatherName);
		System.out.println(fullName.toUpperCase());
		
	}

}
