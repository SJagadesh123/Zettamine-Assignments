package com.zettamine.rainfall.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.zettamine.rainfall.config.ConnectionFactory;
import com.zettamine.rainfall.dto.AnnualRainfall;

public class AnnualRainfallDAOImpl implements AnnualRainfallDAO {

	Connection con = ConnectionFactory.getConnection();
	Statement st;

	public AnnualRainfallDAOImpl() {
		try {
			st = con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public int addRainfallReport(int pincode, String cityName, double avgRainfall) {
		
		int rowsAffected = 0;
		String sql = "insert into annual_rainfall values(" + pincode + ",'" + cityName + "'," + avgRainfall + ")";

		try {
			rowsAffected = st.executeUpdate(sql);
		} catch (SQLException e) {
			e.getCause();
		}
		return rowsAffected;
	}

	@Override
	public List<AnnualRainfall> getMaxRainFall() {
		
		 List<AnnualRainfall> maxRainfall = new ArrayList<AnnualRainfall>();
		 
		 String sql = "select * from annual_rainfall "
		 		+ "where average_annual_rainfall in "
		 		+ "(select max(average_annual_rainfall) from annual_rainfall)";
		 
		 try {
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next())
			{
				AnnualRainfall anr = new AnnualRainfall(rs.getInt(1),rs.getString(2),rs.getDouble(3));
				maxRainfall.add(anr);
			}
			
			
		} catch (SQLException e) {
			System.out.println(e.getCause());
		}
		 
		return maxRainfall;
	}

}
