package com.zettamine.task.day1;

import java.util.Scanner;

public class DisplayCharacters {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int[] arr = new int[4];
		
		enterValues(arr);
		displayCharacters(arr);
	}

	private static void enterValues(int[] arr) {
		
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print("Enter number " +(i+1) + " : ");
			arr[i] = sc.nextInt();
		}		
	}
	
	private static void displayCharacters(int[] arr) {
		for(int i = 0; i < arr.length; i++)
		{
			char ch = (char) arr[i];
			System.out.println(arr[i] + "-" + ch);
			
		}	
		
	}

}
