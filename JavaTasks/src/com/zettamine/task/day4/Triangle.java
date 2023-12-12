package com.zettamine.task.day4;

public class Triangle extends Shape {

	private double height;
	private double base;
	
	
	public Triangle(double height, double base) {
		super();
		this.height = height;
		this.base = base;
	}

	
	
	public double getHeight() {
		return height;
	}



	public void setHeight(double height) {
		this.height = height;
	}



	public double getBase() {
		return base;
	}



	public void setBase(double base) {
		this.base = base;
	}



	@Override
	public double area() {

		return 0.5 * height * base;
	}


	@Override
	public double volume() {
		return -1;
	}

}
