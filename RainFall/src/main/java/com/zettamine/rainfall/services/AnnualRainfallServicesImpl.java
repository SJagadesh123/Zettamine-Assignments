package com.zettamine.rainfall.services;

import java.util.List;

import com.zettamine.rainfall.dao.AnnualRainfallDAO;
import com.zettamine.rainfall.dao.AnnualRainfallDAOImpl;
import com.zettamine.rainfall.dto.AnnualRainfall;

public class AnnualRainfallServicesImpl implements AnnualRainfallServices {

	AnnualRainfallDAO dao;
	public AnnualRainfallServicesImpl() {
		dao = new AnnualRainfallDAOImpl();
	}

	@Override
	public void addRainfallReport(List<AnnualRainfall> rainfallList) {

		int i = 0;
		int n = 0;
		while(i<rainfallList.size())
		{
			AnnualRainfall anr = rainfallList.get(i);
			n = n + dao.addRainfallReport(anr.getCityPincode(), anr.getCityName(), anr.getAverageAnnualRainfall());
			i++;
		}
		
		if(n>0)
		{
			System.out.println("Reports added succesfully...");
		}
		else
		{
			System.out.println("..Addition operation aborted..");
		}
	}

	@Override
	public void getMaxRainFall() {
		
		List<AnnualRainfall> maxRainfall = dao.getMaxRainFall();
		
		System.out.println("Cities with highest rainfall are listed below");
		for(AnnualRainfall annualRainfall : maxRainfall)
		{
			System.out.println(annualRainfall);
		}
		
	}


}
