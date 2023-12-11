package com.zettamine.task.day3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueWords {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Article : ");
		
		String article = sc.nextLine();
		
		String[] articleArray = article.split("[^a-zA-Z0-9]+");
		
		Set<String> uniqueWords = new HashSet<String>();
		
		for(int i = 0; i < articleArray.length; i++)
		{
			String words= articleArray[i].toLowerCase();
			uniqueWords.add(words);
		}
		//Hello Everybody, Welcome to collection in JAVA. Collection, is like a container and powerful concept in Java!
		System.out.println("Number of words : " + articleArray.length);
		System.out.println("Number of unique words : " + uniqueWords.size());
		System.out.println();
		System.out.println("The words are : ");
		for(String s : articleArray)
		{
			System.out.println(s);
		}
		System.out.println();
		System.out.println("The unique words are : ");
		for(String s : uniqueWords)
		{
			System.out.println(s);
		}
	}

}
