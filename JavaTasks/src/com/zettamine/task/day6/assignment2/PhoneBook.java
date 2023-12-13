package com.zettamine.task.day6.assignment2;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class PhoneBook {

	private List<Contact> contactList = new ArrayList<Contact>();
	
	
	public void addContact(Contact obj)
	{
		contactList.add(obj);
	}
	
	public boolean isEmpty()
	{
		return contactList.isEmpty();
	}
	
	public List<Contact> viewAllContacts()
	{
		return this.contactList;
	}
	
	public ArrayList<Contact> viewContactByPhoneNo(long phoneNumber)
	{
		ArrayList<Contact> contactByPhn = new ArrayList<Contact>();
		for(Contact contact : contactList)
		{
			if(contact.getPhoneNumber()== phoneNumber)
			{
				contactByPhn.add(contact);
			}
		}
		return contactByPhn;
		
	}
	
	public boolean removeContact(long phoneNumber)
	{
		for(Contact contact : contactList)
		{
			if(contact.getPhoneNumber()== phoneNumber)
			{
				return contactList.remove(contact);
			}
		}
		return false;
		
	}
}
