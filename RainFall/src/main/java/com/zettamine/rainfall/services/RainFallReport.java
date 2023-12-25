package com.zettamine.rainfall.services;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import com.zettamine.rainfall.dto.AnnualRainfall;

public class RainFallReport {

	public static List<AnnualRainfall> generateRainfallReport(String filePath) {
		List<AnnualRainfall> rainfallReport = new ArrayList<AnnualRainfall>();

		try {
			InputStream fin = new FileInputStream(filePath);
			Reader reader = new InputStreamReader(fin);
			BufferedReader br = new BufferedReader(reader);

			String str;

			while ((str = br.readLine()) != null) {
				String[] rainfallData = str.split(",");

				boolean flag = false;

				while (!flag) {
					if (!validate(rainfallData[0])) {
						try
						{
							throw new InvalidCityPincodeException("Invalid city pincode : " + rainfallData[0]);
						}catch(InvalidCityPincodeException e){
							System.out.println(e.getMessage());
							flag = true;
						}
					} else {
						AnnualRainfall ar = new AnnualRainfall(Integer.parseInt(rainfallData[0]), rainfallData[1]);

						double[] monthlyAvgRainfall = new double[rainfallData.length - 2];

						for (int i = 2; i < rainfallData.length; i++) {
							monthlyAvgRainfall[i - 2] = Double.parseDouble(rainfallData[i]);
						}

						ar.calculateAnnualAverageRainfall(monthlyAvgRainfall);

						rainfallReport.add(ar);
						flag = true;
					}

				}
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return rainfallReport;
	}

	public static boolean validate(String cityPincode) {

		if (cityPincode.matches("[0-9]{5}"))
			return true;

		return false;
	}
}
