package com.zettamine.task.day2;

import java.util.Scanner;

public class TicketPriceCalculation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of bookings : ");
		int noOfBookings = sc.nextInt();
		System.out.print("Enter the available tickets : ");
		int noOfAvlTickets = sc.nextInt();
		Tickets.setAvailableTickets(noOfAvlTickets);
		
		
		for(int i =0 ; i < noOfBookings ; i++)
		{
			System.out.print("Enter the ticketid : ");
			int ticketId = sc.nextInt();
			System.out.print("Enter the price : ");
			int price = sc.nextInt();
			System.out.print("Enter no of tickets : ");
			int noOfTickets = sc.nextInt();
			
			Tickets tickets = new Tickets(ticketId, price);
			
			System.out.println("Available tickets : " + Tickets.getAvailableTickets());
			System.out.println("Total amount : " + tickets.calculateTicketCost(noOfTickets));
			System.out.println("Available tickets after booking : " + Tickets.getAvailableTickets());
		}
		
		
		
	}


}
