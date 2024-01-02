package com.zm.ams.services.impl;

import java.sql.SQLException;

import com.zm.ams.dao.AmsDao;
import com.zm.ams.dao.jdbc.impl.AppraisalLocDAOImpl;
import com.zm.ams.dto.AppraisalLoc;
import com.zm.ams.services.AppraisalLocService;

public class AppraisalLocServiceImpl implements AppraisalLocService {

	AmsDao dao = new AppraisalLocDAOImpl();
	@Override
	public int save(AppraisalLoc amcAppraisalLoc) throws SQLException {
		int id = 0;
		if(isExist(amcAppraisalLoc))
		{
			System.out.println("if");
			id = dao.getId(amcAppraisalLoc);
			
		}
		else
		{
			System.out.println("else");
			dao.save(amcAppraisalLoc);
			id = dao.getId(amcAppraisalLoc);
		}
		
		return id;
		
	}
	@Override
	public boolean isExist(AppraisalLoc amcAppraisalLoc) throws SQLException {
		
		return dao.isExist(amcAppraisalLoc);
	}

	

}
