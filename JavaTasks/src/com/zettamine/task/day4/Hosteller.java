/**
 * This is hosteller class which holds hostel name , room number and object of student as part of composition and its corresponding getter setter methods
 * a constructor of Hosteller is created with
 * @param String hostelName, int roomNumber, HostelStudent student 
 */

package com.zettamine.task.day4;

public class Hosteller 
{
	private String hostelName;
	private int roomNumber;
	private HostelStudent student;
	
	
	public Hosteller(String hostelName, int roomNumber, HostelStudent student) {
		super();
		this.hostelName = hostelName;
		this.roomNumber = roomNumber;
		this.student = student;
	}


	public String getHostelName() {
		return hostelName;
	}


	public void setHostelName(String hostelName) {
		this.hostelName = hostelName;
	}


	public int getRoomNumber() {
		return roomNumber;
	}


	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}


	public HostelStudent getStudent() {
		return student;
	}


	public void setStudent(HostelStudent student) {
		this.student = student;
	}
	
	
	
	
	
	
	
}
