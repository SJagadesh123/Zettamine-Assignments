package com.zettamine.task.day5.assignment5;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import com.zettamine.task.day5.assignment4.Products;

public class Product {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Products[] pro = null;
		try(FileInputStream fis = new FileInputStream("C:\\Users\\Jagadeesh\\git\\repository\\JavaTasks\\src\\com\\zettamine\\task\\day5\\assignment4\\stocks.ser.txt");
				ObjectInputStream ois = new ObjectInputStream(fis);)
		{
			while(true)
			{
				pro = (Products[]) ois.readObject();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (EOFException e) {
			System.out.println("Deserialization is sucessfull...");
		}
		catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.print("Enter the product Id : ");
		int proId = sc.nextInt();
		int count = 0;
		for(int i = 0; i < pro.length; i++)
		{
			if(pro[i].getProductId() == proId)
			{
				System.out.println(pro[i].getProductName());
				count++;
			}
			
		}
		
		if(count == 0)
		{
			System.out.println("There is no product with id : " + proId);
		}
		
		sc.close();
	}

}
