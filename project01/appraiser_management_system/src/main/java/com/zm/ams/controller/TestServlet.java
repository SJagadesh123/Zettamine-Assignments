package com.zm.ams.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import com.zm.ams.config.ConnectionFactory;
import com.zm.ams.dao.AmsDao;
import com.zm.ams.dao.jdbc.impl.AmcAppraisalLocDaoImpl;
import com.zm.ams.dao.jdbc.impl.AmcDaoImpl;
import com.zm.ams.dto.AmcSearchCriteria;
import com.zm.ams.dto.AppraisalManagementCompany;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	
    
    public TestServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		AmsDao<AppraisalManagementCompany, AmcSearchCriteria> amc = new  AmcDaoImpl();
		
		String amcName = request.getParameter("amc");
		String responseText = "";
		
		PrintWriter out = response.getWriter();
		try {
			List<AppraisalManagementCompany> searchResult = amc.getBySearchCriteria(new AmcSearchCriteria(amcName, null, null));
			
			if(searchResult.size()!=0)
			{
				response.setContentType("application/json");
				
				JSONObject jObj = new JSONObject();
				
				
				JSONArray jArray = new JSONArray();
				
				
			}
			else
			{
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
