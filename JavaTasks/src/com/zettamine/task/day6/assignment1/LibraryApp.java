package com.zettamine.task.day6.assignment1;

import java.util.List;
import java.util.Scanner;

public class LibraryApp {

	public static void main(String[] args) {

		Library lib = new Library();
		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		
		while(!flag)
		{
			System.out.println("1. Add Book");
			System.out.println("2. Display all Book Details");
			System.out.println("3. Search Book by Author ");
			System.out.println("4. Count Number of books - by book name");
			System.out.println("5. Exit");
			System.out.print("Enter your choice : ");
			int choice = sc.nextInt();
			switch(choice)
			{
				case 1:{
					System.out.print("Enter book no : ");
					long bNo = sc.nextLong();
					sc.nextLine();
					System.out.print("Enter book name : ");
					String bName = sc.nextLine();
					System.out.print("Enter author name : ");
					String author = sc.nextLine();
					
					lib.addBook(new Book(bNo, bName, author));
				}break;
				case 2:{
					if(lib.isEmpty())
					{
						System.out.println("No Books are available....");
					}
					else
					{
						List<Book> book = lib.viewAllBooks();
						for(Book b : book)
						{
							System.out.println("Book no : " + b.getBnNo() + " | " +
												"Book Name : " + b.getBookTitle() + " | " + 
												"Author : " + b.getBookAutor() + " | ");
						}
					}
				}break;
				case 3:{
					sc.nextLine();
					System.out.print("Enter the author name : ");
					String author = sc.nextLine();
					List<Book> book = lib.viewBooksByAuthor(author);
					if(book.size()==0)
					{
						System.out.println("None of the book published by the author Henry");
					}
					else
					{
						for(Book b : book)
						{
							System.out.println("Book no : " + b.getBnNo() + " | " +
												"Book Name : " + b.getBookTitle() + " | " + 
												"Author : " + b.getBookAutor() + " | ");
						}
					}	
				}break;
				case 4:{
					sc.nextLine();
					System.out.print("Enter the book name : ");
					String bookName = sc.nextLine();
					System.out.println("The count of book name " + bookName + " is " + lib.countNoOfBook(bookName));
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
