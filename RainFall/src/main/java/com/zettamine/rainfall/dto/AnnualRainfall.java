package com.zettamine.rainfall.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AnnualRainfall {

	private int cityPincode;
	private String cityName;
	private double averageAnnualRainfall;
	
	
	public AnnualRainfall(int cityPincode, String cityName) {
		super();
		this.cityPincode = cityPincode;
		this.cityName = cityName;
	}
	
	
	
	
	public void calculateAnnualAverageRainfall(double[] rainfall) {
		
		double avgRainfall = 0;
		for(double rain : rainfall)
		{
			avgRainfall = avgRainfall+rain;
		}
		
		this.averageAnnualRainfall = avgRainfall/rainfall.length;
		
	}




	@Override
	public String toString() {
		
		String str = String.format("%d | %-10s | %.2f",cityPincode,cityName,averageAnnualRainfall);
		return str;
	}
	
}
