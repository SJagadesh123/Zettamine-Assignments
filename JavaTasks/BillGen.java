package demo;

import java.util.Scanner;

public class BillGeneration {

	public static void main(String[] args) {

		int noOfPizza = 0;
		int noOfPuffs = 0;
		int noOfCoolDrinks = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the customer name : ");
		String name = sc.nextLine();
		boolean b = false;
		System.out.println("Hello!! " + name);
		
		while(!b)
		{
			System.out.println("Please choose from the below...");
			System.out.println("1.Pizza");
			System.out.println("2.Puffs");
			System.out.println("3.Cool Drinks");
			System.out.println("4.Exit");
			System.out.print("Enter your choice : ");
			int choice = sc.nextInt();
			
			switch (choice) {
			case 1:
			{
				System.out.print("Enter the no of pizza : ");
				noOfPizza = sc.nextInt();
			}break;
			case 2:
			{
				System.out.print("Enter no of puffs : ");
				noOfPuffs = sc.nextInt();
			}break;
			case 3:
			{
				System.out.print("Enter the no of cool drink : ");
				noOfCoolDrinks =  sc.nextInt();
			}break;
			case 4:
			{
				b = true;
			}break;
			default: System.err.println("Enter the valid input...");
				break;
			}
		}
		
		generateBill(noOfPizza,noOfPuffs,noOfCoolDrinks);

	}

	private static void generateBill(int noOfPizza, int noOfPuffs, int noOfCoolDrinks) 
	{
		int bill = (noOfPizza*100) + (noOfPuffs*20) + (noOfCoolDrinks*10);
		
		System.out.println("Bill Details");
		if(noOfPizza!=0)
		{
			System.out.println("No of Pizzas :\t" + noOfPizza + "\tCost : "+(noOfPizza*100));
		}
		if(noOfPuffs!=0)
		{
			System.out.println("No of Puffs :\t" + noOfPuffs + "\tCost : "+(noOfPuffs*100));
		}
		if(noOfCoolDrinks!=0)
		{
			System.out.println("No of Cool Drinks :" + noOfCoolDrinks + "\tCost : "+(noOfCoolDrinks*100));
		}
		
		System.out.println();
		System.out.println("Total Price : " + bill);
		System.out.println("ENJOY THE SHOW!!!!");
	}

}
