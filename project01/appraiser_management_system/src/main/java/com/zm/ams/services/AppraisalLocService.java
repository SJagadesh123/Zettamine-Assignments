package com.zm.ams.services;

import java.sql.SQLException;

import com.zm.ams.dto.AppraisalLoc;

public interface AppraisalLocService {

	int save(AppraisalLoc amcAppraisalLoc) throws SQLException;
	
	boolean isExist(AppraisalLoc amcAppraisalLoc) throws SQLException;

}
