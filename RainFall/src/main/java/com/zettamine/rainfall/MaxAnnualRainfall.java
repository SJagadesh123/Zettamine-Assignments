package com.zettamine.rainfall;

import com.zettamine.rainfall.services.AnnualRainfallServices;
import com.zettamine.rainfall.services.AnnualRainfallServicesImpl;
import com.zettamine.rainfall.services.RainFallReport;

public class MaxAnnualRainfall {

	public static void main(String[] args) {

		AnnualRainfallServices services = new AnnualRainfallServicesImpl();
		
		services.addRainfallReport(RainFallReport.generateRainfallReport("D:\\JavaWorkSpace\\RainFall\\src\\main\\resources\\AllCityMonthlyRainfall.txt"));
		
		services.getMaxRainFall();
	}

}
