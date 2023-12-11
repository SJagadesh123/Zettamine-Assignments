package com.zettamine.task.day3;

public class Student {

	private String studentId;
	private String studentName;
	private String studentEmail;
	private static String collegeName;
	private static int count = 0; 
	
	static
	{
		collegeName = "Zettamine";
	}
	
	{
		int id = 101 + count++;
		studentId = "ZETTA_" + id;
	}

	public Student(String studentName, String studentEmail) {
		super();
		this.studentName = studentName;
		this.studentEmail = studentEmail;
	}

	@Override
	public String toString() {
		return String.format("%-10s | %-20s | %-20s | %-10s", studentId , studentName , studentEmail , collegeName);
	}
	

}
