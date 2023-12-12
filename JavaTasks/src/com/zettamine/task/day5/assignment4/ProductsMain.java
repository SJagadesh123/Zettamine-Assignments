package com.zettamine.task.day5.assignment4;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class ProductsMain{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try(FileOutputStream fos = new FileOutputStream("C:\\Users\\Jagadeesh\\git\\repository\\JavaTasks\\src\\com\\zettamine\\task\\day5\\assignment4\\stocks.ser.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);){
			
			System.out.print("Enter the no of products to be saved : ");
			int n = sc.nextInt();
			
			Products[] pro = new Products[n];
			
			for(int i = 0; i < n ; i++)
			{
				System.out.println("enter product id & product name of Product -"+ (i+1) + " : ");
				int id = sc.nextInt();
				String name = sc.next();
				
				pro[i] = new Products(id, name);
				
			}
			
			oos.writeObject(pro);
			
			System.out.println("Succesfully Serialized....");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		sc.close();
	}

}
