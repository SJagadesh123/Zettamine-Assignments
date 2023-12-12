package com.zettamine.task.day4;

public class Vehicle implements Loan, Insurance 
{
	private String vehicleNumber;
    private String modelName;
    private String vehicleType;
    private double price;
    
	
	public Vehicle(String vehicleNumber, String modelName, String vehicleType, double price) {
		super();
		this.vehicleNumber = vehicleNumber;
		this.modelName = modelName;
		this.vehicleType = vehicleType;
		this.price = price;
	}
	
	
	public String getVehicleNumber() {
		return vehicleNumber;
	}

	
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public double takeInsurance() {
		if(this.price <= 150000) return 3500;
		else if(this.price > 150000 && this.price <= 300000) return 4000;
		else return 5000;
		
	}

	@Override
	public double issueLoan() {
		
		if(vehicleType.equals("4 wheeler"))
		{
			return 0.8 * price;
		}
		else if(vehicleType.equals("3 wheeler"))
		{
			return 0.75 * price;
		}
		else
		{
			return 0.5 * price;
		}
	}

}
