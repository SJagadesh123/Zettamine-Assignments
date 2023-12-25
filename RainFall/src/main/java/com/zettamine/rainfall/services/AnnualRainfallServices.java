package com.zettamine.rainfall.services;

import java.util.List;

import com.zettamine.rainfall.dto.AnnualRainfall;

public interface AnnualRainfallServices {


	void getMaxRainFall();

	void addRainfallReport(List<AnnualRainfall> rainfallList);

}
