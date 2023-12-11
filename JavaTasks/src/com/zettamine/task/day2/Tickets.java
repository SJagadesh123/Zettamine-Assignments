package com.zettamine.task.day2;


public class Tickets {

	private int ticketId;
	private int price;
	private static int availableTickets;
	
	
	
	public Tickets(int ticketId, int price) {
		super();
		this.ticketId = ticketId;
		this.price = price;
	}


	public int getTicketId() {
		return ticketId;
	}


	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public static int getAvailableTickets() {
		return availableTickets;
	}


	public static void setAvailableTickets(int availableTickets) {
		
		if(Tickets.availableTickets < 0)
		{
			System.out.println("Invalid no of tickets");
		}
		else
		{
			Tickets.availableTickets = availableTickets;
		}
		
	}
	
	public int calculateTicketCost(int nooftickets) 
	{
		if(Tickets.availableTickets < nooftickets)
		{
			return -1;
		}
		
		Tickets.availableTickets = Tickets.availableTickets - nooftickets;
		return nooftickets*price;
		
	}
	
	
	
	
}
