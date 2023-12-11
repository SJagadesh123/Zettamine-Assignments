package com.zettamine.task.day3;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class HostelStudent {

	protected int studentId;
	protected String name;
	protected int departmentId;
	protected String gender;
	protected String phone;
	
}
