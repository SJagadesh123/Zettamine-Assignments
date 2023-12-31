package com.zettamine.task.day3;

public class Hosteller extends HostelStudent {
	
	private String hostelName;
	private int roomNumber;


	public Hosteller(int studentId, String name, int departmentId, String gender, String phone, String hostelName,
			int roomNumber) {
		super(studentId, name, departmentId, gender, phone);
		this.hostelName = hostelName;
		this.roomNumber = roomNumber;
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


	@Override
	public String toString() {
		return "Hosteller [hostelName=" + hostelName + ", roomNumber=" + roomNumber + ", studentId=" + studentId
				+ ", name=" + name + ", departmentId=" + departmentId + ", gender=" + gender + ", phone=" + phone + "]";
	}
	
	
	
	
	
	

}
