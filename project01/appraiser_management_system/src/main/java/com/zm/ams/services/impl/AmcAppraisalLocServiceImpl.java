package com.zm.ams.services.impl;

import java.sql.SQLException;

import com.zm.ams.dao.AmsDao;
import com.zm.ams.dao.jdbc.impl.AmcAppraisalLocDaoImpl;
import com.zm.ams.dto.AmcAppraisalLoc;
import com.zm.ams.dto.AmcSearchCriteria;
import com.zm.ams.dto.SearchCriteria;
import com.zm.ams.dto.ValidDto;
import com.zm.ams.services.AmcAppraisalLocService;

public class AmcAppraisalLocServiceImpl implements AmcAppraisalLocService {

	
	AmsDao dao = new AmcAppraisalLocDaoImpl();
	
	@Override
	public void save(AmcAppraisalLoc amcAppraisalLoc) throws SQLException {
		
		dao.save(amcAppraisalLoc);
	}

	@Override
	public boolean isExist(AmcAppraisalLoc amcAppraisalLoc) throws SQLException {
		return dao.isExist(amcAppraisalLoc);
	}

}
