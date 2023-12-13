package com.zettamine.task.day6.assignment5;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class InsuranceBazar {

	public static void main(String[] args) {

		Map<Integer, String> policies = new TreeMap<Integer, String>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the no of Policy names you want to store : ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++)
		{
			System.out.print("Enter the Policy ID : ");
			int policyId = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter the Policy Name : ");
			String policyName = sc.nextLine();
			
			policies.put(policyId, policyName);
		}
		
		Set<Integer> keys = policies.keySet();
		
		Iterator<Integer> itr = keys.iterator();
		
		while(itr.hasNext())
		{
			int key = itr.next();
			String value = policies.get(key);
			
			System.out.println(key + " " + value);
		}
		
		Iterator<Integer> itr1 = keys.iterator();
		
		System.out.println("Enter the policy type to be searched :");
		String policyType = sc.nextLine();
		while(itr1.hasNext())
		{
			int key = itr1.next();
			String value = policies.get(key);
			
			if(value.contains(policyType))
			{
				System.out.println(key);
			}
		}
		
		sc.close();
	}

}
