package com.zettamine.task.day6.assignment2;

import java.util.List;
import java.util.Scanner;

public class PhoneBookApp {

	public static void main(String[] args) {

		PhoneBook phone = new PhoneBook();
		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		
		while(!flag)
		{
			System.out.println("1. Add Contact");
			System.out.println("2. Display all Contact Details");
			System.out.println("3. Search Contact by phone ");
			System.out.println("4. Remove Contact");
			System.out.println("5. Exit");
			System.out.print("Enter your choice : ");
			int choice = sc.nextInt();
			switch(choice)
			{
				case 1:{
					System.out.print("Enter First name : ");
					String fname = sc.next();
					System.out.print("Enter last name : ");
					String lname = sc.next();
					System.out.print("Enter the phone number : ");
					long phnNo = sc.nextLong();
					
					
					int i = 1;
					while(i>0)
					{
						System.out.println("Enter the email Id : ");
						String email = sc.next();
						if(email.matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$"))
						{
							phone.addContact(new Contact(fname, lname, phnNo, email));
							i = 0;
						}
						else
						{
							System.out.println("Invalid input.....");
						}
					}
					
					
				}break;
				case 2:{
					if(phone.isEmpty())
					{
						System.out.println("No contacts are available....");
					}
					else
					{
						List<Contact> contact = phone.viewAllContacts();
						for(Contact b : contact)
						{
							System.out.println("First Name : " + b.getFirstName()+
												" | Last Name : " + b.getLastName() +
												" | Phone No. : " + b.getPhoneNumber() + 
												" | Email : " + b.getEmailId());
						}
					}
				}break;
				case 3:{
					sc.nextLine();
					System.out.print("Enter the phone number : ");
					long phnNo = sc.nextLong();
					List<Contact> contact = phone.viewContactByPhoneNo(phnNo);
					if(contact.size()==0)
					{
						System.out.println("None of the contact with number "+phnNo);
					}
					else
					{
						for(Contact b : contact)
						{
							System.out.println("First Name : " + b.getFirstName()+
									" | Last Name : " + b.getLastName() +
									" | Phone No. : " + b.getPhoneNumber() + 
									" | Email : " + b.getEmailId());
						}
					}	
				}break;
				case 4:{
					sc.nextLine();
					System.out.print("Enter the phone number : ");
					long phnNo = sc.nextLong();
					System.out.println("Do you want to remove the contact(y/n) : ");
					String ch = sc.next();
					if(ch.equalsIgnoreCase("y"))
					{
						if(!phone.removeContact(phnNo))
						{
							System.out.println("No such contact present with "+phnNo);
						}
						else
						{
							System.out.println("The contact is successfully deleted");
						}
					}
				}break;
				case 5:{
					flag = true;
				}break;
				default: System.out.println("Enter the valid input....");
				
			}//switch
		}//while
		
		sc.close();
	}

}
