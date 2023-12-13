package com.zettamine.task.day6.assignment4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class WordsCount {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student's Article : ");
		String str = sc.nextLine();
		str = str.toLowerCase();
		
		String[] words = str.split("[^a-zA-Z0-9]+");
		System.out.println("Number of words : " + words.length);
		
		
		
		Map<String, Integer> wordCountMap = new HashMap<String, Integer>();
		
		for(int i = 0; i < words.length; i++)
		{
			Integer count = wordCountMap.get(words[i]);
			if(wordCountMap.get(words[i])==null)
			{
				wordCountMap.put(words[i], 1);
			}
			else
			{
				wordCountMap.put(words[i], ++count);
			}
		}
		
		Set<String> keys = wordCountMap.keySet();
		
		Iterator<String> itr = keys.iterator();
		
		String key = "";
		while(itr.hasNext())
		{
			key = itr.next();
			System.out.println(key + " : " + wordCountMap.get(key));
	
		}
		
		sc.close();
	}

}
