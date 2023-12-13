package com.zettamine.task.day6.assignment1;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Library {

	private List<Book> bookList = new ArrayList<Book>();
	
	
	public void addBook(Book obj)
	{
		bookList.add(obj);
	}
	
	public boolean isEmpty()
	{
		return bookList.isEmpty();
	}
	
	public List<Book> viewAllBooks()
	{
		return this.bookList;
	}
	
	public ArrayList<Book> viewBooksByAuthor(String author)
	{
		ArrayList<Book> booksByAuthor = new ArrayList<Book>();
		for(Book book : bookList)
		{
			if(book.getBookAutor().equals(author))
			{
				booksByAuthor.add(book);
			}
		}
		return booksByAuthor;
		
	}
	
	public int countNoOfBook(String bname) 
	{
		int count = 0;
		for(Book book : bookList)
		{
			if(book.getBookTitle().equals(bname))
			{
				count++;
			}
		}
		return count;
	}
}
