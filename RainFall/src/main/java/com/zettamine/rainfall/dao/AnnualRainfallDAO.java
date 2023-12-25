package com.zettamine.rainfall.dao;

import java.util.List;

import com.zettamine.rainfall.dto.AnnualRainfall;

public interface AnnualRainfallDAO {

	int addRainfallReport(int pincode, String cityName, double avgRainfall);
	
	List<AnnualRainfall> getMaxRainFall();
}
