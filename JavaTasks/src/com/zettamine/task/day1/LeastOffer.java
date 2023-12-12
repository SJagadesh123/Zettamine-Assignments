package com.zettamine.task.day1;

import java.util.Scanner;

public class LeastOffer {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the no of items : ");
		int noOfItems = sc.nextInt();
		String[][] items = new String[noOfItems][3];
		for(int i = 0; i < items.length; i++)
		{
			items[i] = sc.next().split(",");
		}
		
		double[] discount = new double[noOfItems];
		
		for(int i = 0; i < discount.length; i++)
		{
			double disCal = Double.parseDouble(items[i][1]) * Double.parseDouble(items[i][2]);
			discount[i] = disCal/100 ;
		}
		
		double min = Double.MAX_VALUE;
		
		for(int i = 0; i < noOfItems ; i++)
		{
			if(discount[i] <= min)
			{
				min = discount[i];
			}
		}
		
		for(int i = 0; i < noOfItems ; i++)
		{
			if(discount[i] == min)
			{
				System.out.print("Item with minimum discount : "+ items[i][0] + "   ");
			}
		}
		
		sc.close();
	}

}
