package com.zettamine.task.day3;

import java.util.Scanner;

public class HostellerMain {

	static Scanner sc = new Scanner(System.in);
			
	public static void main(String[] args) {

		boolean flag = false;
		Hosteller hosteller = getHostellerDetails();
		
		while(!flag)
		{
			System.out.print("Modify Room Number(Y/N) : ");
			String res = sc.next();
			if(res.matches("[YyNn]"))
			{
				if(res.equalsIgnoreCase("y"))
				{
					System.out.println("New Room Number : ");
					hosteller.setRoomNumber(sc.nextInt());
				}
				
				flag = true;
			}
			else
			{
				System.out.println("Enter the valid input");
			}
		}//end of while
		
		while(flag)
		{
			System.out.print("Modify Phone Number(Y/N) : ");
			String res = sc.next();
			if(res.matches("[YyNn]"))
			{
				if(res.equalsIgnoreCase("y"))
				{
					
					int i = 1;
					while(i>0)
					{
						System.out.println("New Phone Number : ");
						String phNo = sc.next(); 
						if(phNo.matches("^[6-9]\\d{9}"))
						{
							hosteller.setPhone(phNo);
							i = 0;
							
						}
						else
							System.err.println("Invalid Data");
					}
				}
				
				flag = false;
			}
			else
			{
				System.out.println("Enter the valid input");
			}
		}//end of while
		
		getDetails(hosteller);
	}

	public static Hosteller getHostellerDetails()
	{
		boolean flag = false;
		System.out.println("Enter the Student Details & Hostel Details :");
		System.out.print("Student ID : ");
		int stuId = sc.nextInt();
		
		System.out.print("Student Name : ");
		String stuName = sc.next();
		
		System.out.print("Department ID : ");
		int deptId = sc.nextInt();
		
		String gender = null;
		while(!flag)
		{
			System.out.print("Gender[M/F] : ");
		    gender = sc.next();
			
			if(gender.matches("[mMfF]"))
			{
				if(gender.equalsIgnoreCase("m"))
				{
					gender = "Male";
				}
				else
				{
					gender = "Female";
				}
				flag = true;
			}
			else
			{
				System.out.println("Enter the valid input");
			}
		}//end while
		
		String phNo = null;
		while(flag)
		{
			System.out.print("Phone Number : ");
			phNo = sc.next();
			if(phNo.matches("^[6-9]\\d{9}"))
			{
				flag = false;
			}
			else
				System.err.println("Invalid Data");
		}
		System.out.print("Hostel Name : ");
		String hstlName = sc.next();
		System.out.print("Room Number : ");
		int roomNo = sc.nextInt();
		return new Hosteller(stuId, stuName, deptId, gender, phNo, hstlName, roomNo);
		
	}
	
	private static void getDetails(Hosteller hosteller) {
		System.out.println();
		System.out.println("~".repeat(30));
		System.out.println("The Student Details are as follows :");
		
		System.out.println("Student ID : " + hosteller.getStudentId());
		System.out.println("Student Name : "+ hosteller.getName());
		System.out.println("Department ID : " + hosteller.getDepartmentId());
		System.out.println("Student Gender : " + hosteller.getGender());
		System.out.println("Student Phone Number : " + hosteller.getPhone());
		System.out.println("Hostel Name : " + hosteller.getHostelName());
		System.out.println("Room No : " + hosteller.getRoomNumber());
		
		
	}

}
