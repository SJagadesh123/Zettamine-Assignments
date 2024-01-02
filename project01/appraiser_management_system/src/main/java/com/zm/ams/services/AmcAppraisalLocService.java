package com.zm.ams.services;

import java.sql.SQLException;

import com.zm.ams.dto.AmcAppraisalLoc;

public interface AmcAppraisalLocService {

	void save(AmcAppraisalLoc amcAppraisalLoc) throws SQLException;

	boolean isExist(AmcAppraisalLoc amcAppraisalLoc) throws SQLException;
}
