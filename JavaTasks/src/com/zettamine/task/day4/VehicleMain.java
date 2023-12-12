package com.zettamine.task.day4;

import java.util.Scanner;

public class VehicleMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the vehicle number : ");
		String vehicleNumber = sc.nextLine();
		
		System.out.print("Enter the model name : ");
		String modelName = sc.nextLine();
		
		String vehicleType = null;
		boolean flag = false;
		while(!flag)
		{
			System.out.print("Enter the vehicle type [2/3/4]: ");
			int type = sc.nextInt();
			if(type == 2)
			{
				vehicleType = "2 wheeler";
				flag = true;
			}
			else if(type == 3)
			{
				vehicleType = "3 wheeler";
				flag = true;
			}
			else if(type == 4)
			{
				vehicleType = "4 wheeler";
				flag = true;
			}
			else
			{
				System.out.println("Invalid input.... please try again");
			}
		}
		
		System.out.println("Enter the price : ");
		double price = sc.nextDouble();
		
		Vehicle vehicle = new Vehicle(vehicleNumber, modelName, vehicleType, price);
		
		System.out.printf("The eligible loan amount for vehicle number %s of type %s is : %.2f\n", vehicle.getVehicleNumber().toUpperCase(),
																								vehicle.getVehicleType(), vehicle.issueLoan());
		System.out.printf("Insurance amount for vehicle number %s of type %s is : %.2f\n", vehicle.getVehicleNumber().toUpperCase(), 
																						vehicle.getVehicleType(), vehicle.takeInsurance());
		sc.close();
	}

}
