package com.zettamine.task.day4;

import java.util.Scanner;


public class DrawingApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Shape[] shapeArray = new Shape[5];
		for(int i = 0; i < 5; i++)
		{
			System.out.print("Which shape do you want to work with ? [1. Rectangle | 2. Triangle | 3. Cube | 4. Sphere] : ");
			String shapeName = sc.next();
			
			switch(shapeName.toLowerCase())
			{
				case "triangle":
				{
					System.out.print("Enter the height of triangle : ");
					double height = sc.nextDouble();
					System.out.print("Enter the base of rectangle : ");
					double base = sc.nextDouble();
					Shape shape = new Triangle(height, base);	
					shapeArray[i] = shape;
				}break;
				case "rectangle" : 
				{
					System.out.print("Enter the length of rectangle : ");
					double length = sc.nextDouble();
					System.out.print("Enter the breadth of rectangle : ");
					double breadth = sc.nextDouble();
					Shape shape = new Rectangle(length, breadth);
					shapeArray[i] = shape;
				}break;
				case "cube" :
				{
					System.out.print("Enter the length of cube : ");
					double length = sc.nextDouble();
					System.out.print("Enter the breadth of cube : ");
					double breadth = sc.nextDouble();
					System.out.print("Enter the height of the cube : ");
					double height = sc.nextDouble();
					Shape shape = new Cube(length, breadth, height);
					shapeArray[i] = shape;
				}break;
				case "sphere" :
				{
					System.out.print("Enter the radius of the sphere : ");
					double radius = sc.nextDouble();
					Shape shape = new Sphere(radius);
					shapeArray[i] = shape;
				}break;
				default :
				{
					System.out.println("Enter the valid input.....");
					System.exit(0);
				}
				
			}//switch
		}//for
		System.out.println();
		for(int i = 0 ; i < shapeArray.length; i++)
		{
			if(!(shapeArray[i] instanceof Spatial))
			{
				System.out.printf("Area : %.2f\n",shapeArray[i].area());
			}else
			{
				System.out.printf("Area : %.2f\n",shapeArray[i].area());
				System.out.printf("Volume : %.2f\n",shapeArray[i].volume());
			}
		}
		
	}//main

}//class
